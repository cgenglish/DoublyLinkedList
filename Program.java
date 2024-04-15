//Connor English
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        //initalizing doublylinkedlist doubleList
        DoublyLinkedList<String> doubleList = new DoublyLinkedList<String>();
        //checking if deleteBack method with empty list throws error
        doubleList.DeleteBack();
        //checking if deleteFront method with empty list throws error
        doubleList.DeleteFront();
        //checking if deleteNodeAtPosition method with empty list throws error
        doubleList.DeleteNodeAtPosition(-1);
        //checking append method
        doubleList.Append("Hello");
        doubleList.Append("World!");
        System.out.println(doubleList);
        //checking addfront method
        doubleList.AddFront("How");
        //checking insert method
        doubleList.Insert(2, "Cool,");
        System.out.println(doubleList);
        doubleList.AddFront("Front");
        //checking deleteNodeAtPosition method
        doubleList.DeleteNodeAtPosition(4);
        //checking getsize method
        System.out.println(doubleList.GetSize());
        System.out.println(doubleList);
        //Checking TraverseBackwards
        doubleList.TraverseBackwards();
        //Checking TraverseForwards as a palindrome print out
        doubleList.TraverseForwards();
        //blank print to break up palindrome
        System.out.println();
        //Checking delete methods
        doubleList.DeleteFront();
        doubleList.DeleteBack();
        System.out.println(doubleList);
        System.out.println(doubleList.GetSize()); 
    }
    
}