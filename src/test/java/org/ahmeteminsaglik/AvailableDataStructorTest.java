package org.ahmeteminsaglik;


import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AvailableDataStructorTest {
    private AvailableAlgorithm availableAlgorithm = new AvailableAlgorithm();

    @Test
    @DisplayName("Get Available Data Structor")
    void testGetEnumDataStructorList() {
        EnumDataStructor[] dataStructorArr = {
                EnumDataStructor.ARRAY,
                EnumDataStructor.ARRAYLIST,
                EnumDataStructor.HASHMAP,
                EnumDataStructor.SEARCHNODE_V1,
                EnumDataStructor.SEARCHNODE_V2
        };
        List<EnumDataStructor> list = availableAlgorithm.getAvailableEnumDataStructorList();

        int expected = dataStructorArr.length;
        int actual = list.size();
        assertEquals(expected,actual);

        for (int i = 0; i < dataStructorArr.length; i++) {
            boolean result = list.contains(dataStructorArr[i]);
            assertTrue(result);
        }
    }


}