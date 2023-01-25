package operators;

public class ShiftOperators {

	public static void main(String[] args) {

		byte b1 = 8;
		// illegal arithmetic promotion apply. Should cast to byte
		// byte b2 = b1 >>>2;
		System.out.println(b1 << 2);
		System.out.println(b1 >> 2);
		System.out.println(b1 >>> 2);

		byte b3 = -8;

		System.out.println(b3 << 2);
		System.out.println(b3 >> 2);
		System.out.println(b3 >>> 2);

	}
}
