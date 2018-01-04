import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class advancingTheArray {

	public advancingTheArray() {
		// TODO Auto-generated constructor stub
	}
	
	public void advancingArray(ArrayList<Integer> list) {
		int maxSoFar=list.get(0);
		for(int i=0;i<=maxSoFar 
			&& maxSoFar<=list.size()-1;i++) {
			maxSoFar=Math.max(maxSoFar, i+list.get(i));
		}
		
		if(maxSoFar>=list.size()-1) {
			System.out.println("You can reach the last index");
		}else {
			System.out.println("You cannot reach the last index");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input=new Scanner(System.in);
		
		System.out.println("Enter the number of elements of the array");
		int n=user_input.nextInt();
		System.out.println("Enter "+n+" elements of the array");
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			list.add(user_input.nextInt());
		}
		
		advancingTheArray aa=new advancingTheArray();
		aa.advancingArray(list);
		

	}

}
