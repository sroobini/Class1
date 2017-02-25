/**
 * Created by IceBreakers on Class 5 HW 1- Medium
 * basic operations on linked list
 * reverse a linked list using recursion
 * */
public class LinkedList {

    public class Node {
        //WRITE YOUR CODE HERE

        //WRITE YOUR CLASS DEFINITION HERE

        //WRITE YOUR CONSTRUCTORS HERE
    }
    Node head;

    //print
    public void printList(){
        //WRITE YOUR CODE HERE
    }

    //add
    public void addNode(int data){
        //WRITE YOUR CODE HERE
    }

    //reverse
    public void reverseList(Node currNode){
        //WRITE YOUR CODE HERE

        //base case

        //RECURSION
        reverseList(currNode.next);
    }

    //test
    public static void testBench(){
        LinkedList reverseList = new LinkedList();
        reverseList.addNode(1);
        reverseList.addNode(2);
        reverseList.addNode(3);
        reverseList.addNode(4);
        reverseList.addNode(5);
        reverseList.addNode(6);


        reverseList.printList();
        System.out.println("");
        reverseList.reverseList(reverseList.head);
        reverseList.printList();
    }
    public static void main(String[] args){
        testBench();
    }
}

