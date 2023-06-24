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
                buyWeapon();
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

    }
    public void buyWeapon(){
        System.out.println("Bir silah seciniz");
        int selectWeaponId = input.nextInt();
        while(selectWeaponId < 1 || selectWeaponId > Weapon.weapons().length){
            System.out.print("Lutfen gecerli bir deger giriniz:");
            selectWeaponId = Location.input.nextInt();
        }
        Weapon selectedWeapon = Weapon.getWeaponById(selectWeaponId);
        if (selectedWeapon != null){
            if (selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                System.out.println("Yeterli bakiye bulunmamaktadir");
            }
            else {
                System.out.println(selectedWeapon.getName() + " silahini satin aldiniz.");
                int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan Bakiyeniz : " + this.getPlayer().getMoney());
                System.out.println("onceki silahiniz: " + this.getPlayer().getInventory().getWeapon().getName());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                System.out.println("Yeni silahiniz: " + this.getPlayer().getInventory().getWeapon().getName());
            }
        }
    }
    public void printArmor(){
        System.out.println("Zirhlar");
    }

}
