package OOP_Interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {
	
	int min_fee=50;// FH local variable
	
	
	//US
	@Override
	public void oncologyServices() {
		System.out.println("FH-----oncologyServices");
				
	}

	@Override
	public void pediaServices() {
		System.out.println("FH-----pediaServices");
		
		
	}

	@Override
	public void physioServices() {
		System.out.println("FH-----physioServices");
		
	}

	//UK
	@Override
	public void dentalServices() {
		System.out.println("FH-----dentalServices");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("FH-----orthoServices");
		
	}
    //IND
	@Override
	public void gynoServices() {
		System.out.println("FH-----gynoServices");
		
	}

	@Override
	public void ENTServices() {
		System.out.println("FH-----ENTServices");
		
	}

	//Common method:
	@Override
	public void emergencyServices() {// Coming from Indian Medical. Last one
		System.out.println("FH-----emergencyServices");
		
	}
	
	//Individual Method
	
	public void medicalInsuarance() {
		System.out.println("FH----Medical Insurance");
	}
	
	public void medicalTraining() {
		System.out.println("FH----Medical Training");
	}

	@Override
	public void covidVacination() {
		System.out.println("FH----covidVacination");
		
	}

	
}
