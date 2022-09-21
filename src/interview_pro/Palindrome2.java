package interview_pro;

public class Palindrome2 {

	public static void main(String[] args) {
		
		String str="nitesh";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
		     rev=rev+str.charAt(i);
		}
		
		System.out.println("============================");
		
		
		
		if(str.equals(rev))
		{
			System.out.println("yes this is palindrome word");
		}
		else
		{
			System.out.println("no this is not palindrome word");
		}
		
	
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
