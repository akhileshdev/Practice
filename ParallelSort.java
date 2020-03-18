import java.util.*;
import java.util.Arrays.*;
import java.lang.*;

public class ParallelSort
{   
		
	public static void main(String args[])
	{
     int arr[] = {8,9,19,89,67,14,12,1,2,3}; 	

     System.out.println("Array printing ");
     
     for(int i : arr)
    	 System.out.print(i+" ");
     
     System.out.println("\n\nUsing parallelSort() method ");
     Arrays.parallelSort(arr,0,5);
     
     for(int j : arr)
    	 System.out.print(j+" ");
     
	}

}