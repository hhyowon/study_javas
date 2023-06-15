package cars;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AnyStatements {

    public ResultSet selectstatement(Statemnet statemt, String qy) throws SQLException
    {
        ResultSet resultSet = statemt.executeQuery(qy);
        return resultSet;
    }

    public ResultSet selectstatement(Statement statement, String query) {
        return null;
    }
    
}
