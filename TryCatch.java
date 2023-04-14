class TryCatch{
	
	public void division(){
		int a=10;
		int b=0;
		
		try{
			int c=a/b;
			System.out.println("division is :"+c);
		}
		catch(ArithmeticException e){
			System.out.println("Exception is :- "+e);
		}
	}
	public static void main(String[] args){
		TryCatch tryCatch = new TryCatch();
		tryCatch.division();
	}
}