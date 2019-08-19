import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
public class Left {
// Use scanner to read inputs.
	
	public static void main(String[] args){
		
 //Scanner in = new Scanner(System.in);
// Number of elements contained in the array.
 //int n = in.nextInt();
// Number of left-rotations to perform in the array.
 int d = 4;
// The array of size n to perform left-rotations on.
 int a[] = {1,2,3,4,5};
 int n = a.length;
 
 RotateArray rotate = new RotateArray();
 int arr[] = {1, 2, 3, 4, 5, 6, 7};
 rotate.leftRotate(arr, 5, 7);
 rotate.printArray(arr, 7);
// My new array that will store the elements in their final position.
int rotatedA[] = new int[n];
 
// Read and store the elements of the array.
/*for(int a_i=0; a_i < n; a_i++){
 a[a_i] = in.nextInt();
 }*/
// Loop through elements in a[], and store them in
// their final position in rotatedA[]
for(int i = 0; i < n; i++){
// Lets make sure we don't get negative indexes.
	if (i-d >= 0){
		rotatedA[i-d] = a[i];
		//System.out.print(rotatedA[i-d]);
// Add n if we get them.
	} 
	else {
		rotatedA[i-d+n] = a[i];
		//System.out.print(rotatedA[i-d+n]);
	}
}
 
// Print the array.
	for (int i = 0; i < n; i++){
		System.out.print(rotatedA[i]);
		System.out.print(' ');
	}
}
}
 
