package arrayExercise;

import java.util.Arrays;
import java.util.Collections;

public class AddingValues {
	
	 public static void main (String[] arg)
	 {
		Double [] arrayValues = new Double [] {2.3, 16.0, 4.0, 5.4, 4.6, 19.7};
		 int arrayLength = arrayValues.length;
		 
		 // length of an array
		 System.out.println ("Array Length = " + arrayLength);
		 
		 double arraySum = 0;
		 //sum of values of an array
		 for (int i = 0; i< arrayLength; i++){
		 arraySum += arrayValues[i];
		 }
		 System.out.println ("Array Sum = " + arraySum);
		 
		 double max = arrayValues[0];
		 //finding maximum number from array
		 for (int i = 0; i< arrayLength; i++){
			 if (arrayValues [i] > max){
				 max = arrayValues[i];
			 }
		 }
		 System.out.println ("Array Max = " + max);
		 
		 //unsorted array
		 for (int i = 0; i< arrayLength; i++){
			 System.out.print (arrayValues[i] + ",");
			 }
		 
		 System.out.println ("\nUnsorted order :" + Arrays.toString(arrayValues)); 
		 //sorted
		 Arrays.sort(arrayValues);
		 
		 System.out.println ("\nAscendening order :" + Arrays.toString(arrayValues)); 
		 
		 //descending order: For descending order the Array should be of reference type not primitive type
Arrays.sort(arrayValues, Collections.reverseOrder());
		 
		 System.out.println ("\nDscendening order :" + Arrays.toString(arrayValues)); 
		 
	 }

}
