import java.util.*;
import java.util.Scanner;



public class dutchNationalFlagProblem {
	
	public enum color{R,W,B};

	public dutchNationalFlagProblem() {
		// TODO Auto-generated constructor stub
	}
	
	public void NonOptimisedSolution(int pivotalIndex,List<color> list) {
		color pivot=list.get(pivotalIndex);
		//For the value swap less than the pivotal index
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(j).ordinal()<pivot.ordinal()) {
					Collections.swap(list, i, j);
					break;
				}
			}
		}
		
		//System.out.println(list);
		
		//For values greater the pivotal index values
		for(int i=list.size()-1;i>=0;--i) {
			for(int j=i-1;j>=0 && list.get(j).ordinal()>=pivot.ordinal();--j) {
				if(list.get(j).ordinal()>pivot.ordinal()) {
					Collections.swap(list, i, j);
					break;
				}
			}
		}
		
		System.out.println(list);
	}
	
	public void OptimisedSolution(int pivotalIndex,List<color> list) {
		int smaller=0;
		color pivot=list.get(pivotalIndex);
		for(int i=0;i<list.size();i++) {
			if(list.get(i).ordinal()<pivot.ordinal()) {
				Collections.swap(list, i, smaller++);
			}
		}
		
		int larger=list.size()-1;
		for(int i=list.size()-1;i>=0 && list.get(i).ordinal()>=pivot.ordinal();i--) {
			if(list.get(i).ordinal()>pivot.ordinal()) {
				Collections.swap(list, larger--, i);
			}
		}
		
		System.out.println(list);
	}
	
	public static void main(String args[]) {
		Scanner user_input=new Scanner(System.in);
		System.out.println("Enter the String containing R,W,B only");
		String str=user_input.nextLine();
		List<color> list=new ArrayList<color>();
		
		for(int i=0;i<str.length();i++) {
			list.add(color.valueOf(Character.toString(str.charAt(i))));
		}
		
		System.out.println("Enter the pivotal Index ranging from 0 to"+(list.size()-1));
		int pivotalIndex=user_input.nextInt();
		
		dutchNationalFlagProblem dnfp=new dutchNationalFlagProblem();
		//dnfp.NonOptimisedSolution(pivotalIndex,list);
		dnfp.OptimisedSolution(pivotalIndex,list);
		
		
		
	}

}
