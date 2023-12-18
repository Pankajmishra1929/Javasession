package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
				
		FortisHospital fh = new FortisHospital();
		fh.physioServices();
		fh.oncologyServices();
		fh.pediaServices();
		fh.dentalServices();
		fh.orthoServices();
		fh.gynoServices();
		fh.ENTServices();
		
		fh.emergencyServices();
		
		fh.medicalInsuarance();
		fh.medicalTraining();
		
		System.out.println(USMedical.min_fee);
		
		System.err.println(fh.min_fee);
		
		//child can access the parent class property
		fh.MedicalNewsPublish();
		
		fh.covidVacination();

		///Top casting - child class object referred by parent interface ref variable
		// with top casting we can access only those method which are coming from that interface/class
		USMedical US = new FortisHospital();
		US.physioServices();
		US.pediaServices();
		US.oncologyServices();
		US.emergencyServices();
		// WE CAN'T ACCESS ENT, GYNO, ORTHO, DENTAL WHICH BELONG TO UK AND IND
		
		UKMedical UK = new FortisHospital();
		UK.dentalServices();
		UK.orthoServices();
		UK.emergencyServices();
		
		IndianMedical IND = new FortisHospital();
		IND.ENTServices();
		IND.gynoServices();
		IND.emergencyServices();
	}

}
