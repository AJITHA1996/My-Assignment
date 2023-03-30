package week1.day1;

public class Mobile {
	//Create a  new class as "Mobile" under week1.day1
	
	
		 
	//Create 2 methods (makeCall() , sendMsg()) with simple print statement
	//In first method create variable  mobileModel (String),mobileWeight (float)
		public void makeCall() {
			String mobileModel="OnePlus";
			float mobileWeight=6.5f;
			System.out.println("mobile model:" +mobileModel);
			System.out.println("weight:" +mobileWeight);
		}
		//In second method create variable  isFullCharged (boolean),mobileCost (int)
		public void sendMsg() {
			boolean FullCharged= true;
			int mobileCost=35000;
			System.out.println("cost:" +mobileCost);
		}
		
		//Create main method
		public static void main(String[] args) {
		
		//Create object for class and call  from main method and print them
			Mobile abtphn=new Mobile();
			System.out.println("This is my mobile");
			abtphn.makeCall();
			abtphn.sendMsg();		
		 
		//- print a statement---->"This is my mobile";
		//-run and confirm the output printed in console 

	}

}
