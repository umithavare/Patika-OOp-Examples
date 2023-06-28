package MaceraOyunu;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obstacleNumber = this.randomObstacleNumber();

        System.out.println("Suan buradasiniz : " + this.getName());
        System.out.println("Tehlikeli olabilir dikkatli ol, burada " + obstacleNumber + " tane " +this.getObstacle().getName() + " Yasiyor");
        System.out.println("Savasmak icin 'S', Kacmak icin 'K' tusuna bas ");
        String selectChoice = input.nextLine().toUpperCase();
        if (selectChoice.equals("S") && combat(obstacleNumber)){
            System.out.println(this.getName() + " konumundaki tum dusmanlari yendiniz");
            if(this.award.equals("Water")){
                System.out.println("Su kazandiniz");
                getPlayer().getInventory().setWater(true);
            }else if (this.award.equals("FireWood")){
                System.out.println("Odun kazandiniz");
                getPlayer().getInventory().setFireWood(true);
            }else if (this.award.equals("food")) {
                System.out.println("Yemek kazandiniz");
                getPlayer().getInventory().setFood(true);
            }
            return true;
        }
        if (this.getPlayer().getHealth() <= 0){
            System.out.println("Oldunuz!!");
            return false;
        }
        return true;
    }
    public boolean combat(int obstacleNumber){
        for(int i = 1 ; i <= obstacleNumber; i++){
            this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
            playerStats();
            obstacleStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0){
                System.out.println("Vurmak icin 'V', Kacmak icin 'K' tusuna bas ");
                String selectCombat = input.nextLine().toUpperCase();
                if (selectCombat.equals("V")){
                    System.out.println("Siz vurdunuz");
                    this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getObstacle().getHealth() > 0){
                        System.out.println();
                        System.out.println(this.getObstacle().getName() + " size vurdu!!");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (obstacleDamage < 0){
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        afterHit();
                    }
                }
                else return false;
            }
            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()){
                System.out.println("Savasi kazandiniz");
                System.out.println(this.getObstacle().getAward() + " Para kazandiniz");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("Guncel paraniz : " + this.getPlayer().getMoney());
            }
            else return false;
        }
        return true;
    }
    public void afterHit(){
        System.out.println("Caniniz : " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " Cani : " + this.getObstacle().getHealth() );
        System.out.println("--------------------");
    }

    public void playerStats(){
        System.out.println("Oyuncu degerleri");
        System.out.println("-------------------");
        System.out.println("Saglik : " + this.getPlayer().getHealth());
        System.out.println("Silah : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Zirh : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Bloklama : " +this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Bakiye : " + this.getPlayer().getMoney());
        System.out.println();
    }
    public void obstacleStats(int i){
        System.out.println(i + "." + this.getObstacle().getName() + " Degerleri");
        System.out.println("-------------------");
        System.out.println("Saglik : " + this.getObstacle().getHealth());
        System.out.println("Hasar : " + this.getObstacle().getDamage());
        System.out.println("Odulu : " + this.getObstacle().getAward());
        System.out.println();
    }
    public int randomObstacleNumber(){ //Random sayıda canavar üretmek için kullanıldı
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) +1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }


    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
