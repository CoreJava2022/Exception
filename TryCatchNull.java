class TryCatchNull{
	Integer a;
	Integer b;
	String name;
	public void division(Integer a ,Integer b){
		if(a!=null && b!=null){
			try{
				Integer c = a/b;
				System.out.println("Division is :" + c);
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
		else{
			System.out.println("Value of a is :"+a);
			System.out.println("Value of b is :"+b);
		}
	}
	public String display(String name){
		
		if(name!=null && !name.isEmpty()){
			return null;
		}
		else{
		    return name;
		 }
		//System.out.println("Name is :- "+ name.length());
		return name;
	}
	public static void main(String[] args){
		TryCatchNull tryCatchNull = new TryCatchNull();
		tryCatchNull.division(2,1);
		tryCatchNull.display("manasi");
	}
}