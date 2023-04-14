class TryMultipleCatch{
	int a=10;
	int b=5;
	public void division(){
		try {
			int c= a/b;
			System.out.println("Division is :"+c);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		
		catch(NullPointerException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String [] args){
		TryMultipleCatch tryMultipleCatch = new TryMultipleCatch();
		tryMultipleCatch.division();
	}
}