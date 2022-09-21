package interview_pro;

public class String_split 
{
	
	public static void main(String[] args) 
	{
	

		String str="Nitesh Patil";
		
		String[] div = str.split(" ");
		
		System.out.println("index 0=="+div[0]);
		
		System.out.println("index 1=="+div[1]);
		
		for(int i=0;i<=div.length-1;i++)
		{
			StringBuffer sba=new StringBuffer(div[i]);
			
			StringBuffer value = sba.reverse();
			
			System.out.println(value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}