package MaceraOyunu;

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
        String selectChoice = input.nextLine();
        selectChoice = selectChoice.toUpperCase();
        if (selectChoice.equals("S")){
            System.out.println("Savas basladi");
        }
        return true;
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
