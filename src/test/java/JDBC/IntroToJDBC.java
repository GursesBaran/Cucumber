package JDBC;

import org.testng.annotations.Test;

public class IntroToJDBC {

    @Test
    public void Test1(){
        String url = "jdbc:mysql//db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        // url contains type of connection(jdbc), type of database(mysql), url to remote server that our database is stored
        // port number of our database, name of the database.

        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z"; //    '"-LhCB'.%k[4S]z

    }
}
