import java.util.*;
/**
 * Created by IceBreakers on 2/11/17.
 * Class 3, Easy-1 Problem PrimeNumbers.java
 * 1. Return all 4-digit prime numbers in an ArrayList
 * 2. Print the 2nd largest 6-digit prime number
 */
public class PrimeNumbers {

    public static void myassert(boolean  x) {
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        if (!x) {
            throw new IllegalArgumentException("Assert fail") ;
        }
    }

    private static int secondMaxSixDigitPrime(){
        //WRITE YOUR CODE HERE
    }


    private static List<Integer> fourDigitPrimes(){
        //WRITE YOUR CODE HERE
    }

    private static void testBench(){
        myassert(secondMaxSixDigitPrime() == 999979);
        System.out.println(secondMaxSixDigitPrime());
        List output = fourDigitPrimes();
        myassert(output.size()==1061);
    }
    public static void main(String args[]){
        System.out.println("PrimeNumbers.java");
        testBench();
        System.out.println("DONE");

    }
}
