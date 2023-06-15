import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        try {
            // Database connection setup
            String url = "jdbc:mysql://localhost:3306/pollswithdb";
            String user = "root";
            String password = "!yojulab*";
            Connection connection = DriverManager.getConnection(url, user, password);

            // Statements
            Statement statement = connection.createStatement();
            Statement statement2 = connection.createStatement();

            // Initialize variables
            String query = "";
            String workkey = "";
            String surveyNumber = "";
            Scanner scanner = new Scanner(System.in);
            int totalRespondents = 0;
            HashMap<String, String> surveyMap = new HashMap<>();

            while (!workkey.equals("E")) {
                System.out.print("선택 입력: ");
                workkey = scanner.nextLine();

                if (workkey.equals("P")) {
                    // List of interviewees
                    System.out.println("설문 가능 명단");
                    query = "SELECT * FROM user";
                    ResultSet resultSet = statement.executeQuery(query);

                    int number = 1;
                    while (resultSet.next()) {
                        String intervieweeName = resultSet.getString("USER_NAME");
                        System.out.println(number + ". " + intervieweeName);
                        surveyMap.put(String.valueOf(number), intervieweeName);
                        number++;
                    }

                    // Enter surveyor number
                    System.out.print("설문자 번호 입력: ");
                    surveyNumber = scanner.nextLine();

                    if (surveyMap.containsKey(surveyNumber)) {
                        // Delete previous survey
                        query = "DELETE FROM statistics WHERE USER_NAME_ID = '" + surveyNumber + "'";
                        statement2.executeUpdate(query);

                        // Start survey
                        System.out.println("-- 설문 시작 --");

                        // Survey questions
                        String[] questions = {
                            "교수는 수업 전 강의 목표를 명확히 제시하였습니까?",
                            "강의의 내용은 체계적이고 성의있게 구성되었는가?",
                            "교수는 강의 내용에 대해 전문적 지식이 있었는가?",
                            "강의 진행 속도는 적절하였는가?"
                        };

                        for (int i = 0; i < questions.length; i++) {
                            System.out.println((i + 1) + ". " + questions[i]);
                            System.out.print("(1) 전혀 아니다. (2) 아니다. (3) 그렇다. (4) 매우 그렇다.\nAnswer) ");
                            String answer = scanner.nextLine();

                            // Save survey response
                            query = "INSERT INTO statistics (QUESTION_ID, ANSWER_ID, USER_NAME_ID) VALUES " +
                                    "('" + surveyNumber + "', " + (i + 1) + ", " + answer + ")";
                            statement2.executeUpdate(query);
                        }
                    } else {
                        System.out.println("-Error- 확인 후 입력 필요");
                        System.out.print("설문자 번호 입력: ");
                        surveyNumber = scanner.nextLine();
                    }
                } else if (workkey.equals("S") || workkey.equalsIgnoreCase("Statistic")) {
                    // Survey statistics
                    System.out.println("-- Survey Statistics");
                    query = "SELECT COUNT(DISTINCT survey_number) AS total_respondents FROM survey_results";
                    ResultSet resultSet = statement.executeQuery(query);
                    if (resultSet.next()) {
                        totalRespondents = resultSet.getInt("total_respondents");
                    }
                    System.out.println("-- Total number of respondents: " + totalRespondents);

                    String[] questions = {
                        "교수는 수업 전 강의 목표를 명확히 제시하였습니까?",
                        "강의의 내용은 체계적이고 성의있게 구성되었는가?",
                        "교수는 강의 내용에 대해 전문적 지식이 있었는가?",
                        "강의 진행 속도는 적절하였는가?"
                    };

                    for (int i = 0; i < questions.length; i++) {
                        String questionNumber = String.valueOf(i + 1);
                        System.out.println(questionNumber + ". " + questions[i]);

                        // Retrieve answer counts for each option
                        query = "SELECT answer, COUNT(*) AS count FROM survey_results " +
                                "WHERE question_number = " + questionNumber +
                                " GROUP BY answer";
                        ResultSet result = statement2.executeQuery(query);
                        HashMap<String, Integer> answerCounts = new HashMap<>();
                        while (result.next()) {
                            String answer = result.getString("answer");
                            int count = result.getInt("count");
                            answerCounts.put(answer, count);
                        }

                        // Print answer counts
                        for (String answer : answerCounts.keySet()) {
                            System.out.println("(" + answer + ") " + getAnswerText(answer) +
                                    " --> " + answerCounts.get(answer));
                        }
                    }
                } else {
                    System.out.println("Invalid work key: " + workkey);
                }
            }

            System.out.println("----- 설문 종료 -----");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static String getAnswerText(String answer) {
        return null;
    }
}