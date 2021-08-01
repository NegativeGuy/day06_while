package day06_while;

public class Quiz08_rat {
	public static void main(String[] args) {
		int rat=2, rice=100000, d=1;
		
		while(true)
		{
			rice -= rat*20; //rice = rice-(rat*20);
			d+=1;
			if(d%10==0) 
			{
				rat*=2; // rat = rat*2
			}
			else if(rice<=0) 
			{
				break;
			}
//			System.out.println(d+"老");
//			System.out.println(rat*2+"付府");
//			System.out.println(rice+"g");
		}
		d--;
		System.out.println(d+"老 "+rat+"付府");
	}
}
