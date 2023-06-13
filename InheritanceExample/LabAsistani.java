package InheritanceExample;

public class LabAsistani extends Asistan{
    public LabAsistani(String adSoyad, String telefon, String eposta, String bolum, String unvan, String ofisSaati) {
        //Constructor method ekleyip kalitim sayesinde aldigimiz ozellikleri kullaniyoruz
        super(adSoyad, telefon, eposta, bolum, unvan, ofisSaati);
    }
    public void lablaraGir(){
        System.out.println(this.getAdSoyad() + " Lab derslerine giriyor ");
    }
    // public void derseGir() // bunu yazmamiza gerek yok cunku asistan sinifinin Akademisyen sinifindan miras aldıgı metodlarda bulunuyor

}
