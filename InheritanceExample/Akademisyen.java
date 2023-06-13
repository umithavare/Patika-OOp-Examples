package InheritanceExample;

public class Akademisyen extends Calisan{
    private String bolum;
    private String unvan;

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public Akademisyen(String adSoyad, String telefon, String eposta, String bolum, String unvan){
        //Constructor method ekleyip kalitim sayesinde aldigimiz ozellikleri kullaniyoruz
        super(adSoyad, telefon, eposta);
        this.bolum = bolum;
        this.unvan = unvan;
    }
    public void derseGir(){
        System.out.println(this.getAdSoyad() + " Derse giris Yapti ");
    }
}
