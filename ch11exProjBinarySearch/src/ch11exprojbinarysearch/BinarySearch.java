/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11exprojbinarysearch;

/**
 *
 * @author 4800590195
 */
class BinarySearch {
    public static int binarySearch(int[] arr, int first, int last, int target) {
        int mid;
        int index;
        if (arr[first] == target) {         // base case
            index = first;
        } else if (arr[last] == target) {   // base case
            index = last;
        } else if (first == last) {         // base case
            if (arr[first] == target) {
                index = first;
            } else {
                index = -1;
            }
        } else {                            // continue recursion
            mid = (last + first) / 2;
            if (target == arr[mid]) {       // base case
                index = mid;
            } else {
                if (target > arr[mid]) {
                    first = mid + 1;
                } else {
                    last = mid;
                }
                index = binarySearch(arr, first, last, target);
            }
        }
        return index;
    }//End binarySearchMethod
}//End Class