abstract class MathOperation{
	public void add(int a,int b){
		int c = a+b;
		System.out.println("Addition is"+c);
	}
	public abstract void division(int a,int b) throws Exception{
		int c=a/b;
		System.out.println("Division is"+c);
	}
	
}
class Calculation extends MathOperation{
	public static void main(String[] args){
		Calculation calculation = new Calculation
		calculation.add(10,20);
		calculation.division(10,0);
	}
}