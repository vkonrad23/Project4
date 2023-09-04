
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    }

    public void firstTask() {
        // 1
        System.out.println();
        System.out.println("First task: \n");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        // 2
        System.out.println();
        System.out.println("Second task: \n");
        int j = 10;
        do {
            System.out.print(j + " ");
            j--;
        } while (j >= 1);

        // 3
        System.out.println();
        System.out.println("Third task: \n");
        for (int k = 1; k <= 10; k++) {
            System.out.print(k + " ");
        }
        System.out.println();
        for (int l = 10; l >= 1; l--) {
            System.out.print(l + " ");
        }

        // 4
        System.out.println();
        System.out.println("Fourth task: \n");
        String text = "Hello, World!";
        for (int m = 0; m < text.length(); m++) {
            System.out.println(text.charAt(m));
        }

        // 5
        System.out.println();
        System.out.println("Fifth task: \n");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.println("Row: " + row + ", Column: " + col);
            }
        }
    }

    public void secondTask() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Continue <Y/N>");
            char againChar = scanner.nextLine().toUpperCase().charAt(0);
            if (againChar != 'Y') {
                break;
            }

            System.out.println("Your line");
            String inputLine = scanner.nextLine();
            System.out.println(inputLine.toUpperCase());
        }
    }

    public void thirdTask() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Continue <Y/N>");
            char againChar = scanner.nextLine().toUpperCase().charAt(0);
            if (againChar != 'Y') {
                break;
            }

            System.out.println("Your line");
            String inputLine = scanner.nextLine();
            int lineLength = inputLine.length();
            char[] resultChars = new char[lineLength];
            for (int i = inputLine.length(); i > 0; i--) {
                resultChars[lineLength - i] = inputLine.charAt(i - 1);
            }
            System.out.println(new String(resultChars));
        }
    }

    public void fourthTask() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Continue <Y/N>");
            char againChar = scanner.nextLine().toUpperCase().charAt(0);
            if (againChar != 'Y') {
                break;
            }

            System.out.println("Hello!");
            System.out.print("Tell me your name ");
            String name = scanner.nextLine();

            System.out.print("Hi, " + name + "! How old are you? ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("What is your favorite book genre? ");
            String genre = scanner.nextLine();

            System.out.println("Great! Let me recommend a book for you.");

            // Apply book recommendations based on age and genre
            if (age >= 13 && age <= 16) {
                if (genre.equals("detective")) {
                    System.out.println("Read Sherlock Holmes");
                }
            } else if (age >= 17 && age <= 25) {
                if (genre.equals("non-fiction")) {
                    System.out.println("Read Party Lines");
                }
            } else {
                System.out.println("Sorry, we don't have recommendations for your age group.");
            }

            System.out.println("Enjoy your reading!!!");
        }
    }
}











