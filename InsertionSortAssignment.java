/**
 * Name :
 * Course :
 * Description: Insertion Sort Algorithm
 */

public class InsertionSortAssignment {
    public static void main(String[] args ) {

        //provide your own values
        int[] array = {1,1,1,1,1,1,1,1};


        /**
         * Examples for testing the usage of printArray and shiftRight
         * Uncomment to test
         */
//        shiftRight(array,6);
//        printArray(array);
//        shiftRight(array,0);
//        printArray(array);
    }


    /**
     *
     * @param array - The array to be sorted using insertion sort algroithm
     * @param is_asc - a boolean variable to identify the sort order;
     *               If is_asc is true, the sort order is ascending
     *               If is_asc is false the sort order is descending
     */
    public static void insertionSort(int[] array, boolean is_asc) {
        /**
         * Program starts here
         * Requirements:
         *  -- Use the method shiftRight to shift the array to the right
         *  -- Use the method printArray to display the values of the array
         */



        /**
         * Program ends here
         */
    }

    public static void printArray(int[] numbers) {
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     *
     * @param array - Array to be used
     * @param i - index used to shift value to the right
     */
    //use this method to shift to the right
    public static void shiftRight(int[] array, int i){
        if ( i + 1 < array.length - 1 ) {
            array[i + 1] = array[i];
        }
    }

}
