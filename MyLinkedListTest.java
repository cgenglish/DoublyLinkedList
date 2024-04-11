import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class MyLinkedListTest {


    @Test
    public void Append_SingleNode_ShouldUpdateTail() {
        //Arrange
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        
        //Act
        myLinkedList.Append("Hello");

        //Assert
        assertEquals(myLinkedList.GetHead(), myLinkedList.GetTail());
        assertEquals(1, myLinkedList.GetSize());
    }

    @Test
    public void Append_MultipleNodes_ShouldUpdateTail() {
        //Arrange
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        
        //Act
        myLinkedList.Append("Hello");
        myLinkedList.Append("Art");
        myLinkedList.Append("Gato");
        myLinkedList.Append("Apple");

        //Assert
        assertNotEquals(myLinkedList.GetHead(), myLinkedList.GetTail());
        assertEquals(4, myLinkedList.GetSize());
        assertEquals("Apple", myLinkedList.GetTail().data);
        assertEquals("Hello", myLinkedList.GetHead().data);

    }

    // @Test
    // public void Insert_InvalidIndex_ShouldThrowException() {
    //     //Arrange
    //     MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
    //     myLinkedList.AddFront(3);

    //     //Act
    //     myLinkedList.Insert(4, 2);

    //     //Assert
    //     assertThrows(IndexOutOfBoundsException.class, () -> myLinkedList.Insert(-1, 2));
    // }

    @Test
    public void Insert_InvalidIndex_ShouldLeaveListUnchanged() {
        // Arrange
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.AddFront(3);
 
        // Act
        myLinkedList.Insert(4, 2);
 
        //Assert
        assertEquals(1, myLinkedList.GetSize());
    }

    @Test
    public void Insert_IntoLastPosition_ShouldUpdateTail() {
        //Arrange
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.AddFront(3);
        myLinkedList.AddFront(3);

        //Act
        myLinkedList.Insert(2, 4);
        Integer iInteger = Integer.valueOf(4);

        //Assert
        assertEquals(3, myLinkedList.GetSize());
        assertEquals(Integer.valueOf(4), myLinkedList.GetTail().data);
    }


    @Test
    public void AddFront_SingleNode_ShouldUpdateHeadAndTail() {
        //Arrange
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();


        //Act
        myLinkedList.AddFront("Hello");

        //Assert
        assertEquals(myLinkedList.GetHead(), myLinkedList.GetTail());

    }

    @Test
    public void AddFront_MultipleNodes_ShouldUpdateHeadAndTail() {
        //Arrange
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();


        //Act
        myLinkedList.AddFront("Hello");
        myLinkedList.AddFront("Gato");

        //Assert
        assertNotEquals(myLinkedList.GetHead(), myLinkedList.GetTail());
        assertEquals(myLinkedList.GetHead().data, "Gato");
        assertEquals(myLinkedList.GetTail().data, "Hello");

    }


    @Test
    public void DeleteNodeBasedOnValue_EmptyList_ListShouldRemainEmpty() {
        //Arrange-Act-Assert

        //Arrange
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();

        //Act
        myLinkedList.DeleteNodeBasedOnValue("Art");

        //Assert
        assertEquals(myLinkedList.GetSize(), 0);

    }

    @Test
    public void DeleteNodeBasedOnValue_SingleNodeList_ShouldDeleteSingleNode() {
        //Arrange-Act-Assert

        //Arrange
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.AddFront("Hello");

        //Act
        myLinkedList.DeleteNodeBasedOnValue("Hello");

        //Assert
        assertEquals(0, myLinkedList.GetSize());

    }

    @Test
    public void DeleteNodeBasedOnValue_ElementNotInList_ShouldNotChangeList() {
        //Arrange-Act-Assert

        //Arrange
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.AddFront("Hello");
        myLinkedList.AddFront("Hi");
        myLinkedList.AddFront("Gato");

        //Act
        myLinkedList.DeleteNodeBasedOnValue("Art");

        //Assert
        assertEquals(3, myLinkedList.GetSize());
        //assertEquals(1, myLinkedList.GetSize());

    }

    @Test
    public void DeleteFront_ListHadOneElement_ShouldUpdateHeadAndTailToNull() {
        //Arrange
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.AddFront(3);
        

        //Act
        myLinkedList.DeleteFront();

        //Assert
        assertEquals(0, myLinkedList.GetSize());
        assertEquals(null, myLinkedList.GetHead());
        assertEquals(null, myLinkedList.GetTail());
    }

    @Test
    public void DeleteBack_ListHadMultipleElements_ShouldUpdateTail() {
        //Arrange
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.AddFront(3);
        myLinkedList.AddFront(4);

        //Act
        myLinkedList.DeleteBack();

        //Assert
        assertEquals(1, myLinkedList.GetSize());
        assertEquals(null, myLinkedList.GetHead().next);
        assertEquals(myLinkedList.GetHead().data, myLinkedList.GetTail().data);
    }

    @Test
    public void DeleteNodeBasedOnValue_ElementIsLastOnList_ShouldDeleteElement() {
        //Arrange
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.AddFront(3);
        myLinkedList.AddFront(4);
        myLinkedList.AddFront(5);
        myLinkedList.AddFront(6);

        //Act
        myLinkedList.DeleteNodeBasedOnValue(3);
        Integer iInteger = Integer.valueOf(10);

        //Assert
        assertEquals(3, myLinkedList.GetSize());
        assertEquals((Integer)4, myLinkedList.GetTail().data);

    }

}