package operators;

class IncrementDecrementTest {
	public static void main(String arg[]) {
		
		int x = 10;
		
		// Increment test
		System.out.println(x++); // 10
		System.out.println(x); // 11
		System.out.println(++x); // 12
		System.out.println(x); // 12
		
		// Decrement test
		int y = 10;
		System.out.println(y--); // 10
		System.out.println(y); // 9
		System.out.println(--y); // 8
		System.out.println(y); // 8
	
	}
}
