//This drives the binarySearch class.
package binarysearchdriver;

import java.util.*;

public class BinarySearchDriver {

    public static void main(String[] args) {
        System.out.println("Sorting by Kevin Bell");
        Scanner computerKeyboardInput = new Scanner(System.in);
        int arraySize, searchNumber;
        System.out.print("How big is this array? ");
        arraySize = computerKeyboardInput.nextInt();
        System.out.println("Unsorted array: ");
        int[] randomNumbers = new int[arraySize];
        System.out.print("Array contains: ");
        for (int i=0; i<arraySize; i++){
            int randomNumber = (int) (Math.random() * arraySize * 5 + 1);
            randomNumbers[i] = randomNumber;
            System.out.print(randomNumbers[i]+" ");
        } //end for loop 
        System.out.println();
        System.out.println("Sorted array: ");
        System.out.print("Array contains: ");
        Arrays.sort(randomNumbers);
        for (int i=0; i<arraySize; i++){
            System.out.print(randomNumbers[i]+" ");
        } // end for loop
        System.out.println();
        do {
        System.out.print("For which number should I search? (Type -1 to end program) ");
        searchNumber = computerKeyboardInput.nextInt();
        if (searchNumber == -1){
            System.out.println("Good bye");
            break;
        }
        //binarysearchdriver.BinarySearch.binarySearch(randomNumbers, 0, (arraySize-1), searchNumber);
        System.out.println(BinarySearch.binarySearch(randomNumbers, 0, (randomNumbers.length - 1), searchNumber));
        } /* end do */ while (searchNumber != -1);
    } // end main
} // end BinarySearchDriver class
