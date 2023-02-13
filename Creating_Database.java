import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Creating_Database {
    
    public static void main(String[] args) {
        
        // lab1 establishing connection with mysql server

        try{
            // step1 : Load the Driver

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Step2 : Create the connection Object

            // String connectionURL = "jdbc:mysql://localhost/booksdb";

            // Connection conn = DriverManger.getConnection(connectionURL, "root","<passwordhere>");

            // Step3: Prepare the insert Statement.

            int bid = 102;
            String bookTitle = "Sql Essentials";
            String author = "Jerry Rig";
            int price = 295;

            String insertQuery = String.format("insert into books(%d, '%s', '%s', %d)", bid, bookTitle, author,price);

            System.out.println(insertQuery);

            // Step4: Create the statement Interface Object
            // It is used to execute query,

            // Statement stmt = conn.createstatement();

            // stmt.execute(industryQuery); // .eecute query.
            //stmt.close();
        }
    }
}
