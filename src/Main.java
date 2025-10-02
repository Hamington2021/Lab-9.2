import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random(5); // Fixed seed for reproducibility
        Animals[] animals = Animals.values();
        Animals selected = animals[rand.nextInt(animals.length)]; // Random selection
        System.out.println("Selected animal: " + selected);
    }
}
