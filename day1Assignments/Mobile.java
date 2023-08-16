package day1Assignments;

public class Mobile {
	
	public void MakeCall()
	{
		String mobileModel;
		float  mobileWeight;
		
		mobileModel ="Samsung Glaaxy+215G";
		mobileWeight = 1;
		System.out.println("MobileModel is"+mobileModel);
		System.out.println("MobileWeight is"+mobileWeight);
		}
	
	public void sendMsg()
	{
		boolean isFullCharged;
		int mobileCost;
		
		isFullCharged = true;
		mobileCost = 20000;
		System.out.println("To Check Whether Mobile Is Fully Charged"+isFullCharged);
		System.out.println("MobileCost is as"+mobileCost);
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile Obj = new Mobile();
		Obj.MakeCall();
		Obj.sendMsg();
	}

}
