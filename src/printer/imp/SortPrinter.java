package printer.imp;

import printer.ift.Printer;
import sort.ift.Sort;
import sort.imp.BubbleSort;
import sort.imp.SelectionSort;

import java.util.ArrayList;

public class SortPrinter implements Printer {
    ArrayList<Integer> sortList;
    Sort sort;
    @Override
    public void insert(ArrayList<Integer> printlist) {
        this.sortList = printlist;
    }

    @Override
    public void show() {
        String type="";
        if(sort instanceof BubbleSort){
            type = "Result of bubble sort : ";
        }else if(sort instanceof SelectionSort) {
            type = "Result of selection sort : ";
        }
        System.out.println(type + sortList);
    }
    public void run(){ //public void run(){ sort가 맞는 것 같음
        sort.doSort(sortList);
    }

    public void select(Sort sort){
        this.sort = sort;
    }
}
