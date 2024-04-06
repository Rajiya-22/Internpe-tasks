package mccp;
import java.util.*;
public class guessing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String play="yes";
		while(play.equals("yes"))
		{
			Random r=new Random();
			int rnum=r.nextInt(100);
			int guess=-1;
			int tries=0;
			while(guess!=rnum)
			{
				System.out.println("Guess another b/w 1 & 100");
				guess=sc.nextInt();
				tries++;
				if(guess==rnum)
				{
					System.out.println("correct!");
					System.out.println("It only took you "+tries+" Tries");
					System.out.println("would you like to play again yes or no");
					play=sc.next().toLowerCase();
				}
				else if(guess>rnum)
				{
					System.out.println("try again guess is too high");
				}
				else
				{
					System.out.println("try again guess is too low");
				}
			}
		}
		if(play.equals("no"))
		{
			System.out.print("Thankyou");
		}
	}

}
