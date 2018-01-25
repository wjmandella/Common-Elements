import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ElementsInCommonApp {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("This app will check to see if two arrays have elements (integers) in common.\n");
		
		int commonCount = 0;
		
		int[] array1 = getArray(1);
		System.out.println();
		int[] array2 = getArray(2);
		
		ArrayList<Integer>commonElements = new ArrayList<>();
		
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array2.length; j++) {
				if(array1[i] == array2[j]) {
					commonCount++;	
					commonElements.add(array1[i]);
				}
			}
		}		
		Arrays.sort(array1);
		System.out.println("\nArray 1: "+ Arrays.toString(array1));
		Arrays.sort(array2);
		System.out.println("Array 2: "+ Arrays.toString(array2));		
		System.out.println("The two arrays have "+commonCount+" elements in common.");
		System.out.println("Those elements are: "+commonElements.toString());
		
		sc.close();
	}
	
	public static int[] getArray(int arrayNbr) {
		System.out.print("How many elements for Array "+arrayNbr+"?: ");
		int nbr = sc.nextInt();
		System.out.print("Enter the number of elements of Array "+arrayNbr+".\n");
		int[] tempArray = new int [nbr];
		for(int i = 0; i < nbr; i++) {
			System.out.print("Enter element number " + (i+1) + " of Array "+arrayNbr+": ");
			tempArray[i] = sc.nextInt();			
		}
		return tempArray;
	}

}
