package tests;

import static org.mockito.Mockito.*;

public class Test {

    //Let's import Mockito statically so that the code looks clearer


    //mock creation
    List mockedList = mock(List.class);

    //using mock object
    mockedList.add("one");
    mockedList.clear();

    //verification
    verify(mockedList).add("one");
    verify(mockedList).clear();



}
