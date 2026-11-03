package school;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class studentDAO {
  
  //INSERTING
  public void addStudent(studentPOJO s) {

    String sql = "INSERT INTO student (name, email, marks, gender) VALUES('" +
        s.getName() + "','" +
        s.getEmail() + "','" +
        s.getMarks() + "','" +
        s.getGender() +
        "')";
    try (Connection con = connectionDB.getConnection();) {
      Statement stm = con.createStatement();

      int row = stm.executeUpdate(sql);
      if(row>0){
        System.out.println("Student added successfully");
      }

      stm.close();

    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

  //UPDATING
  public void updateStudentMark(int newMark , int id){

    String sql = "UPDATE student SET marks = " + newMark + " WHERE id = " + id ; 

    try (Connection con = connectionDB.getConnection();) {
      Statement stm = con.createStatement();

      int row = stm.executeUpdate(sql);
      if(row>0){
        System.out.println("Student updated successfully");
      }

      stm.close();

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  
  //DELETE
  public void deleteStudent(int id){

    String sql = "DELETE FROM student WHERE id=" + id ; 

    try (Connection con = connectionDB.getConnection()) {
      Statement stm = con.createStatement();

      int row = stm.executeUpdate(sql);
      if(row>0){
        System.out.println("Student deleted successfully");
      }

      stm.close();

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  //SELECT
  public void getAllStudnets(){

    String sql = "SELECT * FROM student" ; 

    try (Connection con = connectionDB.getConnection();) {
      Statement stm = con.createStatement();

      ResultSet rs = stm.executeQuery(sql);
      while(rs.next()){
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String email = rs.getString("email");
        int marks = rs.getInt("marks");
        String gender = rs.getString("gender");

        System.out.println("---------------------------------------");
        System.out.println("ID : "+ id);
        System.out.println("Name : "+ name);
        System.out.println("Email : "+ email);
        System.out.println("Marks : "+ marks);
        System.out.println("Gender : "+ gender);
        System.out.println("---------------------------------------");
      }

      stm.close();
      con.close();

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
