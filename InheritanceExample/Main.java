package InheritanceExample;

public class Main {
    public static void main(String[] args) { // subclasslardan nesne oluşturup daha sonra main metodu içinde çağırıyoruz.
      Akademisyen akademisyen = new Akademisyen("umithavare","911","uh@gmail.com","ceng","doc");
        System.out.println(akademisyen.getBolum());
        System.out.println(akademisyen.getAdSoyad());
        System.out.println(akademisyen.getEposta());
        System.out.println(akademisyen.getUnvan());
        akademisyen.derseGir();
        LabAsistani labAsistani = new LabAsistani("XX","12","sss","cd","kkk","21");
        labAsistani.derseGir();
    }
}