package InheritanceExample;

public class BilgiIslem extends Memur{
    private String gorev;

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public BilgiIslem(String adSoyad, String telefon, String eposta, String departman, String mesai, String gorev) {
        //Constructor method ekleyip kalitim sayesinde aldigimiz ozellikleri kullaniyoruz
        super(adSoyad, telefon, eposta, departman, mesai);
        this.gorev = gorev;
    }
    public void networkKurulum(){
        System.out.println(this.getAdSoyad() + " Network Kurulumu yapiyor ");
    }
}
