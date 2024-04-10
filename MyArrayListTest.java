import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyArrayListTest {
    @Test
    public void AddStart_Add_ArrayListContainOne() {
        //Arrange
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();

        //Act
        myArrayList.AddStart(20);
        myArrayList.AddStart(18);
        myArrayList.AddStart(819);
        myArrayList.AddStart(1);

        //Assert
        assertEquals(myArrayList.Size(), 4); //the size should be equal to 1
        assertEquals(myArrayList.GetElementAtIndex(0), 1);
        assertEquals(myArrayList.GetElementAtIndex(1), 819);
        assertEquals(myArrayList.GetElementAtIndex(2), 18);
        assertEquals(myArrayList.GetElementAtIndex(3), 20);

    }
}
