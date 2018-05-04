package prode;

import org.javalite.activejdbc.Base;

import prode.User;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        // Improve it and delete user name for db connector
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://127.0.0.1/prode?nullNamePatternMatchesAll=true", "lio", "password");

        User u = new User();
        u.set("username", "Riquelme");
        u.set("password", "password");
        u.saveIt();

        Base.close();

        System.out.println( "Hello World!" );
    }
}
