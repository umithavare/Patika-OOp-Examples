package BookSorter;

import java.util.Comparator;

public class Books implements Comparable<Books> {
    private String name;
    private int pageNumber;
    private String writerName;
    private int releaseYear;

    public Books(String name, int pageNumber, String writerName, int releaseYear) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.writerName = writerName;
        this.releaseYear = releaseYear;
    }

    @Override   // Sayfa Sayisina gore siralama
    public int compareTo(Books o) {
        return this.getPageNumber() - o.getPageNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }


}
