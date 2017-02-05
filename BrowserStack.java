
/**
 * Created by IceBreakers on 2/5/17.
 * Build Browser stack() - browser back which was discussed in Saran class
 *
 * Implement your OWN DYNAMICALLY GROWING STACK using SIMPLE ARRAY and the following basic stack operations
 *      DONT USE ANY JAVA COLLECTIONS LIKE STACK
 *
 *         push()       - pushes the element in this case its a url (String)
 *         pop()        - pops the element from the stack
 *         search()     - searches the element in the stack
 *         peek()       - peeks the element without pop
 *         printStack() - prints the Stack preserving all its values
 *         size()       - returns the length of the stack
 *         isEmpty()    - return true if stack is not empty else false
 *
 */
public class BrowserStack {

    String[] myStack;
    int top;
    int STACK_SIZE = 16; //INITIAL STACK SIZE, GROW IF ITS NEEDED

    //Constructor to initialize your stack
    BrowserStack(){
        this.myStack = new String[STACK_SIZE];
        this.top = -1;
    }


    public static void myassert(boolean  x) {
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        if (!x) {
            throw new IllegalArgumentException("Assert fail") ;
        }
    }
    //push() - pushes the element in this case its a url (String)
    private  void push(String url){
        //WRITE YOUR CODE HERE
    }
    //pop()- pops the element from the stack
    private String pop(){
        //WRITE YOUR CODE HERE

    }

    private void printStack(){
        //WRITE YOUR CODE HERE

    }
    private  String peek(){
        //WRITE YOUR CODE HERE

    }
    private  int size(){
        //WRITE YOUR CODE HERE

    }
    private  boolean isEmpty(){
        //WRITE YOUR CODE HERE

    }
    private  boolean search(String url){
        //WRITE YOUR CODE HERE

    }
    private static void testBench(BrowserStack browserStack){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        browserStack.push("g.co");
        browserStack.push("y.be");
        browserStack.push("f.bk");
        browserStack.push("y.ho");
        browserStack.printStack();
        myassert(browserStack.search("y.be"));
        myassert(!browserStack.search("y.be1"));
        browserStack.printStack();
        myassert(browserStack.size() == 4);
        browserStack.pop();
        myassert(browserStack.pop().equals("f.bk");
        browserStack.peek();
        browserStack.isEmpty();
        browserStack.pop();browserStack.pop();
        browserStack.printStack();
        myassert(browserStack.size() == 0);
    }
    public static void main(String args[]){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        System.out.println("BrowserStack.java");
        BrowserStack testBrowser = new BrowserStack();
        testBench(testBrowser);
        System.out.println("DONE");
    }
}
