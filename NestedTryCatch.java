class NestedTryCatch{
	public void arrayArithmaticope(int[] intArray){
	try{ 
           for(int i=0;i<5;i++){
			    	System.out.println(intArray[i]);
		   }
		 System.out.println("*********************");
		 int b[] = intArray;
            try{
            	for(int i=0;i<intArray.length;i++){
            	int divResult=b[i]/0;
				System.out.println(" division"+divResult);
				}
            }catch(ArithmeticException e){
                System.out.println(e.toString());
            	System.out.println(" handled in try-block1");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.toString());
                System.out.println(" handled in try-block2");
            }      
     	}catch(NullPointerException e){
		   System.out.println(e.toString());
           System.out.println(" main catch1");
	}
	catch(Exception e){
		   System.out.println(e.toString());
           System.out.println(" main catch2");
	}
}
	public static void main(String[] args){
		int[] intArray= {1,2,3,4,5,0};
		NestedTryCatch nestedTryCatch = new NestedTryCatch();
		//intArray=null;
		nestedTryCatch.arrayArithmaticope(intArray);
	}
	
}