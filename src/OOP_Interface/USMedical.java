package OOP_Interface;

public interface USMedical extends WHO{
	
	int min_fee=10; // if we defined any variable in interface default it will be Final and Static
	
	public void physioServices();
	public void oncologyServices();
	public void pediaServices();
	public void emergencyServices();
	
	
	@Override// It does not make any sense.
	public void covidVacination();
	
}
