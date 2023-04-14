class NestedTryDemo{
   public static void main(String args[]){
      //main try-block
      try{
		  Integer a=1;
		  Integer b =0;
		  a=0;
		  Integer z=a/b;
		  System.out.println(z);	
    	//try-block2
        try{ 
            int c=4/0;
			System.out.println(c);		
            //try-block3
            try{
            	int arr[]= {1,2,3,4};
        
            	System.out.println(arr[10]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.toString());
            	System.out.println(" handled in try-block3");
            }
        }
        catch(ArithmeticException e){
           System.out.println(e.toString());
           System.out.println(" handled in try-block2");
        }
    }
    catch(NullPointerException e3){
    	System.out.println(e3.toString());
     	System.out.println(" handled in main try-block");
    }
    catch(ArrayIndexOutOfBoundsException e4){
    	System.out.println(e4.toString());
     	System.out.println(" handled in main try-block");
    }
    catch(Exception e5){
    	System.out.println(e5.toString());
     	System.out.println(" handled in main try-block");
     }
  }
}