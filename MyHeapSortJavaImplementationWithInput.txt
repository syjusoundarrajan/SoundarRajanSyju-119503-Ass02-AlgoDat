
public class MyHeapSortJavaImplementationWithInput {


	//Method actually implements my HeapSort algorithm
	public void heaping(int[] inputvalues, int end, int i)
	{
		//Getting the index position of our three nodes used in our algorithm namely the Parent one, the left and the right
		int top = i, leg1 = 2*i+1, leg2 = 2*i+2;
		
		//My conditions that checks and implements my algorithm 
		//Conditions for the one of the sides
		if(leg1<end)
		{
			top = leg1;
		}
		if(inputvalues[leg1] > inputvalues[top])
		{
			leg1 = top;
		}
		
		//Conditions for the other side
		if(leg2<end)
		{
			top = leg2;
		}
		if(inputvalues[leg2] > inputvalues[top])
		{
			leg2 = top;
		}
		
		//My condition that does my swapping process since it is one of the important step in my algorithm
		if(top!=i)
		{
			
			//This does the swapping process so that the implementation will not be sticked to the same number
			int temp = inputvalues[i];
			
			inputvalues[i] = inputvalues[top];
			inputvalues[top] = temp;
			
			//Calling my swapped stuff to be used furthur
			heaping(inputvalues, end, top);
		}
	}
	
	//Method which Helps to find the length of our array 

	public void sortifying(int[] inputvalues)
{
	
	int len = inputvalues.length;
	
	//The following for loop is the most efficient method to sort our the length because the number may be odd or even that might be unexpectable
	for(int i = len/2-1; i>=0; --i)
	{
		//Again calling the stuffs done by us
		heaping(inputvalues, len, i);
	}
	
	for(int i = len-1; i>=0; --i) 
	{
		int temp = inputvalues[0];
		inputvalues[0] = inputvalues[i];
		inputvalues[i] = temp;
		
		heaping(inputvalues, i, 0);
	}
	
}


	//Method that visualizes my result
	public void printresult(int[] inputvalues)
	{
		 
		for(int i = 0; i<inputvalues.length; ++i)
		{
			 
			System.out.println(inputvalues[i]+"");
		}
	}




 //My main method
public static void main(String[] args) 
{
	
   
	//giving our input values of our array that has to be sorted using my algorithm
	System.out.println("Sorted Result");
	
	int[] inputvalues = {  21, 56, 31, 76, 29, 16, 4 };
	
	//Creating Object
	MyHeapSortJavaImplementation mhsji = new MyHeapSortJavaImplementation();
	
	//Calling our required methods
	mhsji.sortifying(inputvalues);
	mhsji.printresult(inputvalues);
	
	
	
}




}
