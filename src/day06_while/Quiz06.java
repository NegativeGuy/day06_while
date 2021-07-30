package day06_while;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String id1 = null, id2, pw1 = null, pw2;

		while(true) {
		
			System.out.println("1. 로그인\n2. 회원가입\n3. 나가기");
			int select = input.nextInt();
			switch(select) {
			case 2:
				System.out.println("원하는 ID 입력 : ");
				id1 = input.next();
				System.out.println("원하는 PW 입력 : ");
				pw1 = input.next();
				System.out.println("가입 완료");
				break;
			case 1:
				System.out.println("ID : ");
				id2 = input.next();
				System.out.println("PW : ");
				pw2 = input.next();
				if(id1.equals(id2) && pw1.equals(pw2)) {
					System.out.println("인증 성공!!");
					}
				else {
					System.out.println("인증 실패...");
				}
				break;
			case 3:
				System.out.println("프로그램 종료!!");
					System.exit(1);
			
			}
		}
	//로그인 프로그램 만들기
	//처음에 로그인을 하면 저장되어 있는 값이 없기 때문에 비교할 수 없을 것이다.
	//그래서 회원가입을 먼저 진행, 로그인 시도 후 회원가입 할 때의 아이디와
	//로그인 할 때의 아이디가 같은지 비교하자
	/*
		1. 로그인
		2. 회원가입
		3. 나가기
		>>>
	*/
	
	} //main
}
