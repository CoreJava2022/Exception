abstract class MathOperation{
	public void add(int a,int b){
		int c = a+b;
		System.out.println("Addition is"+c);
	}
	public abstract void division(int a,int b) throws ArithmeticException,Exception,NullPointerException;	
}
class Calculation2 extends MathOperation{
	
	public  void division(int a,int b){
		try{
		int c=a/b;
		System.out.println("Division is"+c);
		throw new ArithmeticException();
		}
		finally{
			System.out.println("Any no is not able to divide/0");
		}
	}
	public static void main(String[] args){
		Calculation2 calculation = new Calculation2();
		calculation.add(10,20);
		calculation.division(10,2);
	}
}
