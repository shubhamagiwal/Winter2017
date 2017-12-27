import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class incrementArbitaryPrecisionInt {

	public incrementArbitaryPrecisionInt() {
		// TODO Auto-generated constructor stub
	}
	
	public void add(List<Integer> list) {
		int carry=1;
		for(int i=list.size()-1;i>=0;i--) {
			if(carry==1 && list.get(i)<9) {
				list.set(i, list.get(i)+1);
				carry=0;
				break;
			}else if(carry==1 && list.get(i)>=9) {
				list.set(i, 0);
				carry=1;
				break;
			}
		}
		
		if(carry==1) {
			list.add(0, carry);
		}
		
		System.out.println(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input=new Scanner(System.in);
		System.out.println("Enter the value of n digits");
		int n=user_input.nextInt();
		List <Integer> list=new ArrayList<Integer>();
		System.out.println("Enter "+n+" number of elemts of the array");
		for(int i=0;i<n;i++) {
			list.add(user_input.nextInt());
		}
		
		incrementArbitaryPrecisionInt iAPI=new incrementArbitaryPrecisionInt();
		iAPI.add(list);
	}

}
