public class Node<T> {
    //setting instance variables for node class
    T data;
    Node<T> next;
    Node<T> previous;

    //constructor for node class to intake data as a parameter
    public Node(T dt) {
        data = dt;
        next = null;
        previous = null;
    }
    //constructor for node class to intake data as a parameter and the next node
    public Node(T dt, Node<T> next) {
        data = dt;
        this.next = next;
        
    }
//constructor for node class to intake data as a parameter and the next and previous nodes
    public Node(T dt, Node<T> next, Node<T> previous) {
        data = dt;
        this.next = next;
        this.previous = previous;
    }
}
