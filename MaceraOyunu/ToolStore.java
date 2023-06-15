package MaceraOyunu;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Magaza");
    }
    @Override
    public boolean onLocation() {
        System.out.println("Magazaya hos geldiniz!!");
        return true;
    }

}
