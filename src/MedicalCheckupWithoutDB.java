import java.util.ArrayList;
import java.util.HashMap;

public class MedicalCheckupWithoutDB {
//  - refer : Excel_MedicalCheckup/MedicalCheckup_오상훈
//  - 변수 이름 Refer : ERD
//  - ArrayList와 HashMap 활용해 입력과 출력하기
        public static void main(String[] args) {
            ArrayList<HashMap<String, String>> MedicalCheckupList = new ArrayList<HashMap<String, String>>();

            try {
                HashMap<String, String> medicalCheckupHM = MedicalCheckupEntry("홍길동", "남성", "30", "75", "175", "120/80", "90", "이상", "폐암, 갑상선 질환", "");
            MedicalCheckupList.add(medicalCheckupHM);
            
            medicalCheckupHM = MedicalCheckupEntry("김영희", "여성", "25", "160", "55", "110/70", "85", "이상", "간암, 뇌졸중", "");
            MedicalCheckupList.add(medicalCheckupHM);
            
            medicalCheckupHM = MedicalCheckupEntry("박철수", "남성", "45", "180", "85", "130/85", "100", "정상", "심장질환", "식습관 개선, 운동 계획");
            MedicalCheckupList.add(medicalCheckupHM);
            
            medicalCheckupHM = MedicalCheckupEntry("이지은", "여성", "35", "165", "60", "115/75", "95", "이상", "간암, 알츠하이머 병", "");
            MedicalCheckupList.add(medicalCheckupHM);
            
            medicalCheckupHM = MedicalCheckupEntry("최민호", "남성", "28", "170", "70", "125/80", "92", "정상", "간암", "");
            MedicalCheckupList.add(medicalCheckupHM);

            for(HashMap<String, String> Medical:MedicalCheckupList){
                System.out.println(Medical.get("이름") +", " + Medical.get("성별") + ", " + Medical.get("나이") 
                +", " + Medical.get("키 (cm)")+", " + Medical.get("혈압 (mmHg)")+", " +", " +Medical.get("혈당 (mg/dL)")+", " + Medical.get("검진결과")+", " + Medical.get("재검진 항목")+", " + Medical.get("유지방안"));
            }
            System.out.println();

            } catch (Exception e) {
                // TODO: handle exception
            }
        
        }

        public static HashMap<String, String> MedicalCheckupEntry(String name, String gender, String age,
                                                                        String height, String weight, String bloodPressure,
                                                                        String bloodGlucose, String checkupResult,
                                                                        String recheckItems, String maintenancePlan) {
            HashMap<String, String> medicalCheckupHM = new HashMap<String, String>();

            medicalCheckupHM.put("이름", name);
            medicalCheckupHM.put("성별", gender);
            medicalCheckupHM.put("나이", age);
            medicalCheckupHM.put("키 (cm)", height);
            medicalCheckupHM.put("체중 (kg)", weight);
            medicalCheckupHM.put("혈압 (mmHg)", bloodPressure);
            medicalCheckupHM.put("혈당 (mg/dL)", bloodGlucose);
            medicalCheckupHM.put("검진결과", checkupResult);
            medicalCheckupHM.put("재검진 항목", recheckItems);
            medicalCheckupHM.put("유지방안", maintenancePlan);

            return medicalCheckupHM;
    }
}