package day06_while;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//equals
		Scanner sc = new Scanner(System.in);
		String n1, n2;
		System.out.println("첫 문자 입력: ");
		n1 = sc.next();
		System.out.println("두 문자 입력: ");
		n2 = sc.next();
		System.out.println("n1 길이 : "+n1.length());
		System.out.println("n2 길이 : "+n2.length());
		System.out.println("n1 == n2 : "+(n1==n2));
		System.out.println("n1.equals(n2) : "+n1.equals(n2));
		System.out.println("n2.equals(n1) : "+n2.equals(n1));
		
		String str = null;
		System.out.println( n1.equals(str));
		//System.out.println( str.equals(n1));
			//오류남, 왜냐면 str의 값이 (null)없기 때문에
	}
}
