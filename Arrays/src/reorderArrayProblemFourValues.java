import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class reorderArrayProblemFourValues {

	public reorderArrayProblemFourValues() {
		// TODO Auto-generated constructor stub
	}
	
	public void reorder(List<Integer> list) {
		int smaller=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)<list.get(smaller)) {
				Collections.swap(list, smaller++, i);
			}
		}
				
		int larger=list.size()-1;
		for(int i=list.size()-1;i>=0;i--) {
			if(list.get(i)>list.get(larger)) {
				Collections.swap(list, larger--, i);
			}
		}
		
		int middle=list.size()/2;
		for(int i=0;i<list.size()-1;i++) {
			
			if(list.get(i)>list.get(middle)) {
				Collections.swap(list, middle++, i);
			}
		}
		
		System.out.println(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=user_input.nextInt();
		List <Integer> list=new ArrayList<Integer>();
		System.out.println("Enter "+n+" number of elements of the array containing only 0,1,2,3");
		for(int i=0;i<n;i++) {
			list.add(user_input.nextInt());
		}
		
		reorderArrayProblemFourValues ra=new reorderArrayProblemFourValues();
		ra.reorder(list);

	}

}
