package day10;
import java.util.Random;
public class lotto2 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int lotto [][] = new int [5][7];
		
		int num = 0;

			for(int i = 0;i<lotto.length;i++)
			{
				for(int j = 0; j<lotto.length;j++)
				{
					num = ran.nextInt(2);
					if(num == 1)
					{
						lotto[i][j] = 0;
					}
					else
					{
						lotto[i][j] = 3;
					}
				}
			}
			
		int count = 0;
		int win = 0;
		for(int i = 0; i<5;i++)
		{
			for(int j = 0; j<7;j++)
			{
				if(lotto[i][j] == 3)
				{
					count +=1;
					if(count > 3)
					{
						lotto[i][j] = 0;
					}
				}
				else
				{
					count = 0;
				}
				System.out.print(lotto[i][j]+" ");
			}
			System.out.println();
		}
			
			
		}
		
		
}
