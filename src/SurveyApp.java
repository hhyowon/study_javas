import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
surveyapp
*/
public class SurveyApp {
    
    public static void main(String[] args) {
        
        try {// - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_survey";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();

            System.out.println("---통계---");
            // -- 총 설문자 : 3명
            String queryB = "SELECT COUNT(*) CNT\n" + //
                    "FROM (\n" + //
                    "\tSELECT RESPONDENTS_ID, COUNT(*) CNT\n" + //
                    "\tFROM statistics\n" + //
                    "\tgroup by RESPONDENTS_ID\n" + //
                    "     ) AS T_STATIC\n";
            ResultSet resultSet = statement.executeQuery(queryB);
            while (resultSet.next()) {
                System.out.println("총 설문자 : " + resultSet.getString("CNT")+"명");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }
    }
}
