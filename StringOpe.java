class StringOpe{
	public static void main(String[] args){
		
		 String str = "I am manasi kulkarni";
		 
     // for(int i=0; i<str.length(); i++) {
      //   System.out.println(str.charAt(i));
      //}
	  
      //System.out.println(str.length());
      
      try {
		  
         System.out.println(str.charAt(5));
      }catch(Exception e) {
         System.out.println(e.toString());
      }
	}
}