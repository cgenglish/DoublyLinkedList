import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import javax.sound.sampled.SourceDataLine;

public class DoublyLinkedListTest {

@Test
public void AddFront_SingleNode_ShouldUpdateHeadAndTail() {
    //Arrange
    DoublyLinkedList<String> myDouble = new DoublyLinkedList<String>();


    //Act
    myDouble.AddFront("Hola");

    //Assert
    assertEquals(myDouble.GetHead(), myDouble.GetTail());
    assertEquals(1, myDouble.GetSize());

}

@Test
public void Append_MultipleNodes_ShouldUpdateHeadAndTail() {
    //Arrange
    DoublyLinkedList<String> myDouble = new DoublyLinkedList<String>();


    //Act
    myDouble.Append("Hola");
    myDouble.Append("Dog");
    myDouble.Append("Cat");
    myDouble.Append("Horse");


    //Assert
    assertNotEquals(myDouble.GetHead(), myDouble.GetTail());
    assertEquals(4, myDouble.GetSize());
    assertEquals(myDouble.GetHead().data, "Hola");
    assertEquals(myDouble.GetTail().data, "Horse");

}

@Test
public void DeletFrontAndDeleteBack_EmptyList_ShouldReturnNothing() {
    //Arrange
    DoublyLinkedList<String> myDouble = new DoublyLinkedList<String>();


    //Act
    myDouble.DeleteFront();
    myDouble.DeleteBack();

    //Assert
    assertEquals(myDouble.GetHead(), myDouble.GetTail());
    assertEquals(0, myDouble.GetSize());
    

}

@Test
public void Insert_InvalidIndex_ShouldAddToEndOfListANDUpdateHeadPlusTail() {
    // Arrange
    DoublyLinkedList<String> myDouble = new DoublyLinkedList<String>();
    myDouble.AddFront("Tree");

    // Act
    myDouble.Insert(10, "Fower");

    //Assert
    assertEquals(2, myDouble.GetSize());
    assertNotEquals(myDouble.GetHead(), myDouble.GetTail());
    assertEquals(myDouble.GetHead().data, "Tree");
    assertEquals(myDouble.GetTail().data, "Fower");
}
}