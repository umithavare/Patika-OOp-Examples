package MaceraOyunu;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Magaza");
    }
    @Override
    public boolean onLocation() {
        System.out.println("Magazaya hos geldiniz!!");
        System.out.println("1- Silahlar");
        System.out.println("2- Zirhlar");
        System.out.println("3- Cikis Yap");
        System.out.println("Lutfen bir secim yapiniz");
        int selectCase = Location.input.nextInt();
        while(selectCase < 1 || selectCase > 3){
            System.out.print("Lutfen gecerli bir deger giriniz:");
            selectCase = Location.input.nextInt();
        }
        switch (selectCase){
            case 1:
                printWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("Tekrardan bekleriz");
                return true;
        }
        return true;
    }
    public void printWeapon(){
        System.out.println("---------Silahlar---------");
        System.out.println();
        for (Weapon w : Weapon.weapons()){
            System.out.println(w.getId() + " - " +
                    w.getName() + " s< Para : " +
                    w.getPrice() + " , Hasar : " +
                    w.getDamage() + ">" );
        }
        System.out.println("Bir silah seciniz");
    }
    public void printArmor(){
        System.out.println("Zirhlar");
    }

}
