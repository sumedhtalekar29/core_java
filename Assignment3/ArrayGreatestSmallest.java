class ArrayGreatestSmallest
{
	public static void main(String arsg[])
	{
		int arr[] = {10,22,3,8,5,1};
		  int smallest = arr[0];
          int biggest = arr[0];
		  
		for(int i=1; i<arr.length; i++)
		{
			 if(arr[i] > biggest)
			 {
				 biggest = arr[i];
			 }
             else if (arr[i] < smallest)
			 {
                 smallest = arr[i];
			 }
		}
		System.out.println("small number is : "+smallest);
		System.out.println("number is larger number is  : "+biggest);
	}
}