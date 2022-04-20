package week1.day2;

public class MyCalculator {
	public static void main(String arg[])
	{
	Calculator obj=new Calculator();
		int add=obj.add(5,6,7);
		System.out.println(add);
      int sub=obj.sub(22,10);
      System.out.println(sub);
     
      double product=obj.mul(23,12);
      System.out.println(product);
     
      float divide=obj.divide(42,2);
      System.out.println(divide);
}
}
