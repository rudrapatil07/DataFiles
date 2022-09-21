package interview_pro;

import java.util.Arrays;
import java.util.HashSet;

public class Com_2 
{

	public static void main(String[] args) {
		
		Integer [] n1= {10,20,30,40,50,60,70};
		
		Integer [] b1= {30,20,10,50,90,70,100};
		
	HashSet<Integer> st=new HashSet<Integer>();
	
	   st.addAll(Arrays.asList(n1));
	   
	   st.retainAll(Arrays.asList(b1));
	   
	   System.out.println(st);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
