import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextAdventure {
    private Map<String, Location> locations;
    private String currentLocation;

    public TextAdventure() {
        locations = new HashMap<>();
        locations.put("start", new Location("Du vaknar i skogen efter en tung utekväll. Du står vid ett vägskäl. Du kan gå NORR, ÖSTER eller VÄSTER.", Map.of("norr", "skog", "öster", "flod", "väster", "berg")));
        locations.put("skog", new Location("Du har gått in i en mörk skog. Du kan se en björn på håll, men den har inte sett dig.", Map.of("söder", "start", "slåss", "död")));
        locations.put("flod", new Location("En flod blockerar din väg. Det finns en bro längre bort.", Map.of("väster", "start", "över bron", "fort")));
        locations.put("berg", new Location("Du står vid foten av ett högt berg. Stigen verkar brant.", Map.of("öster", "start")));
        locations.put("fort", new Location("Du når ett fort, men de vill inte släppa in dig.", Map.of("väster", "flod")));
        locations.put("död", new Location("Du vart en lätt match för björnen.", Map.of("börja om", "start")));
        currentLocation = "start";
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Location location = locations.get(currentLocation);
            System.out.println(location.getDescription());
            System.out.println("Möjliga val: " + String.join(", ", location.getOptions().keySet()));
            System.out.print("Vad vill du göra? ");
            String choice = scanner.nextLine().trim().toLowerCase();
            if (location.getOptions().containsKey(choice)) {
                currentLocation = location.getOptions().get(choice);
            } else {
                System.out.println("Ogiltigt val, försök igen.");
            }
        }
    }

    public static void main(String[] args) {
        TextAdventure game = new TextAdventure();
        game.play();
    }
}

class Location {
    private String description;
    private Map<String, String> options;

    public Location(String description, Map<String, String> options) {
        this.description = description;
        this.options = options;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, String> getOptions() {
        return options;
    }
}
