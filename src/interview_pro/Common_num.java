package interview_pro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Common_num
{

	public static void main(String[] args) {
		
		Integer [] a1= {10,20,22,30,50,60};
		
		Integer [] b1= {20,30,22,34,667};
		
		HashSet<Integer> sb=new HashSet<Integer>();
		
	      sb.addAll(Arrays.asList(a1));
	      sb.retainAll(Arrays.asList(b1));
	      
	      System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
