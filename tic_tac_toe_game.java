package mccp;
import java.util.*;
public class tic_tac_toe_game {
	public static void printa(char[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static boolean havewon(char[][] a,char player)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i][0]==player && a[i][1]==player && a[i][2]==player)
			{
				return true;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[0][i]==player && a[1][i]==player && a[2][i]==player)
			{
				return true;
			}
		}
		if(a[0][0]==player && a[1][1]==player && a[2][2]==player)
		{
			return true;
		}
		if(a[0][0]==player && a[1][1]==player && a[2][2]==player)
		{
			return true;
		}
		return false;
	}
	public static boolean done(char[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]==' ')
				{
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] a=new char[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=' ';
			}
		}
		char player='X';
		boolean won=false;
		Scanner sc=new Scanner(System.in);
		while(!won && done(a))
		{
			printa(a);
		System.out.println("Player "+player+" enter: ");
		int i=sc.nextInt();
		int j=sc.nextInt();
		if(a[i][j]==' ')
		{
			a[i][j]=player;
			won=havewon(a,player);
			if(won)
			{
				System.out.println(player+" has won");
			}
			else
			{
				if(player=='X')
				{
					player='O';
				}
				else
				{
					player='X';
				}
			}
		}
		else
		{
			System.out.println("Invalid move,Try again!");
		}
	}
	printa(a);
	System.out.print("Game over");
	}
}
