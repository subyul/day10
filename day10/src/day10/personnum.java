package day10;
import java.util.StringTokenizer;
public class personnum {
	public static void main(String[] args) {
		
	String Id = "040320-4823333";
	StringTokenizer st = new StringTokenizer(Id,"-");
	
	String str = Id.substring(0,2);
	
	
	
	int age = Integer.parseInt(str);
	
	int now = 2022 - (2000+age);
	
	System.out.println(now);
	}
	}
	

