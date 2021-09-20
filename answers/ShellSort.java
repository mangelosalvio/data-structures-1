package answers;

import java.util.Arrays;

/**
 * Name : Michael Angelo O. Salvio
 * Course : CpE
 * Description: Shell Sort Algorithm
 */

public class ShellSort {
    public static void main(String[] args ) {

        //provide your own values
        int[] array = {20,35,-15,7,55,1,-22};

        /**
         * This will test out the method you created
         */

        System.out.println("Shell Sort in Ascending: " );
        shellSort(Arrays.copyOf(array,array.length), true);

        System.out.println("-".repeat(20));

        System.out.println("Shell Sort in Descending: " );
        shellSort(Arrays.copyOf(array,array.length), false);




        /**
         * Examples for testing the usage of printArray and shiftRight
         * Uncomment to test
         */
//        shiftRight(array,6);
//        printArray(array);
//        shiftRight(array,0);
//        printArray(array);
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
  
   public static void shellSort(int[] array, boolean is_asc) {
        /**
         * Program starts here
         * Requirements:
         *  -- Use the method shiftRight to shift the array to the right
         *  -- Use the method printArray to display the values of the array
         */

        int gap = array.length / 2;

        while ( true ) {
            System.out.println("Gap: " + gap);
            for (int i = 0 ; i < array.length - gap; i++ ) {
                System.out.println("Iteration #" + (i+1) + ": ");

                int selected_value  = array[i + gap];
                //System.out.println("Selected value: " + selected_value);

                int j;

                for ( j = i  ; j >= 0 ; j= j - gap ) {
//                System.out.println(array[j] + " < " + selected_value);
//                System.out.println(array[j] < selected_value);
                    if ( array[j] < selected_value && is_asc ) {
                        break;
                    } else if ( array[j] > selected_value && !is_asc ) {
                        break;
                    } else {
//                    System.out.println("index: " + j);
//                    System.out.print("After Shift: ");

                        shiftRight(array,j,gap);
                        printArray(array);
                    }
                }

                array[j + gap] = selected_value;

                printArray(array);
            }

            System.out.println();

            if ( gap == 1 ) {
                break;
            } else {
                gap = gap  / 2;
            }
        }

        /**
         * Program ends here
         */
    }

}
