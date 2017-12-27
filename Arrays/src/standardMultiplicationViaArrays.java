import java.util.*;
import java.util.Scanner;

public class standardMultiplicationViaArrays {

	public standardMultiplicationViaArrays() {
		// TODO Auto-generated constructor stub
	}
	
    public void precisionMultiplication(List<Integer> num1,List<Integer> num2) {
    		boolean positive=true;
    		
    		if(num1.get(0)>0  && num2.get(0)>0) {
    			positive=true;
    		}else if(num1.get(0)<0  && num2.get(0)<0) {
    			positive=true;
    		}else {
    			positive=false;
    		}
    		
    		if(num1.size()>num2.size()) {
    			int diff=num1.size()-num2.size();
    			for(int i=0;i<diff;i++) {
    				num2.add(0, 0);
    			}
    		}
    		
    		if(num1.size()<num2.size()) {
    			int diff=num2.size()-num1.size();
    			for(int i=0;i<diff;i++) {
    				num1.add(0, 0);
    			}
    		}
    		
    		List <Integer> result=new ArrayList <Integer> (Collections.nCopies(num1.size()+num2.size(),0));
    		
    		for(int i=num1.size()-1;i>=0;i--) {
    			for(int j=num2.size()-1;j>=0;j--) {
    				result.set((i+j+1), result.get(i+j+1)+num1.get(i)*num2.get(j));
    				result.set((i+j),result.get(i+j+1)+result.get(i+j)/10);
    				result.set((i+j+1),result.get(i+j+1)%10);
    			}
    		}
    		
    		int j=0;
    		int first_not_zero=0;
    		while(first_not_zero==0) {
    			if(result.get(j)!=0) {
    				first_not_zero++;
    				break;
    			}
    		}
    		
    		result=result.subList(first_not_zero, result.size());
    		if(!positive) {
    			result.set(0, -1*result.get(0));
    		}
    		
    		System.out.println(result);	
    }

}
