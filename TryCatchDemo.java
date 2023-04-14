// Try with multiple Catch block.
class TryCatchDemo{
	
	public void display(){
		int a = 10;
		int b = 0;
		try{
			int c=a/b;
		System.out.println("Division is :"+c);
		}
		catch(ArithmeticException e){
			System.out.println("Exception is : "+e);
		}
		catch(Exception e){
			e.printStackTrace();
		}	
	}
	public static void main(String args[]){
		TryCatchDemo tryCatchDemo = new TryCatchDemo();
		tryCatchDemo.display();
	}
}