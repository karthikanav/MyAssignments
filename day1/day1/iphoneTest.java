package week1.day1;

class iphoneTest {
	String model = "14pro max";
	
	public static void main(String[] args) 
	{
		iphoneTest iPhoneA = new iphoneTest();
		iPhoneA.getModel();
		iPhoneA.makeaCall();
	}
	
	public void makeaCall() {
		System.out.println("Make a call");
	}
	public void getModel() {
		System.out.println("Model: "+model);
	}
		
}

		
	

