import java.util.ArrayList;
import java.util.Scanner;

public class buyAndSellStockOnce {

	public buyAndSellStockOnce() {
		// TODO Auto-generated constructor stub
	}
	
	public void bruteForce(ArrayList<Integer> list) {
		int maxProfit=0;
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if((list.get(j)-list.get(i))>maxProfit) {
					maxProfit=list.get(j)-list.get(i);
				}
			}
		}
		
		System.out.println("The max profit is ="+maxProfit);
	}
	
	public void optimisedSolution(ArrayList<Integer>list) {
		int maxProfit=0;
		int minPrice=Integer.MAX_VALUE;
		for(int i=0;i<list.size();i++) {	
			maxProfit=Math.max(maxProfit, list.get(i)-minPrice);
			minPrice=Math.min(minPrice, list.get(i));
		}
		
		System.out.println("The max profit is ="+maxProfit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input=new Scanner(System.in);
		System.out.println("Enter n elements for a given array");
		int n=user_input.nextInt();
		System.out.println("Enter "+n+" elements for a given array");
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			list.add(user_input.nextInt());
		}
		
		buyAndSellStockOnce bs=new buyAndSellStockOnce();
		bs.bruteForce(list);
		bs.optimisedSolution(list);
		
	}

}
