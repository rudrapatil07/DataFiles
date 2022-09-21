package interview_pro;

public class Reverse_String 
{

	
	public static void main(String[]args)
	{
		
		String exp="Mahadev";
		
		int size = exp.length();
		
		for(int i=exp.length()-1;i>=0;i--)
		{
			char word = exp.charAt(i);
			
			System.out.print(word);
					
		}
		
		
		
System.out.println("============================================");
		
		StringBuffer str=new StringBuffer(exp);
		
		StringBuffer god = str.reverse();
		
		System.out.println(god);
		
		System.out.print("============================================");
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
