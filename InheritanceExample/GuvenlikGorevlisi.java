package InheritanceExample;

public class GuvenlikGorevlisi extends Memur{
    private String belge;

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }

    public GuvenlikGorevlisi(String adSoyad, String telefon, String eposta, String departman, String mesai, String belge) {
        //Constructor method ekleyip kalitim sayesinde aldigimiz ozellikleri kullaniyoruz
        super(adSoyad, telefon, eposta, departman, mesai);
        this.belge = belge;
    }
    public void nobet(){
        System.out.println(this.getAdSoyad() + "Suan nobet tutuyor.");
    }
}
