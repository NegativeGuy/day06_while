package day06_while;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		// 자판기 문제
		Scanner input = new Scanner(System.in);
		System.out.println("요금을 투입 하세요 : ");
		int mny = 0, chg = 0, select = 0;
		mny = input.nextInt();
		
		while(true) {
			System.out.println("======커피 자판기======");
			System.out.println("1. 커피(200)\t2. 코코아(250)\t3. 반환\t4. 종료");
			System.out.println("메뉴를 선택하세요 : ");
			select = input.nextInt();
			switch(select) {
			case 1:
				if(mny>=200) {
					System.out.println("맛있게 드세요");
					mny = mny - 200;
					System.out.println("잔액 : "+mny);
					System.out.println("\n\n");
					break;
				}else {
					System.out.println("잔액이 부족 합니다");
					System.out.println("\n\n");
					break;
				}
			
			case 2:
				if(mny>=250) {
					System.out.println("맛있게 드세요");
					mny = mny - 250;
					System.out.println("잔액 : "+mny);
					System.out.println("\n\n");
					break;	
				}else {
					System.out.println("잔액이 부족 합니다");
					System.out.println("\n\n");
					break;
				}
			case 3:
				System.out.println("거스름 돈 : "+mny);
				System.out.println("\n\n");
				break;
				
			case 4:
				System.out.println("종료합니다");
				System.exit(1);
			}
		}
	}
}
