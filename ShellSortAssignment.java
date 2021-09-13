import java.util.Arrays;

class ShellSortAssignment{
    public static void main(String args[]){
        int array[] = {20,35,-15,7,55,1,-22};

        printArray(array);
        System.out.println("Shell Sort in Ascending: " );
        shellSort(Arrays.copyOf(array, array.length), true);

        System.out.println();

        printArray(array);
        System.out.println("Shell Sort in Descending: " );
        shellSort(Arrays.copyOf(array, array.length), false);
        shiftRight(array,2,3);
        printArray(array);

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
     * @param index - index used to shift value to the right
     * @oaram gap - gap to shift right
     */
    //use this method to shift to the right
    public static void shiftRight(int[] array, int index, int gap){
        if ( index + gap <= array.length - 1 ) {
            array[index + gap] = array[index];
        }
    }



    public static void shellSort(int[] array, boolean is_asc) {
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


}
