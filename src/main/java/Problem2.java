//Haaris Nadeem
//CSS 143 Section B
//Homework 1

public class Problem2 {

    // Do not change signature (function name, parameters)
    public static int[] bubbleSort(int[] data) {

        int x = 1; // value used to see how many times a swap occurs
        int temp; // a temporary variable used to swap the two elements

            while( x != 0){ //when no swap occurs within a whole pass occurs stop sorting

                x = 0; //resets value at beginning of each pass

                for (int i = 0; i < data.length - 1; i++){ // goes through the array

                    if (data[i] > data[i+1]){ //checks if element i is larger that element i+1
                        x ++; // adds a value to denote that a swap occurred

                        //swap occurs
                        temp = data[i+1];
                        data[i+1] = data[i];
                        data[i] = temp;

                    }
                }
            }
        return data;
    }
}

