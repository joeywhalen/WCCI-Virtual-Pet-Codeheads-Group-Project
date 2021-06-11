package virtual_pet;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        VirtualPetShelter petShelter = new VirtualPetShelter();
        petShelter.initialOrganicPets();
        petShelter.initialRoboticPets();

        System.out.println("Thank you for volunteering at The Codeheads Virtual Pet Shelter!");
        System.out.println(" ");
        System.out.println("( )___( )");
        System.out.println("/__oo    \\");
        System.out.println("( \\/     )");
        System.out.println("| `=/    |");
        System.out.println("/         \\");
        System.out.println("/  /    \\   \\");
        System.out.println("/  (      \\   \\");
        System.out.println("( ,_/_      \\   \\");
        System.out.println("\\_ '=       \\   )");
        System.out.println("\"\"'       /  /");
        System.out.println(";        /  /'?");
        System.out.println(":       (((( /");
        System.out.println("`._   \\  _ (");
        System.out.println("__|   |  /_");
        System.out.println("(\"__,..\"'_._.)");
        System.out.println("------------------------------------------------");
        System.out.println(" ");
        System.out.println("            .-._   _ _ _ _ _ _ _ _");
        System.out.println(" .-''-.__.-'00  '-' ' ' ' ' ' ' ' '-.");
        System.out.println("'.___ '    .   .--_'-' '-' '-' _'-' '._");
        System.out.println(" V: V 'vv-'   '_   '.       .'  _..' '.'.");
        System.out.println("   '=.____.=_.--'   :_.__.__:_   '.   : :");
        System.out.println("           (((____.-'        '-.  /   : :");
        System.out.println("                             (((-'\\ .' /");
        System.out.println("                           _____..'  .'");
        System.out.println("                          '-._____.-'");
        System.out.println("------------------------------------------------");
        System.out.println(" ");

        petShelter.displayOrganicHealthStatus();
        System.out.println(" ");
        petShelter.displayRoboticHealthStatus();
        Scanner userInput = new Scanner(System.in);
        int selection;
        do {
            System.out.println(" ");
            System.out.println("What would you like to do next?");
            System.out.println(" ");
            System.out.println("Enter 1 to feed the organic pets. ");
            System.out.println("Enter 2 to give water to the organic pets. ");
            System.out.println("Enter 3 to play with an organic pet. ");
            System.out.println("Enter 4 to adopt an organic pet! ");
            System.out.println("Enter 5 to admit an organic pet. ");
            System.out.println("Enter 6 to walk with an organic pet.");
            System.out.println("Enter 7 to clean dirty cages. ");
            System.out.println("Enter 8 to charge robotic pet batteries. ");
            System.out.println("Enter 9 to fill robotic pet oil tanks. ");
            System.out.println("Enter 10 to play with a robotic pet. ");
            System.out.println("Enter 11 to adopt a robotic pet. ");
            System.out.println("Enter 12 to admit a robotic pet. ");
            System.out.println("Enter 13 to walk with a robotic pet. ");
            System.out.println("Enter 14 to quit the game ");
            System.out.println(" ");
            selection = userInput.nextInt();
            userInput.nextLine();

            switch (selection) {
                case 1:
                    petShelter.feedAll();
                    petShelter.displayOrganicHealthStatus();
                    petShelter.checkOrganicHealthStatus();
                    break;
                case 2:
                    petShelter.waterAll();
                    petShelter.displayOrganicHealthStatus();
                    petShelter.checkOrganicHealthStatus();
                    break;
                case 3:
                    System.out.println("Okay, please choose a pet to play with.");
                    System.out.println(" ");
                    petShelter.displayAllOrganicPetsDescriptions();
                    System.out.println(" ");
                    System.out.println("Which pet have you chosen? ");
                    String name = userInput.nextLine();
                    petShelter.playWithOrganic(name);
                    System.out.println(" ");
                    petShelter.displayOrganicHealthStatus();
                    petShelter.checkOrganicHealthStatus();
                    break;
                case 4:
                    System.out.println("Okay, please choose a pet to adopt. ");
                    System.out.println(" ");
                    petShelter.displayAllOrganicPetsDescriptions();
                    System.out.println(" ");
                    System.out.println("Which pet have you chosen? ");
                    String adoptName = userInput.nextLine();
                    petShelter.removeOrganicPetFromShelter(adoptName);
                    petShelter.displayOrganicHealthStatus();
                    break;
                case 5:
                    petShelter.addOrganicPetToShelter();
                    petShelter.displayOrganicHealthStatus();
                    break;
                case 6:
                    System.out.println("Which pet would you like to take for a walk? ");
                    System.out.println(" ");
                    petShelter.displayAllOrganicPetsDescriptions();
                    System.out.println(" ");
                    System.out.println("Which pet have you chosen? ");
                    String walkName = userInput.nextLine();
                    petShelter.walkOrganic(walkName);
                    System.out.println(" ");
                    petShelter.displayOrganicHealthStatus();
                    petShelter.checkOrganicHealthStatus();
                    break;
                case 7:
                    petShelter.cleanAllCages();
                    petShelter.displayOrganicHealthStatus();
                    petShelter.checkOrganicHealthStatus();
                    System.out.println("Thanks for cleaning the cages! ");
                    System.out.println(" ");
                    break;
                case 8:
                    petShelter.chargeAll();
                    petShelter.displayRoboticHealthStatus();
                    petShelter.checkRoboticHealthStatus();
                    break;
                case 9:
                    petShelter.oilAll();
                    petShelter.displayRoboticHealthStatus();
                    petShelter.checkRoboticHealthStatus();
                    break;
                case 10:
                    System.out.println("Okay, please choose a robot to play with.");
                    System.out.println(" ");
                    petShelter.displayAllRoboticPetsDescriptions();
                    System.out.println(" ");
                    System.out.println("Which robot have you chosen? ");
                    String robotName = userInput.nextLine();
                    petShelter.playWithRobotic(robotName);
                    System.out.println(" ");
                    petShelter.displayRoboticHealthStatus();
                    petShelter.checkRoboticHealthStatus();
                    break;
                case 11:
                    System.out.println("Okay, please choose a robot to adopt. ");
                    System.out.println(" ");
                    petShelter.displayAllRoboticPetsDescriptions();
                    System.out.println(" ");
                    System.out.println("Which robot have you chosen? ");
                    String adoptRobotName = userInput.nextLine();
                    petShelter.removeRoboticPetFromShelter(adoptRobotName);
                    petShelter.displayRoboticHealthStatus();
                    break;
                case 12:
                    petShelter.addRoboticPetToShelter();
                    petShelter.displayRoboticHealthStatus();
                    break;
                case 13:
                    System.out.println("Which robot would you like to take for a walk? ");
                    System.out.println(" ");
                    petShelter.displayAllRoboticPetsDescriptions();
                    System.out.println(" ");
                    System.out.println("Which robot have you chosen? ");
                    String walkRobotName = userInput.nextLine();
                    petShelter.walkRobotic(walkRobotName);
                    System.out.println(" ");
                    petShelter.displayRoboticHealthStatus();
                    petShelter.checkRoboticHealthStatus();
                    break;
            }
        }
        while (selection < 14);

        userInput.close();
        System.exit(0);
    }
}
