package MaceraOyunu;

import java.util.Scanner;

public class Player  {
    private int damage;
    private int health;
    private int money ;
    private String name;
    private String charName;
    private Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }


    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    Inventory inventory = new Inventory();

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void selectChar(){
        GameCharacter[] charList = {new Samurai(),new Archer(),new Knight()};
        System.out.println("Karakterler");
        for (GameCharacter gameCharacter:charList) {
            System.out.println("ID:" + gameCharacter.getId() +
                    "\tKarakter:" + gameCharacter.getName() +
                    "\tHasar:" + gameCharacter.getDamage() +
                    "\tSaglikk:" + gameCharacter.getHealth() +
                    "\tPara:"+ gameCharacter.getMoney());
        }
        System.out.println("****************************");
        System.out.print("Lutfen bir Karakter Seciniz: ");
         int selectChar = input.nextInt();
         switch (selectChar){
             case 1:
                 initPlayer(new Samurai());
                 break;
             case 2:
                 initPlayer(new Archer());
                 break;
             case 3:
                 initPlayer(new Knight());
                 break;
             default:
                 initPlayer(new Samurai());
         }
        System.out.println("Karakter: " + this.getCharName() +
                "\tHasar:"+ this.getDamage() +
                "\tSaglik:" + this.getHealth() +
                "\tPara:" + this.getMoney());

    }

    public void initPlayer(GameCharacter gameCharacter){
        this.setDamage(gameCharacter.getDamage());
        this.setHealth(gameCharacter.getHealth());
        this.setMoney(gameCharacter.getMoney());
        this.setCharName(gameCharacter.getName());
    }
}
