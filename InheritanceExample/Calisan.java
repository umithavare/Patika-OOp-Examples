package InheritanceExample;

public class Calisan {
    private String adSoyad;
    private String telefon;
    private String eposta;

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public Calisan(String adSoyad, String telefon, String eposta){
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.eposta = eposta ;
    }

    public void giris(){
        System.out.println(this.adSoyad + " Fakulteye giris yapti " );
    }
    public void cikis(){
        System.out.println(this.adSoyad + " Fakulteden cikis yapti ");
    }
    public void yemekhane(){
        System.out.println(this.adSoyad + " Yemekhaneye giris yapti");
    }
}
