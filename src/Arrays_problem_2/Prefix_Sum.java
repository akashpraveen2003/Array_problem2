package Arrays_problem_2;

import java.util.Arrays;
import java.util.Scanner;

public class Prefix_Sum {
	private static void find_prefix_array(int[] array, int[] prefix_array) {
		// TODO Auto-generated method stub
		prefix_array[0]=array[0];
		for(int i=1;i<array.length;i++)
		{
			prefix_array[i]=prefix_array[i-1]+array[i];
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int array_size=scanner.nextInt();
		int array[]=new int[array_size];
		for(int i=0;i<array_size;i++)
		{
			array[i]=scanner.nextInt();
		}
		int prefix_array[]=new int[array_size];
		find_prefix_array(array,prefix_array);
		System.out.println(Arrays.toString(prefix_array));
	}

	

}
