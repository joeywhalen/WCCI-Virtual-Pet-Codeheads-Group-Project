package virtual_pet;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        VirtualPetShelter petShelter = new VirtualPetShelter();
        petShelter.initialOrganicPets();
        petShelter.initialRoboticPets();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Thank you for volunteering at The Codeheads Virtual Pet Shelter!");


    petShelter.displayAllOrganicPetsDescriptions();
    petShelter.displayAllRoboticPetsDescriptions();
    petShelter.checkOrganicHealthStatus();
    petShelter.displayOrganicHealthStatus();
    System.out.println(" ");
    petShelter.checkRoboticHealthStatus();
    petShelter.displayRoboticHealthStatus();
    System.out.println(" ");
//    petShelter.addOrganicPetToShelter();
//    System.out.println(" ");
//    petShelter.displayAllOrganicPetsDescriptions();
//    System.out.println(" ");
//    petShelter.displayOrganicHealthStatus();
//    System.out.println(" ");
//    petShelter.addRoboticPetToShelter();
//    System.out.println(" ");
//    petShelter.displayAllRoboticPetsDescriptions();
//    System.out.println(" ");
//    petShelter.displayRoboticHealthStatus();
//    System.out.println("Okay, please choose an organic pet to adopt. ");
//    System.out.println(" ");
//    petShelter.displayAllOrganicPetsDescriptions();
//    System.out.println(" ");
//    System.out.println("Which organic pet have you chosen? ");
//    String adoptName = userInput.nextLine();
//    petShelter.removeOrganicPetFromShelter(adoptName);
//    System.out.println(" ");
//    petShelter.displayAllOrganicPetsDescriptions();
//    petShelter.displayOrganicHealthStatus();
//    System.out.println("Okay, please choose a robotic pet to adopt. ");
//    System.out.println(" ");
//    petShelter.displayAllRoboticPetsDescriptions();
//    System.out.println(" ");
//    System.out.println("Which robotic pet have you chosen? ");
//    String adoptName = userInput.nextLine();
//    petShelter.removeRoboticPetFromShelter(adoptName);
//    System.out.println(" ");
//    petShelter.displayAllRoboticPetsDescriptions();
//    petShelter.displayRoboticHealthStatus();
//        petShelter.displayOrganicHealthStatus();
//        petShelter.feedAll();
//        System.out.println(" ");
//        petShelter.displayOrganicHealthStatus();
    }
}
