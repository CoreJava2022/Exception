class NestedTry{
	public static void main(String[] args){
		try{
			// 1st try block
			try{
				System.out.println(" Try block 1");
				int a=10;
				int b=0;
				int c=a/b;
				System.out.println(c);
			}
			catch(ArithmeticException e){
				System.out.println(e.toString());
			}
			// 2nd try block
			 try{
            System.out.println("Try block 2");
            int b =45/0;
            System.out.println(b);
         }
         catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
         }
		 System.out.println("Nested try close");
			
		}catch(ArithmeticException e1){
    	 System.out.println(e1.toString());
         System.out.println("Inside parent try catch block");
    }
    catch(ArrayIndexOutOfBoundsException e2){
    	System.out.println(e2.toString());
         System.out.println("Inside parent try catch block");
    }
    catch(Exception e3){
    	System.out.println(e3.toString());
         System.out.println("Inside parent try catch block");
    }
			
	}
}