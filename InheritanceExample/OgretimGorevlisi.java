package InheritanceExample;

public class OgretimGorevlisi extends Akademisyen{
    private String kapiNo;

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan, String kapiNo) {
        //Constructor method ekleyip kalitim sayesinde aldigimiz ozellikleri kullaniyoruz
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.kapiNo = kapiNo;
    }
    public void senatoToplanti(){
        System.out.println(this.getAdSoyad() + " Senato toplantisina katildi");
    }
    public void sinavYap(){
        System.out.println(this.getAdSoyad() + " Sinav yapiyor");
    }
}
