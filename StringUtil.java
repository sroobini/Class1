
/**
 * Created by IceBreakers on 2/4/17.
 * Reverse a sentence
 * Input:
 */
public class StringUtil {

    private static String[] URLParser(String url){
        //WRITE YOUR CODE HERE..
        //parse the url and get all the get parameters and return an array of Strings
        //Input: google.com/api?param1=value1&param2=value2
        //Output: array of strings [] = { {param1:value1}, {param2:value2} }

    }
    private static String reverseWords(String sentence){
        //WRITE YOUR CODE HERE..
    }

    private static String reverseString(String sentence){
        //WRITE YOUR CODE HERE..
    }
    public static void myassert(boolean  x) {
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        if (!x) {
            throw new IllegalArgumentException("Assert fail") ;
        }
    }

    private static void testBench(){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        String input = "God is great";
        String output = null;
        System.out.println("Input 1: " + input);
        output = reverseWords(input);
        System.out.println("Output 1: " + output);
        myassert(output.equals("great is God"));

        System.out.println("Input 2: " + input);
        output = reverseString(input);
        System.out.println("Output 2: " + output);
        myassert(output.equals("doG si taerg"));

        input = null;
        System.out.println("Input 3: " + input);
        output = reverseWords(input);
        System.out.println("Output 3: " + output);
        myassert(input == output);

        String url = "https://google.com.ua/oauth/authorize?client_id=SS&response_type=code&scope=N_FULL&access_type=offline&redirect_uri=http://localhost/Callback";
        String getParams[] = URLParser(url);
        myassert(getParams.length == 5);
        myassert(getParams[0] == "{client_id:SS}");

    }
    public static void main(String args[]){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        System.out.println("ReverseSentence.java");
        testBench();
        System.out.println("DONE");
    }
}
