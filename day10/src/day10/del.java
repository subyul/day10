package day10;
import java.util.Scanner;
public class del {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int del = -1;
		int count = 0;
		
		String[][] jang = {
				{"ö��", "�Ұ��"},
				{"ö��", "���"},
				{"����", "��ġ"},
				{"ö��", "�ٳ���"},
				{"ö��", "�����"},
				{"����", "��¡��"},
				{"����", "����"}
			};
		
		for(int i = 0; i<jang.length;i++)
		{
			System.out.println(jang[i][0]+" : "+jang[i][1]+"["+i+"]");
		}
		
		System.out.println("[����] �̸��� �Է��ϼ���");
		String name = sc.next();									// ����ڰ� �Է��� ���� name ������ ����
		
		System.out.println("[����] ��ȣ�� �Է��ϼ���");				
		int num = sc.nextInt();										// ����ڰ� �Է��� ���� num ������ ����
		
		for(int i = 0; i<jang.length;i++)
		{
			if(name.equals(jang[i][0]))								// ����ڰ� �Է��� ���� jang �迭�� ����ִ� 				equals(��ü���� ������ ���ϴ� �޼���
			{														// ���� ��ġ�ϴ� �� ��
				if(count == num)									// count������ num ������ ���ٸ�
				{													
					del = i;										// del �������� i(�ݺ����� ���� �ٲ�� ��) ���� ����
				}
				count++;											// ������ �´ٸ� count ����
			}
		}
		
		System.out.println("delete: "+del);
		
		String[][] temp = jang;										// ���ڿ� ������ ����� jang�迭�� ������
		jang = new String[temp.length-1][2];
		
		int i=0;
		for(int j=0;j<temp.length;j++)
		{
			if(j != del)											// j ���� del ������ ���� �ٸ��ٸ�
			{
				jang[i] = temp[j];									// jang �迭�� ������ temp[j]�� ���� jang[i]�� ����
				i++;												// i ���� �� for�� �ݺ�
			}
		}
		
		for(int j = 0;j<jang.length;j++)
		{
			System.out.println(jang[j][0]+" : "+jang[j][1]);		// ���
		}


		
	}

	}

