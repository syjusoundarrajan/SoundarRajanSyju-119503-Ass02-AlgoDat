

public class MyHeapSortJavaImplementation {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//giving our input values of our array that has to be sorted using my algorithm
		int[] input = {  21, 56, 31, 76, 29, 16, 4 };
		
		//Creating Object
		MyHeapSortJavaImplementation mhsji = new MyHeapSortJavaImplementation();
		//Calling our required methods
		mhsji.sortifying(input);
		mhsji.printresult(input);
		
	}
	
	//Method whichvHelps to find the length of our array 
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

//Method actually implements my HeapSort algorithm
public void heaping(int[] input, int end, int i)
{
	//Getting the index position of our three nodes used in our algorithm namely the Parent one, the left and the right
	int top = i, left = 2*i+1, right = 2*i+2;
	
	//Condition that checks and implements my algorithm 
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
		
		//This does the swapping process so that the implementation will not be sticked to the same number
		int temp = input[i];
		
		input[i] = input[top];
		input[top] = temp;
		
		heaping(input, end, top);
	}
}


//method that visualises our result
public void printresult(int[] input)
{
	for(int i = 0; i<input.length; ++i)
	{
		System.out.println(input[i]+"");
	}
}
}
