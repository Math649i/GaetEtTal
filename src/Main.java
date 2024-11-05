import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Skaber en Random-objekt for at generere et tilfældigt tal
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Definer grænserne for det tilfældige tal
        int min = 1;
        int max = 100;

        // Generer et tilfældigt tal mellem min og max
        int targetNumber = random.nextInt(max - min + 1) + min;
        int guess = 0;
        int attempts = 0;

        System.out.println("Velkommen til 'Gæt et tal' spillet!");
        System.out.println("Jeg har tænkt på et tal mellem " + min + " og " + max + ". Prøv at gætte det!");

        // Spillet kører, indtil det korrekte tal bliver gættet
        while (guess != targetNumber) {
            System.out.print("Indtast dit gæt: ");

            // Kontrollerer, om input er et gyldigt heltal
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                attempts++;

                if (guess < targetNumber) {
                    System.out.println("For lavt! Prøv igen.");
                } else if (guess > targetNumber) {
                    System.out.println("For højt! Prøv igen.");
                } else {
                    System.out.println("Tillykke! Du gættede det rigtige tal: " + targetNumber);
                    System.out.println("Det tog dig " + attempts + " forsøg.");
                }
            } else {
                System.out.println("Ugyldigt input! Indtast venligst et heltal.");
                scanner.next(); // Rydder det forkerte input
            }
        }

        scanner.close();
    }
}
