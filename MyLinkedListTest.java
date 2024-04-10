import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class MyLinkedListTest {
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

        //Act
        myLinkedList.DeleteNodeBasedOnValue("Art");

        //Assert
        assertEquals(1, myLinkedList.GetSize());
        //assertEquals(1, myLinkedList.GetSize());

    }
}