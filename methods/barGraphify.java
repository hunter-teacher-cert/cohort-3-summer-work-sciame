public class barGraphify
{
  public static String barGraphify(int[] nums)
  {
    int i, j;
    String numberOfEquals = "";
    for (i = 0; i < nums.length; i++)
    {
      System.out.print(i + ": ");
      if(nums[i]==0){
        return numberOfEquals;
      } else {
        for(j = 1; j < nums[i]; j++)
        {
          System.out.print("==");
        }
          System.out.println();
      }
      //IT WORKS!!  Just some minor tweaks!

    }
    return numberOfEquals;
  }
  
  public static void main(String[] args)
  {
    int[] numbers = new int[4];
    numbers[0] = 0;
    numbers[1] = 1;
    numbers[2] = 2;
    numbers[3] = 3;
    String equals = barGraphify(numbers);
  }
}