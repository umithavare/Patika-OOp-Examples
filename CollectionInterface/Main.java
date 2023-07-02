package CollectionInterface;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator());
        students.add(new Student("ahmet",20));
        students.add(new Student("damla",60));
        students.add(new Student("damla",60));
        students.add(new Student("mehmet",100));
        students.add(new Student("cemre",60));
        students.add(new Student("mustafa",20));
        for (Student s : students){
            System.out.println(s.getNote());
        }
    }
}
