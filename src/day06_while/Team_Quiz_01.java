package day06_while;

public class Team_Quiz_01 {
	public static void main(String[] args) {
		//0시 0분 부터 23시 59분까지 출력하기
		for(int i=0; i<=23; i++) {
			for(int j=0; j<=59; j++) {
				if(i<=9 && j>9) {
					System.out.println("0"+i+"시 "+j+"분");
				}
				else if(i>9 && j<=9) {
					System.out.println(i+"시 "+"0"+j+"분");
				}
				else if(i<=9 && j<=9) {
					System.out.println("0"+i+"시 "+"0"+j+"분");
				}			
				else{
					System.out.println(i+"시 "+j+"분");
				}
			}
		}
	}
}
