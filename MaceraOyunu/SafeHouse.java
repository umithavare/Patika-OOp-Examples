package MaceraOyunu;

public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(player, "Guvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Guvenli evdesiniz!");
        this.getPlayer().setHealth(getPlayer().getOriginalHealth());
        System.out.println("Caniniz Fullendi");
        return true;
    }
}
