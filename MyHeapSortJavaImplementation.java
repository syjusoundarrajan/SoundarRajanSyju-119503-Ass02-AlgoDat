

public class MyHeapSortJavaImplementation {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = {  21, 56, 31, 76, 29, 16};
		
		MyHeapSortJavaImplementation mhsji = new MyHeapSortJavaImplementation();
		mhsji.sortifying(input);
		mhsji.printresult(input);
		
	}
	
	
public void sortifying(int[] input)
{
	int len = input.length;
	
	for(int i = len/2-1; i>=0; --i)
	{
		heaping(input, len, i);
	}
	
	for(int i = len-1; i>=0; --i) 
	{
		int temp = input[0];
		input[0] = input[i];
		input[i] = temp;
		
		heaping(input, i, 0);
	}
	
}


public void heaping(int[] input, int end, int i)
{
	
	int top = i, left = 2*i+1, right = 2*i+2;
	
	if(left<end && input[left] > input[top])
	{
		top = left;
	}
	
	if(right<end && input[right] > input[top])
	{
		top = right;
	}
	
	if(top!=i)
	{
		int temp = input[i];
		
		input[i] = input[top];
		input[top] = temp;
		
		heaping(input, end, top);
	}
}



public void printresult(int[] input)
{
	for(int i = 0; i<input.length; ++i)
	{
		System.out.println(input[i]+"");
	}
}
}
