package TestSample;

public class findDuplicates {
	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,1,4,3,1,3,1};
		int i=0,j,count=0,num;
		/*
		String strarr[]={"S","H","S","S","H"};
		for(i=0;i<strarr.length;i++)
		{			
			for(j=i+1;j<strarr.length;j++)
			{			
				if(strarr[i]==strarr[j])			
				{
					count++;
					break;
				}				
					
			}			
			
		}
		
		System.out.println("count is "+count);
	
		
		
	} */

		
		
		
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length-1;j++)
			{
				if(arr[i]==arr[j])					
				
					System.out.println(arr[i]);				
				
			}
		
		}
		for(i=0;i<5;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		for(i=1;i<=6;i++)
		{
			
			System.out.print("*");
			for(j=i;j<6;j++)
			{				
				System.out.print("*");		
			}
			
			
			System.out.println("");
		}
		
		
			
		}		
}
	
	

