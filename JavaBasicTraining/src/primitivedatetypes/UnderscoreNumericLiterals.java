package primitivedatetypes;

public class UnderscoreNumericLiterals {

	public static void main(String[] args) {
		long ccNumber = 1234_5678_9012_3456L;
		long ssn = 999_99_9999L;
		float pi = 3.14_15F;
		long hexadecimalBytes = 0xFF_EC_DE_5E;
		int add = 12_3 + 3_2_1;
		System.out.println("ccNumber=" + ccNumber);
		System.out.println("ssn=" + ssn);
		System.out.println("pi=" + pi);
		System.out.println("hexadecimalBytes=" + hexadecimalBytes);
		System.out.println("add=" + add);
	}

}
