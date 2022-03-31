
public class Stringoperation {
	public static int mulTwoNumbers(int x,int y) {
        int z=x*y;
		return z;
	}
	public static int addTwoNumbers(int a, int b) {

		int c = a+b;
		return c;
		
	}
	
	public static void main(String[]args) {
		
		String S="SAI";
    	System.out.println(S.toLowerCase());
		System.out.println(S.toUpperCase());
		int addTwoNumbers = addTwoNumbers(1,2);
		int subTwoNumbers=mulTwoNumbers(10,20);
		System.out.println(addTwoNumbers);
		System.out.println(subTwoNumbers);
		}
	}
