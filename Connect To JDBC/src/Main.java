import java.sql.*;
import java.awt.*;
import java.util.*;

public class Main {

    static Connection connect = null;

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://127.0.0.1:3306/db_example?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&serverTimezone=GMT";
            connect = DriverManager.getConnection(URL, "root", "1234");
            System.out.println("Working");
        } catch (Exception e) {
            System.out.println(e);

        }

    }

}