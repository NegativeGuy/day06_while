package day06_while;

public class Ex04 {
	public static void main(String[] args) {
		/*
		continue : 반복문의 위쪽으로 올려보낸다 
		*/
		int i=0;
		while(i<5) {
			i++;
			if(i==3) {
				//break;
				continue; //해당 조건에서 continue(스킵)됨
			}
			System.out.println(i);
		}
		System.out.println();
		//System.out.println(i+"번째에서 반복문 종료됨");
		System.out.println("3번째에서 continue 발생");
	}
}
