package JDBC;

import Utilities.DBUtilities;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AbsoluteandRelative extends DBUtilities {

    @Test
    public void Test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from film");
        rs.absolute(10); //takes us to the 10th row right away

        String title = rs.getString("title");
        System.out.println("title from the 10th row = " + title);

        rs.absolute(15); // jumps to the 15th row
        title = rs.getString("title");
        System.out.println("title from the 15th row = " + title);

        rs.absolute(3);
        title = rs.getString("title"); // jumps to the 3rd row
        System.out.println("title from the 3rd row = " + title);

        rs.relative(20); // moves 20 rows from the current position
        title = rs.getString("title");
        System.out.println("title from the 23rd row = " + title);

        rs.relative(-14);
        title = rs.getString("title");
        System.out.println("title from the 9th row " + title);

        rs.absolute(-2);
        title = rs.getString("title");
        System.out.println("title from the 999th row " + title);



























    }
}
