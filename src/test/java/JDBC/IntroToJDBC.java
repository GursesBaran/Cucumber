package JDBC;

import org.testng.annotations.Test;

import java.sql.*;

public class IntroToJDBC {

    @Test
    public void Test1() throws SQLException {
        String url = "jdbc:mysql//db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        // url contains type of connection(jdbc), type of database(mysql), url to remote server that our database is stored
        // port number of our database, name of the database.

        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z"; //    '"-LhCB'.%k[4S]z

        Connection connection = DriverManager.getConnection(url,username,password); // Creates a connection to the database

        Statement statement = connection.createStatement(); // Creates a Statement to run our queries

        ResultSet rs = statement.executeQuery("select * from actor"); // executes the query and gets the entire result and returns it as a ResultSet object

        rs.next(); // moves onto the first row

        String firstname = rs.getString(2); // gets the value from the 2nd column. Index starts from 1
        System.out.println("firstname = " + firstname);

        String lastname = rs.getString(3);
        System.out.println("lastname = " + lastname);

        rs.next(); // moves to the next row
        String firstname1 = rs.getString(2);
        System.out.println("firstname1 = " + firstname1);

        String lastname1 = rs.getString(3);
        System.out.println("lastname1 = " + lastname1);

        connection.close(); // Don't forget to close the connection
    }
}

