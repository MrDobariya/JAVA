class Sorting 
{
	public static void main (String args[])
	{
		int arr[] = {1,2,5,7,6};
		int len = arr.length;
		for(int i=0; i<len; i++)
		{
		for(int j=1; j<len; j++)
			{
				if(arr[i] > arr[j]);
				{ 
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		} 
	
	System.out.println("Sorted Arry");
	for(int i=0; i<len; i++)
	{
		System.out.println(arr[i]);
	}
	}
}