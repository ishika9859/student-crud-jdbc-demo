package school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionDB {
  private static String url = "jdbc:postgresql://localhost:5432/student_db";
  private static String username = "postgres";
  private static String password = "Ishik@the1";

  public static Connection getConnection() {

    try {
      return DriverManager.getConnection(url, username, password);
    } catch (SQLException e) {
      throw new RuntimeException();
    }
  }

}
