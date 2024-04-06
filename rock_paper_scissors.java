package mccp;
import java.util.*;
public class rock_paper_scissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
		String[] rps= {"rock","paper","scissor"};
		String cmove=rps[new Random().nextInt(rps.length)];
		String hmove;
		String p="y";
		while(true)
			{
			System.out.println("Enter your move rock, paper or scissor");
			hmove=sc.nextLine();
			if(hmove.equals("rock")||hmove.equals("paper")||hmove.equals("scissor"))
				{
					break;
				}
				else
				{
					System.out.println(hmove+" is not a valid move");
				}
			}
		System.out.println("your move:"+hmove);
		System.out.println("Computer move:"+cmove);
		if(hmove.equals(cmove))
		{
			System.out.println("tie!!");
		}
		else if(hmove.equals("rock"))
		{
			if(cmove.equals("paper"))
			{
				System.out.println("you lose!!");
			}
			else if(cmove.equals("scissors"))
			{
				System.out.println("you win!!");
			}
		}
		else if(hmove.equals("paper"))
		{
			if(cmove.equals("rock"))
			{
				System.out.println("you win!!");
			}
			else if(cmove.equals("scissors"))
			{
				System.out.println("you lose!!");
			}
		}
		else if(hmove.equals("scissors"))
		{
			if(cmove.equals("rock"))
			{
				System.out.println("you lose!!");
			}
			else if(cmove.equals("paper"))
			{
				System.out.println("you win!!");
			}
		}
		System.out.println("do you want to play again? y or n?");
		String play=sc.nextLine();
		if(!play.equals("y"))
		{
			break;
		}
		else
		{
			continue;
		}
			}
		System.out.println("Thankyou");
	}

}
