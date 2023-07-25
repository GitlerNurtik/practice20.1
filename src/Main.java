import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Wolf wolf = new Wolf("Волк", "в Тайге", "слабые существа");
    Bear bear = new Bear("Медведь", "в Тайге", "слабые существа и растительность" );
    Lion lion = new Lion("Лев", "Африка", "слабые существа");
    Predator[] predators = new Predator[]{wolf,bear,lion};
    Huntable[] hunt = new Huntable[]{wolf,bear,lion};
    int count = 0;
        for (Huntable hunt2:hunt) {
            System.out.println(predators[count]);
            hunt2.hunt();count++;
        }
    }
}