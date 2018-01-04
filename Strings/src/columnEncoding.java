import java.util.*;
public class columnEncoding {

	public columnEncoding() {
		// TODO Auto-generated constructor stub
	}
	
	public void encode(String s) {
		int result=0;
		for(int i=0;i<s.length();i++) {
			result=result*26+s.charAt(i)-'A'+1;
		}
		
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input=new Scanner(System.in);
		System.out.println("Enter the column id that needs to be converted");
		String s=user_input.nextLine();
		columnEncoding ce=new columnEncoding();
		ce.encode(s);

	}

}
