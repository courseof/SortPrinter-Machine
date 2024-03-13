import printer.ift.Printer;
import printer.imp.SortPrinter;
import sort.ift.Sort;
import sort.imp.BubbleSort;
import sort.imp.SelectionSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortPrinter printer = new SortPrinter();
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(3,3,3,2,1,1,2,3,2,1,2,3,1,2,3,2,1,5,5,2,1,7));

        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(3,3,3,2,1,1,2,3,2,1,2,3,1,2,3,2,1,5,5,2,1,7));

        Sort bubble = new BubbleSort();
        Sort selection = new SelectionSort();

        printer.insert(lst);
        printer.select(bubble);
        printer.run();
        printer.show();

        printer.insert(lst2); // setList가 더 좋아 보임
        printer.select(selection); //setSort가 더좋을까?
        printer.run();
        printer.show();


    }
}