package printer.ift;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public interface Printer {

    //출력할 데이터를 받는다
    void insert(ArrayList<Integer> list);

    //출력한다.
    void show();

}
