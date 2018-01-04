import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class removeDuplicates {

	public removeDuplicates() {
		// TODO Auto-generated constructor stub
	}
	
	public void remove(List<Integer> list) {
		int pointer=0;
		int temp=0;
		for(int i=1;i<list.size();i++) {
			if(list.get(pointer)!=list.get(i)) {
				list.set(pointer+1, list.get(i));
				pointer=pointer+1;
			}
		}
		
		for(int i=pointer+1;i<list.size();i++) {
			list.set(i, 0);
		}
		
		System.out.println(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input=new Scanner(System.in);
		System.out.println("Enter the number for the array list");
		int n=user_input.nextInt();
		System.out.println("Enter "+n+" elements for the given array");
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			list.add(user_input.nextInt());
		}
		Collections.sort(list);
		removeDuplicates rd=new removeDuplicates();
		rd.remove(list);

		
		
	}

}
