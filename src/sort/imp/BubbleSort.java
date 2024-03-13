package sort.imp;

import sort.ift.Sort;

import java.util.ArrayList;

public class BubbleSort implements Sort {
    @Override
    public void doSort(ArrayList<Integer> sortList) {
        for(int cycle = 0; cycle < sortList.size(); cycle ++) {
            for(int i = 0; i < sortList.size() - 1 - cycle; i ++) {
                if(sortList.get(i) > sortList.get(i + 1)){
                    //swap
                    int tmp = sortList.get(i);
                    sortList.set(i, sortList.get(i + 1));
                    sortList.set(i + 1, tmp);
                }
            }
        }
    }
}
