public class DoublyLinkedList<T> {
        //initializing instance varaibles head and tail to null and size to 0
        private Node<T> head = null, tail = null;
        private int size = 0;
    
        //Getter for header or start of linked list
        public Node<T> GetHead() {
            return head;
        }
    
        //Getter for tail of end of linked list
        public Node<T> GetTail() {
            return tail;
        }

        //Method to traverse from the head to the tail
        public void TraverseForwards() {
            //Initializing the newNode
            Node<T> newNode = head;
            //while loop to continue through loop because we don't know number of nodes
            while (newNode != null) {
                //printing each nodes data
                System.out.print(newNode.data + " ");
                //newNode will become next node along the line until it equals null
                newNode = newNode.next;
            }
        }

        //Traverse from the tail to the head; same as above but reverse ordering
        public void TraverseBackwards() {
            Node<T> newNode = tail;
            while (newNode != null) {
                System.out.print(newNode.data + " ");
                newNode = newNode.previous;
            }
        }
    
        public void AddFront(T data) {
            //Initializing newNode
            Node<T> newNode = new Node<T>(data);
            //conditional for empty array. Head and tail should be the newNode
            if (head == null) {
                head = tail = newNode;
                //rest of conditional using swap to continue established head and tail correlations
            } else {
                newNode.next = head;
                head.previous = newNode;
                head = newNode;
            }
            //incrementing size since we are adding to list
            size++;
        }
    
        /**
         * Adds a new node to the end of the LinkedList
         */
        public void Append(T data) {
            //initializing newNode
            Node<T> newNode = new Node<T>(data);
            //if empty list initialize both head and tail to be newNode
            if (tail == null) {
                head = newNode;
                tail = newNode;
                //continuing the swap formula to keep established head and tail relationships
            } else {
                tail.next = newNode;
                newNode.previous = tail; 
                tail = newNode;
            }
            //incrementing size since adding to list
            size++;
        }
        
        // go to the element prior to where we want to insert our element
        public void Insert(int index, T data) {
            //initializing newNode
            Node<T> newNode = new Node<T>(data);
            //adding to front for an index at the beginning or out of bounds of current list size
            if(index <= 1) {
                AddFront(data);
            } else {
                //initializing currentNode to be at the head node
            Node<T> currentNode = head;
            //initializing the current index to coincide with the head node
            int currentIndex = 1;
            //while loop to interate through until desired position is found
            while(currentNode != null && currentIndex < index) {
                currentNode = currentNode.next;
                currentIndex++;
            }
            //they are asking to add at the last element
            if (currentNode == null) {
                Append(data);
            } else {
                //using swap to continue to maintain node relationships
                newNode.next = currentNode;
                newNode.previous = currentNode.previous;
                currentNode.previous.next = newNode;
                currentNode.previous = newNode;
            }
        }
        }
    
        @Override
        public String toString() {
            Node<T> currentNode = head;
            String returnString = "";
    
            while (currentNode != null) {
                returnString += " " + currentNode.data.toString();
                currentNode = currentNode.next;
            }
    
            return returnString;
        }
    
        public void DeleteFront() {
            //if list is empty, return
            if (head == null) {
                return;
            }
            //if list is only 1 element
            if (head == tail) {
                head = null;
                tail = null;
                return;
            }
            //initializing newNode equal to head
            Node<T> newNode = head;
            //using swap to maintain node connections
            head = head.next;
            head.previous = null;
            newNode.next = null;
            //decrement size
            size--;
        }
    
        public void DeleteBack() {
            //if list is empty, return
            if (tail == null) {
                return;
            }
            //if list is only 1 element
            if (head == tail) {
                head = null;
                tail = null;
                return;
            }
            //initializing newNode equal to tail
            Node<T> newNode = tail;
            //using swap to maintain node connections 
            tail = tail.previous;
            tail.next = null;
            newNode.previous = null;
            //decrement size since we are deleting
            size--;
        }
    
        /**
         * This will find the data and delete it
         * @param position of the data of whose node we want to delete
         */
        public void DeleteNodeAtPosition(int position) {
            //checking if list is empty
            if(head == null) {
                return;
            }
            //if its the first position we can call deletefront
            if(position == 1) {
                DeleteFront();
                return;
            }
            //initializing currentNode at head and position of 1
            Node<T> currentNode = head;
            int index = 1;
            //iterating thru the list until we find the desired position
            while (currentNode != null && index != position) {
                currentNode = currentNode.next;
                index++;
            }
            //error handling if out of bounds
            if (currentNode == null) {
                System.out.println("Position entered is incorrect");
                return;
            }
            //if current position is tail use deleteback method to delete item
            if(currentNode == tail) {
                DeleteBack();
                return;
            }
            //swap being used again to maintain current connections
            currentNode.previous.next = currentNode.next;
            currentNode.next.previous = currentNode.previous;
            currentNode.previous = null;
            currentNode.next = null;
            // size--;
    
        }
        
        public int GetSize() {
            return size;
        }
    
        public boolean IsEmpty() {
            return head == null;
            }
        }

