package day10;
import java.util.Random;
public class lotto {
public static void main(String[] args) {
	Random ran = new Random();
	int lotto [][] = new int [5][7];
	
	
	for(int i = 0; i<5;i++)
	{
		for(int j = 0; j<7;j++)
		{
			int num = ran.nextInt(2);
			if (num == 1)
			{
				lotto[i][j] = 0;
				System.out.print(lotto[i][j]+" ");
			}
			else
			{
				
				lotto[i][j] = 3;
				System.out.print(lotto[i][j]+" ");
			}
		}
		System.out.println();
		
		
	}
	
	
	int count = 0;
	int win = 0;
		for(int i = 0; i<5;i++)
		{
			for(int j = 0; j<7;j++)
			{
				if(lotto[i][j] == 3)
				{
					count ++;
					if(count >= 3)
					{
						win +=1;
						
					}
				}
				else
				{
					count = 0;
				}
				
				}
			if(win == 1)
			{
				System.out.println("¥Á√∑¿‘¥œ¥Ÿ");
			}
		}
		
	}
}

