class ArraySum
{
   public static void main(String[] args)
   {
    
      int[][] values =
      { 
     	{1,2,3,4}, {5,6,7,8}, {9,8,7,6}, {5,4,3,2}, {1,0,0,0} 
      };
         int sum = 0;
     
      for (int i = 0; i < 5; i++)
      {
         for (int j = 0; j < 4; j++)
         {
            System.out.print(values[i][j] + " ");

            sum = sum + values[i][j];
         }

         System.out.println();    
      }
               System.out.print("array sum ="+sum);

   }
}