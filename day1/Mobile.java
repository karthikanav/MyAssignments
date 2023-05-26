package week1.day1;

public class Mobile {
public void makecall() {
	String mobileModel = "14pro max";
	float mobileWeight = 4.23f;
	
	System.out.println("Mobile model: "+mobileModel);
	System.out.println("Weight of mobile: "+mobileWeight);
	
}
public void sendMsg() {
	boolean isFullCharged = true;
	int mobileCost = 56000;
	System.out.println("Phone charged: "+isFullCharged);
	System.out.println("Mobile cost: "+mobileCost);
	System.out.println("This is my mobile");
}
	public static void main(String[] args) {
		Mobile cz=new Mobile();
		cz.makecall();
		cz.sendMsg ();
		
		

	}

}
