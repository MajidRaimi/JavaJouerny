import java.util.*;
import java.sql.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        clearScreen();
        String username = "root";
        String password = "12341234";
        String databaseName = "javatest";
        String url = "jdbc:mysql://localhost:3306/" + databaseName;

        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<Student> studentsArr = new ArrayList<Student>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();

            resultSet = statement.executeQuery("select * from Students ;");



            while (resultSet.next()) {
                String studentId = resultSet.getString("studentId");
                String studentName = resultSet.getString("studentName");

                studentsArr.add(new Student(studentId, studentName));

            } // CRUD 

        } catch (Exception e) {
            System.out.println("Could Not Work");
        }


        for(int i = 0 ; i < studentsArr.size() ; i++){
            System.out.println("Student Id : " + studentsArr.get(i).getId() + " Student Name : " + studentsArr.get(i).getName());
        }


    }

    public static void clearScreen() {
        // Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }

        } catch (Exception ex) {
        }
    }
}
