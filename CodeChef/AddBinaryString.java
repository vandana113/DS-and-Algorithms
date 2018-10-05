package CodeChef;

import java.util.Scanner;

public class AddBinaryString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(addBinary(a, b));
	}

	public static String addBinary(String A, String B) {
		String res = new String();
		res = "";
		int i = A.length() - 1;
		int j = B.length() - 1;
		int sum, carry, val;
		int a, b;
		carry = 0;
		while (i >= 0 && j >= 0) {
			a = A.charAt(i) - 48;
			b = B.charAt(j) - 48;
			val = a + b + carry;
			// sum = String.valueOf(val&1);
			sum = val&1;
			val = val>>1;
			carry = val;
			res = sum + res;
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("val : " + val);
			System.out.println("sum : " + sum);
			System.out.println("res : " + res);
			System.out.println("carry : " + carry);
			i--;
			j--;
		}
		while (i >= 0) {
			a = A.charAt(i) - 47;
			val = a + carry;
			// sum = String.valueOf(val&1);
			sum = val&1;
			val = val>>1;
			carry = val;
			// res = sum.charAt(sum.length()-1) + res;
			res = sum + res;
			i--;
		}
		while (j >= 0) {
			b = B.charAt(j) - 47;
			val = b + carry;
			// sum = String.valueOf(val&1);
			sum = val&1;
			val = val>>1;
			carry = val;
			res = sum + res;
			j--;
		}
		if (carry == 1) {
			res = carry + res;
		}
		return res;
	}
}

