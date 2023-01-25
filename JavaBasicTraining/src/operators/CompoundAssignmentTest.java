package operators;

public class CompoundAssignmentTest {

	public static void main(String[] args) {

		int x = 5;
		int y= 10;
		
		x += y; // x = x +y 15
		System.out.println("The addition is:"+ x);  // 15
		x -= y; // x = x-y;  
		System.out.println("The subtraction is:"+ x);
		x *= y; // x = x* y; 
		System.out.println("The multiplication is:"+ x);
		x /= y; // x = x/y; 
		System.out.println("The division is:"+ x);
		x %= y;  // x = x % y; 
		System.out.println("The remainder is:"+x);
	
	}
}
