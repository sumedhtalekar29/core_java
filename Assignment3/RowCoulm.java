class RowCoulm
{
	public static void main(String args[])
	{
		  int[][]arr =
      {
         { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 },
         { 11, 22, 33 }, { 44, 55, 66}
      };
        
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println(" " );
		}
	}
}