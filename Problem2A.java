package InterviewCake;

public class Problem2A {
	public static int[] getProductsOfAllIntsExceptAtIndex(int[] intArray) {
		
		int product = 1;
		int[] result = new int[intArray.length];
		
		for(int i=0; i<intArray.length; i++)
		{
			if(intArray[i]!=0)
				product= product * intArray[i];
			else
				product= product * 1;
		}	
		
		
		for(int i=0; i<intArray.length; i++)
		{
			result[i] = intArray[i] == 0 ? product/1 : product/intArray[i]; 
		}
		
		
		return result;
	}
	
	public static void printArray(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,0,4};
		int []arr1 = new int[]{1,7,3,4};
		int []arr2 = new int[]{1,2,6,5,9};

		printArray(getProductsOfAllIntsExceptAtIndex(arr));
	}
}
