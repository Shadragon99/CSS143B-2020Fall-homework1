//Haaris Nadeem
//CSS 143 Section B
//Homework 1

public class Problem1 {


    // received help from cite "https://www.geeksforgeeks.org/binary-search/" (used iterative implementation)

    public static int binarySearch(int[] data, int target) {

        int x = 0; // this var narrows down the left side of the array
        int y = data.length - 1; // this var narrows down the right side of the array

            while(x <= y){
                int c = x + (y - 1) / 2; // middle value that is used as the index for array to search

                //checks if number chosen is at the center
                if (data[c] == target){

                    return c;

                } else if(data[c] < target){ // if num is bigger, num is not on the left of the current spot checked

                    x = c + 1;

                } else { // if num is smaller, num is not on the right of the current spot checked

                    y = c - 1;

                }
            }
        return -1; // returns -1 if searched num is not in array
    }
}
