import java.util.Arrays;

class BubbleAndSelectionSort{
    public static void main(String args[]){
        int array[] = {20,35,-15,7,55,1,-22};


        System.out.println("Bubble Sort in Ascending: " );
        bubbleSort(Arrays.copyOf(array, array.length), true);

        System.out.println("Bubble Sort in Descending: " );
        bubbleSort(Arrays.copyOf(array, array.length), false);

        System.out.println("-".repeat(20));


        System.out.println("Selection Sort in Ascending: " );
        selectionSort(Arrays.copyOf(array, array.length), true);

        System.out.println("Selection Sort in Descending: " );
        selectionSort(Arrays.copyOf(array, array.length), false);



    }

    public static void printArray(int[] numbers) {
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void bubbleSort(int[] array, boolean is_asc) {
        int last_unsorted_index = array.length - 1;
        for (int i = 0 ; i < array.length - 1; i++ ) {
            System.out.println("Iteration #" + (i+1) + ": ");
            for (int j = 0 ; j < last_unsorted_index  ; j++ ) {
                if ( is_asc ) {
                    if (array[j] > array[j + 1]) {
                        swap((array),j , j+1);
                    }
                } else {
                    if (array[j] < array[j + 1]) {
                        swap((array),j , j+1);
                    }
                }

                printArray(array);
            }
            last_unsorted_index = array.length - 1 - (i + 1);
        }
        System.out.println();
    }

    public static void selectionSort(int[] array, boolean is_asc) {

        for (int i = 0 ; i < array.length - 1; i++ ) {
            System.out.println("Iteration #" + (i+1) + ": ");

            int selected_value = array[i]; //min
            int selected_index = i;

            for (int j = i + 1 ; j < array.length; j++ ) {


                if ( selected_value > array[j] && is_asc ) {
                    selected_value = array[j];
                    selected_index = j;
                } else if ( selected_value < array[j] && !is_asc ) {
                    selected_value = array[j];
                    selected_index = j;
                }

            }

            if ( array[i] > selected_value && is_asc ) {
                swap(array, i , selected_index);
            } else if ( array[i] < selected_value && !is_asc ) {
                swap(array, i , selected_index);
            }

            printArray(array);
        }

        System.out.println();
    }

}
