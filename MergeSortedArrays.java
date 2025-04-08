import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        
        // Merge the two arrays
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        
        // Copy remaining elements of arr1
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }
        
        // Copy remaining elements of arr2
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }
        
        return mergedArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for first sorted array
        System.out.print("Enter size of first sorted array: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        
        // Input for second sorted array
        System.out.print("Enter size of second sorted array: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        // Merging arrays
        int[] mergedArray = mergeArrays(arr1, arr2);
        
        // Displaying the merged sorted array
        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
    }
}
