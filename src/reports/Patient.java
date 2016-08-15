package reports;

import java.util.Date;

public class Patient {

		private static int patientID;
		private static String patientName;
		private static String consultantName;
		private static int patientAge;
		private static String patientGender;
		private static Date checkupDate;

		
		//setters
		static void SetPatientID(int pID){
			if(pID > 0 )
				patientID = pID;		
		}
		
		static void SetPatientName(String pN){
			if(pN != null)
				patientName = pN;
		}
		
		static void SetConsultantName(String cN){
			if(cN != null)
				consultantName = cN;
		}
		
		static void SetPatientAge(int pA){
			if(pA > 0)
				patientAge = pA;
		}
		
		static void SetPatientGender(String pG){
			if(pG != null)
				patientGender = pG;
		}
		
		static void SetCheckupDate(Date cD){
			if(cD != null)
				checkupDate = cD;
		}
		
		//getters
				
		static int GetPatientID(){
			return patientID;		
		}
		
		static String GetPatientName(){
			return patientName;
		}
		
		static String GetConsultantName(){
			return consultantName;
		}
		
		static int GetPatientAge(){
			return patientAge;
		}
		
		static String GetPatientGender(){
			return patientGender;
		}
		
		static Date GetCheckupDate(){
			return checkupDate;
		}				
	}

