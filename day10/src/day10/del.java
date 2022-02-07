package day10;
import java.util.Scanner;
public class del {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int del = -1;
		int count = 0;
		
		String[][] jang = {
				{"철수", "소고기"},
				{"철수", "김밥"},
				{"영희", "김치"},
				{"철수", "바나나"},
				{"철수", "새우깡"},
				{"영희", "오징어"},
				{"영희", "맛밤"}
			};
		
		for(int i = 0; i<jang.length;i++)
		{
			System.out.println(jang[i][0]+" : "+jang[i][1]+"["+i+"]");
		}
		
		System.out.println("[삭제] 이름을 입력하세요");
		String name = sc.next();									// 사용자가 입력한 값을 name 변수에 저장
		
		System.out.println("[삭제] 번호를 입력하세요");				
		int num = sc.nextInt();										// 사용자가 입력한 값을 num 변수에 저장
		
		for(int i = 0; i<jang.length;i++)
		{
			if(name.equals(jang[i][0]))								// 사용자가 입력한 값과 jang 배열에 들어있는 				equals(객체끼리 내용을 비교하는 메서드
			{														// 값이 일치하는 지 비교
				if(count == num)									// count변수와 num 변수가 같다면
				{													
					del = i;										// del 변수에는 i(반복문을 통해 바뀌는 값) 값을 넣음
				}
				count++;											// 조건이 맞다면 count 증가
			}
		}
		
		System.out.println("delete: "+del);
		
		String[][] temp = jang;										// 문자열 변수를 만들고 jang배열을 참조함
		jang = new String[temp.length-1][2];
		
		int i=0;
		for(int j=0;j<temp.length;j++)
		{
			if(j != del)											// j 갑과 del 변수의 값이 다르다면
			{
				jang[i] = temp[j];									// jang 배열을 참조한 temp[j]의 값을 jang[i]에 넣음
				i++;												// i 증가 후 for문 반복
			}
		}
		
		for(int j = 0;j<jang.length;j++)
		{
			System.out.println(jang[j][0]+" : "+jang[j][1]);		// 출력
		}


		
	}

	}

