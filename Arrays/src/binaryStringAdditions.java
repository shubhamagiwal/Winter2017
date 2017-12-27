import java.util.Scanner;

public class binaryStringAdditions {

	public binaryStringAdditions() {
		// TODO Auto-generated constructor stub
	}
	
	public void add(String s,String t) {
		int carry=0;
		StringBuilder st=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--) {
			
			if(s.charAt(i)=='0' && t.charAt(i)=='0') {
				if(carry==0) {
					st.append("0");
				}else {
					st.append("1");
				}
				
				carry=0;
			}
			
			if(s.charAt(i)=='0'&& t.charAt(i)=='1') {
				if(carry==0) {
					st.append("1");
					carry=0;
				}else {
					st.append("0");
					carry=1;
				}
				
			}
			
			if(s.charAt(i)=='1' && t.charAt(i)=='0') {
				if(carry==0) {
					st.append("1");
					carry=0;
				}else {
					st.append("0");
					carry=1;
				}
			}
			
			if(s.charAt(i)=='1' && t.charAt(i)=='1') {
				if(carry==0) {
					st.append("0");
					carry=1;
				}else {
					st.append("1");
					carry=1;
				}
			}
		}
		
		String final1="";
		
		if(carry==1) {
			final1=carry+st.toString();
		}
		
		System.out.println(final1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input=new Scanner(System.in);
		System.out.println("Enter the first String of s containing 0's and 1's");
		String s=user_input.nextLine();
		System.out.println("Enter the first String of t containing 0's and 1's");
		String t=user_input.nextLine();
		
		if(s.length()>t.length()) {
			int diff=s.length()-t.length();
			StringBuilder st=new StringBuilder();
			for(int i=0;i<diff;i++) {
				st.append("0");
			}
			st.append(t);
			t=st.toString();
		}
		
		if(s.length()<t.length()) {
			int diff=t.length()-s.length();
			StringBuilder st=new StringBuilder();
			for(int i=0;i<diff;i++) {
				st.append("0");
			}
			st.append(s);
			s=st.toString();
		}
		
		binaryStringAdditions bsa=new binaryStringAdditions();
		bsa.add(s,t);

	}

}
