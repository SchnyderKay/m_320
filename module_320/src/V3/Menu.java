package V3;

import java.util.Scanner;

public class Menu {
    public void runMenu() throws Exception {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("What would you like to do? add/delete/print/exit");
            String action = scanner.nextLine();


            switch (action) {
                case "add" -> {
                    System.out.println("What type of figure do you want to add? warrior/magician/villain");
                    String figureType = scanner.nextLine();
                    System.out.println("Whats your characters name?");
                    String characterName = scanner.nextLine();
                    System.out.println("What kind of weapon does your character use? dagger/stick/axt");
                    String weaponType = scanner.nextLine();


                    controller.addFigure(figureType, weaponType, characterName);
                }
                case "exit" -> isRunning = false;
                case "delete" -> {
                    System.out.println("Whats the character name?");
                    String characterName = scanner.nextLine();
                    controller.removeFigure(characterName);
                }
                case "print" -> {
                    controller.printList();
                }
            }
        }
    }
}
