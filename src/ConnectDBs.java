import java.sql.*;

public class ConnectDBs {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_cars"; // local host보다는 ip주소로 하기
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password); 
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();
            String query ="SELECT * FROM factorys;";
            ResultSet resultSet = statement.executeQuery(query); 
            while(resultSet.next()){
                System.out.println( resultSet.getString("COMPANY_ID")+" "+resultSet.getString("COMPANY"));
            }

            //SELECT COUNT(*) AS CNT FROM factorys;
            query ="SELECT COUNT(*) AS CNT FROM factorys;";
            resultSet = statement.executeQuery(query); 
            int totalCont = 0;
            while(resultSet.next()){
                 System.out.println(resultSet.getInt("CNT"));
                 totalCont = resultSet.getInt("CNT");
            }
            
            // INSERT INTO factorys (COMPANY_ID, COMPANY) VALUE('CAR-01','AUDI');
            String companyID ="CAR-01";
            String company = "AUDI";
            query = "INSERT INTO factorys " + //문법오류 방지 : space 확인하기 명령어와 문장사이 끝에 space 넣기 
                    "(COMPANY_ID, COMPANY)" +
                    "VALUE " +
                    "('"+companyID+"','"+company+"')"; //변수로 넣은 상태로 입력하기, ' 꼭 넣기 
            int count = statement.executeUpdate(query); //insert , delete, update 할때는 executeUpdate / 동작이 되었는지 확인하기 위한 count
           
            
            //update factorys SET COMPANY ='페라리' WHERE COMPANY_ID ='CAR-01';
            String upcompany ="페라리";
            query = "UPDATE factorys "+
                    "SET COMPANY ='" + upcompany + "'"+
                    "WHERE COMPANY_ID = '" + companyID + "'";
            count = statement.executeUpdate(query); 

            //delete from factorys WHERE COMPANY_ID ='CAR-01';
            query = "DELETE FROM factories WHERE COMPANY_ID = '" + companyID + "'";
            count = statement.executeUpdate(query); 
            

            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
    
}
