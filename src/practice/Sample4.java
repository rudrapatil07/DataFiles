package practice;

public class Sample4
{

	public static void main(String[]args)
	{
		
		
		
		String nk="Darshana";
		
		int s = nk.length();
		 
		char[] ch = nk.toCharArray();
		
		for(int i=0;i<s;i++)
		{
			for(int j=i+1;j<s;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("This is duplicate value in name==  "   +ch[j]);
					break;
				}
				
				
			}
			
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
