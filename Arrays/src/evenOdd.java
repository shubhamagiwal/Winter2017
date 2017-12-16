import java.util.ArrayList;
import java.util.Scanner;


public class evenOdd {
	
	public void evenOddWithoutMemoryOptimisation(ArrayList<Integer>array) {
		ArrayList<Integer> newArray=new ArrayList<Integer>();
		
		// Put the Even Numbers first
		for(int i=0;i<array.size();i++) {
			if(array.get(i)%2==0) {
				newArray.add(array.get(i));
			}
		}
		
		// Put the odd number after the even numbers are put in the array list
		for(int i=0;i<array.size();i++) {
			if(array.get(i)%2!=0) {
				newArray.add(array.get(i));
			}
		}
		
		// Print the ArrayList
		System.out.println("Reordered Array");
		for(int i=0;i<newArray.size();i++) {
			System.out.println(newArray.get(i));
		}
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input=new Scanner(System.in);
		System.out.println("Enter the length of the first array");
		int arrLength=user_input.nextInt();
		System.out.println("Enter "+arrLength+" elements to do the operation");
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<arrLength;i++) {
			arr.add(user_input.nextInt());
		}
		evenOdd eo=new evenOdd();
		eo.evenOddWithoutMemoryOptimisation(arr);
		
		
	}
	

}
