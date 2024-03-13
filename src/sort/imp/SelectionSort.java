package sort.imp;

import sort.ift.Sort;

import java.util.ArrayList;

public class SelectionSort implements Sort {
    @Override
    public void doSort(ArrayList<Integer> sortList) {
        for(int i = 0; i < sortList.size(); i++) {
            for(int j = i + 1; j < sortList.size(); j ++) {
                if(sortList.get(i) > sortList.get(j)){
                    int tmp = sortList.get(i);
                    sortList.set(i, sortList.get(j));
                    sortList.set(j, tmp);
                }
            }
        }
    }
}
