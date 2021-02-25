class Bank{
	double ROI=10.0;
	void getROI(){
		System.out.println("Rate of interest of bank :"+ROI);
	}
}
class SBI extends Bank{
	double ROI=8.0;
	void getROI(){
		System.out.println("Rate of interest of SBI :"+ROI);
	}
}
class ICICI extends Bank{
	double ROI=7.0;
	void getROI(){
		System.out.println("Rate of interest of ICICI :"+ROI);
	}
}
class Axis extends Bank{
	double ROI=6.0;
	void getROI(){
		System.out.println("Rate of interest of Axis :"+ROI);
	}
}
public class ROI{
	public static void main(String args[]){
	SBI s=new SBI();
	ICICI i=new ICICI();
	Axis a=new Axis();
	
	s.getROI();
	i.getROI();
	a.getROI();
	}
}