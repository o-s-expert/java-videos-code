package expert.os.books.architecture.patterns.scenario01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OrderProcessor {

    public void process(Order order) {
        try {
            // Raw DB connection mixed with business rules (JDBC)
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db", "user", "pass");
            // Process logic...

            // Sending email via hardcoded API...
        } catch (SQLException e) {
            // Handling infrastructure exceptions directly in business logic
        }
    }
}
