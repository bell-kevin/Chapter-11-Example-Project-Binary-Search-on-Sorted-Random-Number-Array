/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11exprojbinarysearch;
import java.util.*;
/**
 *
 * @author 4800590195
 */
public class Ch11exProjBinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Sorting by Kevin Bell");
        Scanner computerKeyboardInput = new Scanner(System.in);
        int arraySize, searchNumber = 0;
        System.out.print("How big is this array? ");
        arraySize = computerKeyboardInput.nextInt();
        System.out.println("Unsorted array: ");
        int[] randomNumbers = new int[arraySize];
        System.out.print("Array contains: ");
        for (int i = 0; i < arraySize; i++) {
            int randomNumber = (int) (Math.random() * arraySize * 5 + 1);
            randomNumbers[i] = randomNumber;
            System.out.print(randomNumbers[i] + " ");
        } //end for loop 
        System.out.println();
        System.out.println("Sorted array: ");
        System.out.print("Array contains: ");
        Arrays.sort(randomNumbers);
        for (int i = 0; i < arraySize; i++) {
            System.out.print(randomNumbers[i] + " ");
        } // end for loop
        System.out.println();
        while (searchNumber != -1) {
            System.out.print("For which number should I search? (Type -1 to end program) ");
            searchNumber = computerKeyboardInput.nextInt();
            int indexPosition = BinarySearch.binarySearch(randomNumbers, 0, (randomNumbers.length - 1), searchNumber);
            if (indexPosition != -1) {
                System.out.println("it was found in position " + indexPosition);
            } // end if
            if (indexPosition == -1) {
                System.out.println("that number was not found");
            } // end if
        } // end while loop
        System.out.println("Good bye");
    } // end main
} // end BinarySearchDriver class