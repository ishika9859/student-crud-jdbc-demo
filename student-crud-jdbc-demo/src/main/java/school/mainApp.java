package school;
public class mainApp {
  public static void main(String[] args) {
    studentDAO dao = new studentDAO();
    studentPOJO s1 = new studentPOJO("Ishika" , "ishik@gmail.com" , 98 , "female");

    dao.addStudent(s1);
    dao.updateStudentMark(90, 2);
    dao.getAllStudnets();
    // dao.deleteStudent(505);
  }
}
