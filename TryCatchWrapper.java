class TryCatchWrapper{
	Integer a=10;
	Integer b=0;
	public void division(){
	try{
		a=null;
		Integer c= a/b;
		System.out.println("Division is : "+c);
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
public static void main(String[] agrs){
	TryCatchWrapper tryCatchWrapper = new TryCatchWrapper();
	tryCatchWrapper.division();
}
}