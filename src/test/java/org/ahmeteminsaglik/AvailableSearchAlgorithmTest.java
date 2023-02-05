package org.ahmeteminsaglik;


import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AvailableSearchAlgorithmTest {
    private AvailableAlgorithm availableAlgorithm;

    @BeforeEach
    void initializeObject() {
        availableAlgorithm = new AvailableAlgorithm();
    }

    @Test
    @DisplayName("Get Available Search Algorithm With Array Data Structor")
    @Order(1)
    void testGetEnumSearchAlgorithmListAvailableForArray() {
        List<EnumSearchAlgorithm> list = availableAlgorithm.getAvailableEnumSearchAlgorithmListWithGivenDataStructor(EnumDataStructor.ARRAY);

        EnumSearchAlgorithm[] searchAlgorithmArr = {
                EnumSearchAlgorithm.LINEAR_SEARCH,
                EnumSearchAlgorithm.BINARY_SEARCH,
                EnumSearchAlgorithm.TERNARY_SEARCH,
                EnumSearchAlgorithm.JUMP_SEARCH,
                EnumSearchAlgorithm.INTERPOLATION_SEARCH,
                EnumSearchAlgorithm.EXPONENTIAL_SEARCH,
                EnumSearchAlgorithm.FIBONACCI_SEARCH,
                EnumSearchAlgorithm.BREADTH_FIRST_SEARCH,
                EnumSearchAlgorithm.DEPTH_FIRST_SEARCH
        };

        int expected = searchAlgorithmArr.length;
        int actual = list.size();
        assertEquals(expected,actual);

        for (int i = 0; i < searchAlgorithmArr.length; i++) {
            boolean result = list.contains(searchAlgorithmArr[i]);
            assertTrue(result);
        }
    }

    @Test
    @DisplayName("Get Available Search Algorithm With ArrayList Data Structor")
    @Order(2)
    void testGetEnumSearchAlgorithmListAvailableForArrayList() {
        List<EnumSearchAlgorithm> list = availableAlgorithm
                .getAvailableEnumSearchAlgorithmListWithGivenDataStructor(EnumDataStructor.ARRAYLIST);

        EnumSearchAlgorithm[] searchAlgorithmArr = {
                EnumSearchAlgorithm.LINEAR_SEARCH,
                EnumSearchAlgorithm.BINARY_SEARCH,
                EnumSearchAlgorithm.TERNARY_SEARCH,
                EnumSearchAlgorithm.JUMP_SEARCH,
                EnumSearchAlgorithm.INTERPOLATION_SEARCH,
                EnumSearchAlgorithm.EXPONENTIAL_SEARCH,
                EnumSearchAlgorithm.FIBONACCI_SEARCH,
                EnumSearchAlgorithm.BREADTH_FIRST_SEARCH,
                EnumSearchAlgorithm.DEPTH_FIRST_SEARCH
        };

        int expected = searchAlgorithmArr.length;
        int actual = list.size();
        assertEquals(expected,actual);

        for (int i = 0; i < searchAlgorithmArr.length; i++) {
            boolean result = list.contains(searchAlgorithmArr[i]);
            assertTrue(result);
        }
    }


    @Test
    @DisplayName("Get Available Search Algorithm With Hashmap Data Structor")
    @Order(3)
    void testGetEnumSearchAlgorithmListAvailableForHashmap() {
        List<EnumSearchAlgorithm> list = availableAlgorithm
                .getAvailableEnumSearchAlgorithmListWithGivenDataStructor(EnumDataStructor.HASHMAP);

        EnumSearchAlgorithm[] searchAlgorithmArr = {
                EnumSearchAlgorithm.HASHMAP
        };

        int expected = searchAlgorithmArr.length;
        int actual = list.size();
        assertEquals(expected,actual);

        for (int i = 0; i < searchAlgorithmArr.length; i++) {
            boolean result = list.contains(searchAlgorithmArr[i]);
            assertTrue(result);
        }
    }

    @Test
    @DisplayName("Get Available Search Algorithm With SearchNodeV1 Data Structor")
    @Order(4)
    void testGetEnumSearchAlgorithmListAvailableForSearchNodeV1() {
        List<EnumSearchAlgorithm> list = availableAlgorithm
                .getAvailableEnumSearchAlgorithmListWithGivenDataStructor(EnumDataStructor.SEARCHNODE_V1);

        EnumSearchAlgorithm[] searchAlgorithmArr = {
                EnumSearchAlgorithm.SEARCH_NODE
        };

        int expected = searchAlgorithmArr.length;
        int actual = list.size();
        assertEquals(expected,actual);

        for (int i = 0; i < searchAlgorithmArr.length; i++) {
            boolean result = list.contains(searchAlgorithmArr[i]);
            assertTrue(result);
        }
    }


    @Test
    @DisplayName("Get Available Search Algorithm With SearchNodeV2 Data Structor")
    @Order(4)
    void testGetEnumSearchAlgorithmListAvailableForSearchNodeV2() {
        List<EnumSearchAlgorithm> list = availableAlgorithm
                .getAvailableEnumSearchAlgorithmListWithGivenDataStructor(EnumDataStructor.SEARCHNODE_V2);

        EnumSearchAlgorithm[] searchAlgorithmArr = {
                EnumSearchAlgorithm.SEARCH_NODE
        };

        int expected = searchAlgorithmArr.length;
        int actual = list.size();
        assertEquals(expected,actual);

        for (int i = 0; i < searchAlgorithmArr.length; i++) {
            boolean result = list.contains(searchAlgorithmArr[i]);
            assertTrue(result);
        }
    }
}