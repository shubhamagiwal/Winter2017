import java.util.ArrayList;
import java.util.Scanner;

public class dutchNationalFlagProblem {
	
	public static enum color {R, W, B}

	public dutchNationalFlagProblem() {
		// TODO Auto-generated constructor stub
	}
	
	public void solutionWithoutSpaceOptimisation(String dutchString) {
		
		StringBuilder dutchStringBuilderRed=new StringBuilder();
		StringBuilder dutchStringBuilderBlue=new StringBuilder();
		StringBuilder dutchStringBuilderWhite=new StringBuilder();
		StringBuilder dutchStringBuilder=new StringBuilder();
		for(int i=0;i<dutchString.length();i++) {
			if(dutchString.charAt(i)=='R') {
				dutchStringBuilderRed.append('R');
			}
			
			if(dutchString.charAt(i)=='B') {
				dutchStringBuilderBlue.append('B');
			}
			
			if(dutchString.charAt(i)=='W') {
				dutchStringBuilderWhite.append('W');
			}
			
		}
		
		dutchStringBuilder.append(dutchStringBuilderRed.toString())
						   .append(dutchStringBuilderWhite.toString())
						   .append(dutchStringBuilderBlue.toString());
		
		System.out.println(dutchStringBuilder.toString());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input= new Scanner(System.in);
		System.out.println("Enter the String with R for Red, W for White and B for Black");
		String dutchString=user_input.nextLine();		
		dutchNationalFlagProblem dnfp=new dutchNationalFlagProblem();
		dnfp.solutionWithoutSpaceOptimisation(dutchString);
		
		
	}

}
