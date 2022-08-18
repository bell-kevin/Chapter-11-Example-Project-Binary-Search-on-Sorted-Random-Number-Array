package binarysearchdriver;

public class BinarySearch {

    public static int binarySearch(int[] arr, int first, int last, int target) {
        int mid;
        int index;
        if (arr[first] == target) {         // base case
            index = first;
            System.out.print("it was found in position ");
        } else if (arr[last] == target) {   // base case
            index = last;
            System.out.print("it was found in position ");
        } else if (first == last) {         // base case
            if (arr[first] == target) {
                index = first;
            } else {
                System.out.print("it was not found ");
                index = -1;
            }
        } else {                            // continue recursion
            mid = (last + first) / 2;
            if (target == arr[mid]) {       // base case
                index = mid;
                System.out.print("it was found in position ");
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
