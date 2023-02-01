package org.ahmeteminsaglik;


import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;
import org.ahmeteminsaglik.enums.utility.EnumDataUtility;

import java.util.ArrayList;
import java.util.List;

public class AvailableAlgorithm {

    public List<EnumDataStructor> getAvailableEnumDataStructorList() {
        return EnumDataUtility.getEnumDataStructorList();
    }

    public List<EnumSortAlgorithm> getAvaiableEnumSortAlgorithmListWithGivenDataStructor(EnumDataStructor enumDataStructor) {
        List<EnumSortAlgorithm> list = new ArrayList<>();
        switch (enumDataStructor) {
            case ARRAY:
            case ARRAYLIST:
                list.addAll(EnumDataUtility.getEnumSortAlgorithmList());
                break;
            case HASHMAP:
            case SEARCHNODE_V1:
            case SEARCHNODE_V2:
                list.add(EnumSortAlgorithm.NO_SORT);
                break;
            default:
                System.err.println("---> ERROR OCCURED : Invalid available EnumDataStructor is given to Switch Parameter : " + enumDataStructor.getName());
        }
        return list;
    }

    public List<EnumSearchAlgorithm> getAvailableEnumSearchAlgorithmListWithGivenDataStructor(EnumDataStructor enumDataStructor) {
        List<EnumSearchAlgorithm> list = new ArrayList<>();
        switch (enumDataStructor) {
            case ARRAY:
            case ARRAYLIST:
                list.addAll(EnumDataUtility.getEnumSearchAlgorithmList());
                list.remove(EnumSearchAlgorithm.SEARCH_NODE);
                list.remove(EnumSearchAlgorithm.HASHMAP);
                break;
            case HASHMAP:
                list.add(EnumSearchAlgorithm.HASHMAP);
            case SEARCHNODE_V1:
            case SEARCHNODE_V2:
                list.add(EnumSearchAlgorithm.SEARCH_NODE);
                break;
            default:
                System.err.println("---> ERROR OCCURED : Invalid available EnumDataStructor is given to Switch Parameter : " + enumDataStructor.getName());
        }
        return list;
    }


}
