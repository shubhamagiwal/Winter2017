import java.util.*;

public class ValidIPAddress {

	public ValidIPAddress() {
		// TODO Auto-generated constructor stub
	}
	
	public void check(String ip) {
		String []splitArray=ip.split("\\.");
		
		if(splitArray.length<4 || splitArray.length>4) {
			System.out.println("IP address is invalid");
			System.exit(0);
		}
				
		
		for(int i=0;i<splitArray.length;i++) {
			//System.out.println(splitArray[i]);
			boolean value=ipvalidate(splitArray[i]);
			if(value==false) {
				System.out.println("IP address is invalid");
				System.exit(0);
			}
		}
		
		System.out.println("IP address is valid");

	}
	
	public boolean ipvalidate(String s) {
		if(s.length()>3 || s.startsWith("0")) {
			return false;
		}else {
			try {
			    int a= Integer.parseInt(s);
			    if(a>0 && a<=255) {
			    		return true;
			    }else {
			    		return false;
			    }
			  } catch (NumberFormatException e) {
			    return false;
			  }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input=new Scanner(System.in);
		System.out.println("Enter the IP address String");
		String s=user_input.nextLine();
		ValidIPAddress vp=new ValidIPAddress();
		vp.check(s);
		

	}

}
