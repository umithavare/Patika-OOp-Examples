package BookSorter;

import java.util.Comparator;

public class OrderByNameComparator implements Comparator <Books> {

    // isme gore sıralayacak şekilde yazıldı.

    @Override
    public int compare(Books o1, Books o2) {
        return o1.getName().compareTo(o2.getName());
    }


}
