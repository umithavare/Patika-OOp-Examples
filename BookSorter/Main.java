package BookSorter;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Books> book = new TreeSet<>(new OrderByNameComparator()); // Sorting by book name

        book.add(new Books("deneme",213,"mehmet",2014));
        book.add(new Books("adeneme",400,"asad",2015));
        book.add(new Books("bdeneme",100,"xcz",2018));
        book.add(new Books("fdeneme",250,"ds",2004));
        book.add(new Books("cdeneme",130,"mehgdsmet",2009));
        System.out.println("Sorted by book name ");
        for (Books element : book){
            System.out.println(element.getName());
        }
        System.out.println();

        TreeSet<Books> book2 = new TreeSet<>(Books::compareTo);        // Sorting by Page Number
        book2.addAll(book);
        System.out.println("Sorted by page Number");
        for (Books element : book2){
            System.out.println(element.getName() + " " + element.getPageNumber());
        }
    }
}
