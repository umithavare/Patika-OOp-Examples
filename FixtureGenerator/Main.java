package FixtureGenerator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan girdi almak için bir Scanner nesnesi oluşturduk
        Scanner input = new Scanner(System.in);

        // Takımlar listesi oluşturduk
        ArrayList<String> teams = new ArrayList<>();

        System.out.print("Lutfen takim sayisi giriniz: ");

        // Kullanıcıdan takım sayısını alıyoruz
        int teamNumber = input.nextInt();
        input.nextLine();

        // Kullanıcıdan her bir takımın adını alıp takımlar listesine ekliyoruz
        for (int i = 0 ; i < teamNumber ; i++){
            System.out.println(i+1 + ". Takimi giriniz");
            String teamName = input.nextLine();
            teams.add(teamName);
        }

        // Eğer takım sayısı tekse "Bay" adında bir takım ekliyoruz
        if (teams.size() % 2 == 1){
            teams.add("Bay");
        }

        // Tur sayısı, takım sayısının bir eksiği olarak belirlenir
        int roundNumber = teams.size() - 1;

        // Her tur için bir döngü başlatıyoruz
        for (int round = 0; round < roundNumber * 2; round++) {
            System.out.println();
            System.out.println("Round "  + (round + 1));

            // Takımların her birini ev sahibi ve deplasman olarak eşleştiriyoruz
            for (int i = 0; i < teams.size() / 2; i++) {
                String homeTeam;
                String awayTeam;

                // Tur sayısı çift veya tek olmasına göre ev sahibi ve deplasman takımları belirlenir
                if (round % 2 == 0) {
                    homeTeam = teams.get(i);
                    awayTeam = teams.get(teams.size() - 1 - i);
                } else {
                    awayTeam = teams.get(i);
                    homeTeam = teams.get(teams.size() - 1 - i);
                }

                // Ev sahibi ve deplasman takımlarını yazdırıyoruz
                System.out.println(homeTeam + " vs " + awayTeam);
            }

            // Son takımı listeden kaldırıp ikinci pozisyona ekliyoruz, böylece takımların sırasını değiştiriyoruz
            String lastTeam = teams.remove(teams.size() - 1);
            teams.add(1, lastTeam);
        }
    }
}
