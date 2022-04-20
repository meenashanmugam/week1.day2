package week1.day2;

public class LearnMethods {
	public static void main(String arg[])
	{
	
		LearnMethods obj=new LearnMethods();
		obj.printCarName();
		obj.getCarRegNumber();
		System.out.println(obj.getCarRegNumber());
		obj.getCarVarient();
		System.out.println("Automatic");
	int multiply=obj.multiplyTwoNumbers(45, 8);
		System.out.println(multiply);
		
	}
	public void printCarName() {
		System.out.println("audi");

}
public int getCarRegNumber() {
	int CarRegNumber=5645;
	return CarRegNumber;
}
	
public String getCarVarient() {
	
	return "Automatic";
}
public int multiplyTwoNumbers(int a, int b) {
	return a*b;
}
}