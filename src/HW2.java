/**
 * Homework 2, Summer 2018
 *
 * Find the number of 1's in a binary representation
 * of a non-negative int
 * @author A. Smith
 *
 */

public class HW2 extends HW2_AbstractClass{


    /**
     * Main: To test program
     * ints are non-negative
     */
    public static void main(String args[]){
        HW2 obj = new HW2();


        System.out.println("TEST 44: " + obj.countOfOnes(44));
        System.out.println("TEST 22: " + obj.countOfOnes(22));
        System.out.println("TEST 11: " + obj.countOfOnes(11));
        System.out.println("TEST 5: " + obj.countOfOnes(5));
        System.out.println("TEST 2: " + obj.countOfOnes(2));
        System.out.println("TEST 1: " + obj.countOfOnes(1));
        System.out.println("TEST 33: " + obj.countOfOnes(33));
        System.out.println("TEST 16: " + obj.countOfOnes(16));
        System.out.println("TEST 8: " + obj.countOfOnes(8));

        System.out.println("TEST 0: " + obj.countOfOnes(0));


    }


    /**
     * countOfOnes: Coverts an int to binary
     * and returns the number of 1's
     */
    public int countOfOnes(int n){
        if (n == 0){
            return 0;
        }
        else{
            return countOfOnes(n/2) + n % 2;
        }
    }

}
