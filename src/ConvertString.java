//program for convert sting to int and int to string

public class ConvertString {  
	 public static void main(String[] args) { 
    	
        //1st way  String to int 
    	
        String str1 = "5";  
        int result = Integer.parseInt(str1);     // Using Integer.parsrInt()   //convert string to int
        System.out.println(result);  
   
        //2nd way   int to string
        
        String str2 = "6";  
        Integer result2 = Integer.valueOf(str2);     // Using Integer.valueOf()    //convert int to string
        System.out.println(result2);  
   
    }  
}  
