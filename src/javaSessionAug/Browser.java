package javaSessionAug;

public class Browser {

	//Function to launch Browser
	
	public boolean launchBrowser(String browserName) {
		System.out.println("browser name is"+" " + browserName);
		
		boolean flag= true;
		   
		switch (browserName.trim().toLowerCase()){
		//to trim extra space
		//to convert the lower case
		case "chrome":
			System.out.println("laucnh chrome browser--");
			break;
		case "firefox":
			System.out.println("laucnh firefox browser--");
			break;
		case "edge":
			System.out.println("laucnh edge browser--");
			break;
		default:
			System.out.println("please pass correct browser--"+" "+ browserName);
			flag=false;
			break;
		}
		
		return flag;
	}
	
	
	// WAF: TO RETURN STUDENT MARKS
	//Function name: getStudentMarks(String stName)
	// return: int Marks
	
	public int getStudentMarks(String stName) {
		
		int marks=-1;
		if (stName.equals("Sarika")) {
			//return 90;
			marks=90;
		}
		else if(stName.equals("Shreya")) {
			//return 80;
			marks=80;
		}
		else if (stName.equals("Joy")) {
			//return 0;
			marks=0;
		}
		else {
			//return -1;
			marks=-1;
		}
		return marks;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//caller method//user
		Browser br = new Browser();
		boolean flag = br.launchBrowser("Chrome   ");
		
		if (flag) {
			System.out.println("enter the url");
		}
		else {
			System.out.println("error no browser is there");
		}
		//System.out.println("call the browser" + " " + call.launchBrowser("chrome"));
        
		
		int stMarks =br.getStudentMarks("Joy");
		if (stMarks>=0) {
			System.out.println("print the marksheet");
		}
		else {
			System.out.println("No need to print marksheet");
		}
	}

}
