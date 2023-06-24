package MaceraOyunu;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    public void start(){
        System.out.println("Macera Oyununa Hos Geldiniz.");
        System.out.print("Lutfen bir isim giriniz: ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName() + " Hos Geldiniz");
        System.out.println("lutfen bir karakter seciniz: ");
        player.selectChar();
        Location location = null;
        while (true){
                player.printInfo();
                System.out.println();
                System.out.println("----------  Bolgeler  ----------");
                System.out.println();
                System.out.println("1 - Guvenli Ev >> Burasi guvenlidir. Dusman yok");
                System.out.println("2 - magaza >> Silah ve zirh satin alabilirsiniz");
                System.out.print("0 - Cikis yap ve oyunu sonlandir");
                int selectLocation = input.nextInt();
                switch (selectLocation){
                    case 0:
                        location = null;
                        break;
                    case 1 :
                        location = new SafeHouse(player);
                        break;
                    case 2:
                        location = new ToolStore(player);
                        break;
                    default:
                        location = new SafeHouse(player);
                        break;
                }
                if (location == null){
                    System.out.println("Oyun bitti Tekrardan bekleriz");
                    break;
                }
                if (!location.onLocation()){
                    System.out.println("Oldunuz!! Oyun bitti");
                    break;
                }
        }
    }

}
