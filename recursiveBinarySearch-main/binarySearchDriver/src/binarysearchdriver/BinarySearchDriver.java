//This drives the binarySearch class.
package binarysearchdriver;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchDriver {

    public static void main(String[] args) {
        System.out.println("Sorting by Kevin Bell");
        Scanner computerKeyboardInput = new Scanner(System.in);
        int arraySize, searchNumber;
        System.out.print("How big is this array? ");
        arraySize = computerKeyboardInput.nextInt();
        int random = (int) (Math.random() * arraySize * 5 + 1);
        System.out.println("Unsorted array: ");
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        for (int i=0; i< arraySize; i++) {
            randomNumbers.add(random);
            random = (int) (Math.random() * arraySize * 5 + 1);
        }  
        System.out.println("Array contains: "+randomNumbers);
        System.out.println("Sorted array: ");
        Collections.sort(randomNumbers);
        System.out.println("Array contains: "+randomNumbers);
        System.out.print("For which number should I search? (Type -1 to stop program) ");
        searchNumber = computerKeyboardInput.nextInt();
        // int[] array = new int[]{-7, 3, 5, 8, 12, 16, 23, 33, 55};
        System.out.println(searchNumber);
        //System.out.println(BinarySearch.binarySearch(array, 0, (array.length - 1), 23));
        //System.out.println(BinarySearch.binarySearch(array, 0, (array.length - 1), 4));
    }
}
