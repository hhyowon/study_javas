package surveys;

import java.sql.ResultSet;
import java.sql.Statement;


public class Statistics {
    public int getRespondents(Statement statement){
        try {
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
        }
        return 0;
    }
}