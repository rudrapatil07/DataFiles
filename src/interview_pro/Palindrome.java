package interview_pro;

public class Palindrome 
{

	public static void main(String[] args) {
		
		
		String str="nayan";
		
		StringBuffer sba=new  StringBuffer(str);
		
		System.out.println(sba);
		
		StringBuffer word = sba.reverse();
		   
		String rev = word.toString();
		
		if(rev.equalsIgnoreCase(str))
		{
			System.out.println("yes this is palindrome word");
		}
		else
		{
			System.out.println("no this is not palidrome word");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
