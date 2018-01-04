import java.util.List;
import java.util.*;

public class spiralOrder {

	public spiralOrder() {
		// TODO Auto-generated constructor stub
	}
	
	public void spiralPrinting(int a[][],int m,int n) {
		List<Integer> printList=new ArrayList<Integer>();
		int left=0;
		int right=n-1;
		int top=0;
		int bottom=m-1;
		
		while(printList.size()<m*n){
			
			for(int i=left;i<=right;i++) {
				printList.add(a[top][i]);
			}
			top++;
			
			for(int i=top;i<=bottom;i++) {
				printList.add(a[i][right]);
			}
			right--;
			
			if(bottom<top) {
				break;
			}
			
			for(int i=right;i>=left;i--) {
				printList.add(a[bottom][i]);
			}
			bottom--;
			
			if(right<left) {
				break;
			}
			
			for(int i=bottom;i>=top;i--) {
				printList.add(a[i][left]);
			}
			left++;	
		}
		
		System.out.println(printList);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input=new Scanner(System.in);
		System.out.println("Enter the value of m of an m*n of the given matrix");
		int m=user_input.nextInt();
		System.out.println("Enter the value of n of an m*n of the given matrix");
		int n=user_input.nextInt();
		int a[][]=new int[m][n];
		System.out.println("Enter "+(m*n)+" number of elements for the given matrix");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=user_input.nextInt();
			}
		}
		
		spiralOrder so=new spiralOrder();
		so.spiralPrinting(a,m,n);


	}

}
