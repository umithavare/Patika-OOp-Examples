package CollectionInterface;

import java.util.Comparator;

public class OrderNoteComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) { // negatif çıkarsa o2 degerını uste yazacak
        return o1.getNote() - o2.getNote();
    }
}
