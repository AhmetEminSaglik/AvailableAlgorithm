package org.ahmeteminsaglik;


import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AvailableSortAlgorithmTest {
    private AvailableAlgorithm availableAlgorithm;

    @BeforeEach
    void initializeObject() {
        availableAlgorithm = new AvailableAlgorithm();
    }

    @Test
    @DisplayName("Get Available Sort Algorithm With Array Data Structor")
    @Order(1)
    void testGetEnumSortAlgorithmListAvailableForArray() {
        List<EnumSortAlgorithm> list = availableAlgorithm
                .getAvailableEnumSortAlgorithmListWithGivenDataStructor(EnumDataStructor.ARRAY);

        EnumSortAlgorithm[] availableSortAlgorithmWithArray = {
                EnumSortAlgorithm.NO_SORT,
                EnumSortAlgorithm.SELECTION_SORT,
                EnumSortAlgorithm.INSERTION_SORT,
                EnumSortAlgorithm.BUBBLE_SORT,
                EnumSortAlgorithm.MERGE_SORT,
                EnumSortAlgorithm.HEAP_SORT,
                EnumSortAlgorithm.QUICK_SORT,
                EnumSortAlgorithm.INTRO_SORT,
                EnumSortAlgorithm.TIM_SORT,
        };

        int expected = availableSortAlgorithmWithArray.length;
        int actual = list.size();
        assertEquals(expected,actual);

        for (int i = 0; i < availableSortAlgorithmWithArray.length; i++) {
            boolean result = list.contains(availableSortAlgorithmWithArray[i]);
            assertTrue(result);
        }
    }

    @Test
    @DisplayName("Get Available Sort Algorithm With ArrayList Data Structor")
    @Order(2)
    void testGetEnumSortAlgorithmListAvailableForArrayList() {
        List<EnumSortAlgorithm> list = availableAlgorithm
                .getAvailableEnumSortAlgorithmListWithGivenDataStructor(EnumDataStructor.ARRAYLIST);

        EnumSortAlgorithm[] availableSortAlgorithmWithArray = {
                EnumSortAlgorithm.NO_SORT,
                EnumSortAlgorithm.SELECTION_SORT,
                EnumSortAlgorithm.INSERTION_SORT,
                EnumSortAlgorithm.BUBBLE_SORT,
                EnumSortAlgorithm.MERGE_SORT,
                EnumSortAlgorithm.HEAP_SORT,
                EnumSortAlgorithm.QUICK_SORT,
                EnumSortAlgorithm.INTRO_SORT,
                EnumSortAlgorithm.TIM_SORT,
        };

        int expected = availableSortAlgorithmWithArray.length;
        int actual = list.size();
        assertEquals(expected,actual);

        for (int i = 0; i < availableSortAlgorithmWithArray.length; i++) {
            boolean result = list.contains(availableSortAlgorithmWithArray[i]);
            assertTrue(result);
        }
    }

    @Test
    @DisplayName("Get Available Sort Algorithm With Hashmap Data Structor")
    @Order(3)
    void testGetEnumSortAlgorithmListAvailableForHashMap() {
        List<EnumSortAlgorithm> list = availableAlgorithm
                .getAvailableEnumSortAlgorithmListWithGivenDataStructor(EnumDataStructor.HASHMAP);

        EnumSortAlgorithm[] sortAlgorithm = {
                EnumSortAlgorithm.NO_SORT
        };

        int expected = sortAlgorithm.length;
        int actual = list.size();
        assertEquals(expected,actual);

        for (int i = 0; i < sortAlgorithm.length; i++) {
            boolean result = list.contains(sortAlgorithm[i]);
            assertTrue(result);
        }
    }

    @Test
    @DisplayName("Get Available Sort Algorithm With SearchNodeV1 Data Structor")
    @Order(3)
    void testGetEnumSortAlgorithmListAvailableForSearchNodeV1() {
        List<EnumSortAlgorithm> list = availableAlgorithm
                .getAvailableEnumSortAlgorithmListWithGivenDataStructor(EnumDataStructor.SEARCHNODE_V1);

        EnumSortAlgorithm[] sortAlgorithm = {
                EnumSortAlgorithm.NO_SORT
        };

        int expected = sortAlgorithm.length;
        int actual = list.size();
        assertEquals(expected,actual);

        for (int i = 0; i < sortAlgorithm.length; i++) {
            boolean result = list.contains(sortAlgorithm[i]);
            assertTrue(result);
        }
    }

    @Test
    @DisplayName("Get Available Sort Algorithm With SearchNodeV2 Data Structor")
    @Order(4)
    void testGetEnumSortAlgorithmListAvailableForSearchNodeV2() {
        List<EnumSortAlgorithm> list = availableAlgorithm
                .getAvailableEnumSortAlgorithmListWithGivenDataStructor(EnumDataStructor.SEARCHNODE_V2);

        EnumSortAlgorithm[] sortAlgorithm = {
                EnumSortAlgorithm.NO_SORT
        };

        int expected = sortAlgorithm.length;
        int actual = list.size();
        assertEquals(expected,actual);

        for (int i = 0; i < sortAlgorithm.length; i++) {
            boolean result = list.contains(sortAlgorithm[i]);
            assertTrue(result);
        }
    }
}