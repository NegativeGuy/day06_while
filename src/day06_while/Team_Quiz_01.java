package day06_while;

public class Team_Quiz_01 {
	public static void main(String[] args) {
		//0�� 0�� ���� 23�� 59�б��� ����ϱ�
		for(int i=0; i<=23; i++) {
			for(int j=0; j<=59; j++) {
				if(i<=9 && j>9) {
					System.out.println("0"+i+"�� "+j+"��");
				}
				else if(i>9 && j<=9) {
					System.out.println(i+"�� "+"0"+j+"��");
				}
				else if(i<=9 && j<=9) {
					System.out.println("0"+i+"�� "+"0"+j+"��");
				}			
				else{
					System.out.println(i+"�� "+j+"��");
				}
			}
		}
	}
}
