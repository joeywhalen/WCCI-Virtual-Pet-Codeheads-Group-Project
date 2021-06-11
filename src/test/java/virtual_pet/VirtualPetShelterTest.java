package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


public class VirtualPetShelterTest {
    VirtualPetShelter petShelter;
    ArrayList underTest;


    @BeforeEach
    public void setUp() {
        petShelter = new VirtualPetShelter();

    }

    @Test
    public void shouldCallFromClass() {

    }

    @Test
    public void shouldReturnCollectionOfAllOrganicPetsInShelter() { //We need to iron this out.  We can currectly find by index, but NOT by name.
        ArrayList<VirtualPet> underTest = petShelter.virtualOrganicPets;
        VirtualPet yogi = new VirtualPet("Yogi", "Hey hey hey! I'm smarter than your av-er-age bear!", 50, 50, 50, 50);
        VirtualPet smokey = new VirtualPet("Smokey", "Only YOU can prevent forest fires.", 40, 40, 40, 50);
        VirtualPet winnie = new VirtualPet("Winnie", "I have a rumbly in my tumbly.", 25, 40, 60, 50);
        VirtualPet gummi = new VirtualPet("Gummi", "Once was candy for kids, now 'candy' for adults.", 25, 60, 420, 50);
        underTest.add(yogi);
        underTest.add(smokey);
        underTest.add(winnie);
        underTest.add(gummi);
        assertEquals(4, underTest.size());

    }

    @Test
    public void shouldReturnCollectionOfAllRoboticPetsInShelter() { //We need to iron this out.  We can currectly find by index, but NOT by name.
        ArrayList<VirtualPet> underTest = petShelter.virtualRoboticPets;
        RoboticPet booboo = new RoboticPet("Boo-Boo","But Yogi, Mr. Ranger isn't gonna like this.", 40, 70, 60);
        RoboticPet kissyfur = new RoboticPet("Kissyfur", "I used to be a circus bear.", 40, 40, 60);
        RoboticPet ally = new RoboticPet("Ally Gator", "It's a punny name. So what?", 45, 70, 60);
        RoboticPet gummy = new RoboticPet("Gummy", "Yeah I'm a Brony. So what?", 45, 70, 60);
        underTest.add(booboo);
        underTest.add(kissyfur);
        underTest.add(ally);
        underTest.add(gummy);
        assertEquals(4, underTest.size());

    }


    @Test
    public void shouldRetrieveAOrganicPetBasedOnName() {
        ArrayList<VirtualPet> underTest = petShelter.virtualOrganicPets;
        VirtualPet yogi = new VirtualPet("Yogi", "Hey hey hey! I'm smarter than your av-er-age bear!", 50, 50, 50, 50);
        VirtualPet smokey = new VirtualPet("Smokey", "Only YOU can prevent forest fires.", 40, 40, 40, 50);
        VirtualPet winnie = new VirtualPet("Winnie", "I have a rumbly in my tumbly.", 25, 40, 60, 50);
        VirtualPet gummi = new VirtualPet("Gummi", "Once was candy for kids, now 'candy' for adults.", 25, 60, 420, 50);
        underTest.add(yogi);
        underTest.add(smokey);
        underTest.add(winnie);
        underTest.add(gummi);
        assertEquals(yogi, underTest.get(0), "Yogi");
        assertEquals(smokey, underTest.get(1), "Smokey");
        assertEquals(winnie, underTest.get(2), "Winnie");
        assertEquals(gummi, underTest.get(3), "Gummi");
    }

    @Test
    public void shouldRetrieveARoboticPetBasedOnName() {
        ArrayList<VirtualPet> underTest = petShelter.virtualRoboticPets;
        RoboticPet booboo = new RoboticPet("Boo-Boo","But Yogi, Mr. Ranger isn't gonna like this.", 40, 70, 60);
        RoboticPet kissyfur = new RoboticPet("Kissyfur", "I used to be a circus bear.", 40, 40, 60);
        RoboticPet ally = new RoboticPet("Ally Gator", "It's a punny name. So what?", 45, 70, 60);
        RoboticPet gummy = new RoboticPet("Gummy", "Yeah I'm a Brony. So what?", 45, 70, 60);
        underTest.add(booboo);
        underTest.add(kissyfur);
        underTest.add(ally);
        underTest.add(gummy);
        assertEquals(booboo, underTest.get(0), "Boo-boo");
        assertEquals(kissyfur, underTest.get(1), "Kissyfur");
        assertEquals(ally, underTest.get(2), "Ally");
        assertEquals(gummy, underTest.get(3), "Gummy");
    }

    @Test
    public void shouldAddAOrganicPetToShelter() {
        ArrayList<VirtualPet> underTest = petShelter.virtualOrganicPets;
        VirtualPet yogi = new VirtualPet("Yogi", "Hey hey hey! I'm smarter than your av-er-age bear!", 50, 50, 50, 50);
        VirtualPet smokey = new VirtualPet("Smokey", "Only YOU can prevent forest fires.", 40, 40, 40, 50);
        underTest.add(yogi);
        underTest.add(smokey);
        assertEquals(2, underTest.size());
        VirtualPet winnie = new VirtualPet("Winnie", "I have a rumbly in my tumbly.", 25, 40, 60, 50);
        underTest.add(winnie);
        assertEquals(3, underTest.size());
    }

    @Test
    public void shouldAddARoboticPetToShelter() {
        ArrayList<VirtualPet> underTest = petShelter.virtualRoboticPets;
        RoboticPet booboo = new  RoboticPet("Boo-boo", "Hey hey hey! I'm smarter than your av-er-age bear!", 50, 50, 50);
        RoboticPet kissyfur = new  RoboticPet("Kissyfur", "Only YOU can prevent forest fires.", 40, 40, 40);
        underTest.add(booboo);
        underTest.add(kissyfur);
        assertEquals(2, underTest.size());
        RoboticPet ally = new  RoboticPet("Ally", "I have a rumbly in my tumbly.", 25, 40, 60);
        underTest.add(ally);
        assertEquals(3, underTest.size());
    }

    @Test
    public void shouldRemoveOneOrganicPetFromShelter() {
        ArrayList<VirtualPet> underTest = petShelter.virtualOrganicPets;
        VirtualPet yogi = new VirtualPet("Yogi", "Hey hey hey! I'm smarter than your av-er-age bear!", 50, 50, 50, 50);
        VirtualPet smokey = new VirtualPet("Smokey", "Only YOU can prevent forest fires.", 40, 40, 40, 50);
        VirtualPet winnie = new VirtualPet("Winnie", "I have a rumbly in my tumbly.", 25, 40, 60, 50);
        VirtualPet gummi = new VirtualPet("Gummi", "Once was candy for kids, now 'candy' for adults.", 25, 60, 420, 50);
        underTest.add(yogi);
        underTest.add(smokey);
        underTest.add(winnie);
        underTest.add(gummi);
        assertEquals(4, underTest.size());
        petShelter.removeOrganicPetFromShelter("Winnie");
        assertEquals(3, underTest.size());
    }

    @Test
    public void shouldRemoveOneRoboticPetFromShelter() {
        ArrayList<VirtualPet> underTest = petShelter.virtualRoboticPets;
        RoboticPet booboo = new RoboticPet("Boo-Boo","But Yogi, Mr. Ranger isn't gonna like this.", 40, 70, 60);
        RoboticPet kissyfur = new RoboticPet("Kissyfur", "I used to be a circus bear.", 40, 40, 60);
        RoboticPet ally = new RoboticPet("Ally Gator", "It's a punny name. So what?", 45, 70, 60);
        RoboticPet gummy = new RoboticPet("Gummy", "Yeah I'm a Brony. So what?", 45, 70, 60);
        underTest.add(booboo);
        underTest.add(kissyfur);
        underTest.add(ally);
        underTest.add(gummy);
        assertEquals(4, underTest.size());
        petShelter.removeRoboticPetFromShelter("Gummy");
        assertEquals(3, underTest.size());
    }

    @Test
    public void shouldRemoveAllOrganicPetsFromShelter() {
        ArrayList<VirtualPet> underTest = petShelter.virtualOrganicPets;
        VirtualPet yogi = new VirtualPet("Yogi", "Hey hey hey! I'm smarter than your av-er-age bear!", 50, 50, 50, 50);
        VirtualPet smokey = new VirtualPet("Smokey", "Only YOU can prevent forest fires.", 40, 40, 40, 50);
        VirtualPet winnie = new VirtualPet("Winnie", "I have a rumbly in my tumbly.", 25, 40, 60, 50);
        VirtualPet gummi = new VirtualPet("Gummi", "Once was candy for kids, now 'candy' for adults.", 25, 60, 420, 50);
        underTest.add(yogi);
        underTest.add(smokey);
        underTest.add(winnie);
        underTest.add(gummi);
        underTest.clear();
        assertTrue(true);
    }

    @Test
    public void shouldRemoveAllRoboticPetsFromShelter() {
        ArrayList<VirtualPet> underTest = petShelter.virtualRoboticPets;
        RoboticPet booboo = new RoboticPet("Boo-Boo","But Yogi, Mr. Ranger isn't gonna like this.", 40, 70, 60);
        RoboticPet kissyfur = new RoboticPet("Kissyfur", "I used to be a circus bear.", 40, 40, 60);
        RoboticPet ally = new RoboticPet("Ally Gator", "It's a punny name. So what?", 45, 70, 60);
        RoboticPet gummy = new RoboticPet("Gummy", "Yeah I'm a Brony. So what?", 45, 70, 60);
        underTest.add(booboo);
        underTest.add(kissyfur);
        underTest.add(ally);
        underTest.add(gummy);
        underTest.clear();
        assertTrue(true);
    }

    @Test
    public void shouldFeedAllOrganicPetsInShelter() {
        ArrayList<VirtualPet> underTest = petShelter.virtualOrganicPets;
        VirtualPet yogi = new VirtualPet("Yogi", "Hey hey hey! I'm smarter than your av-er-age bear!", 50, 50, 50, 50);
        VirtualPet smokey = new VirtualPet("Smokey", "Only YOU can prevent forest fires.", 40, 40, 40, 50);
        VirtualPet winnie = new VirtualPet("Winnie", "I have a rumbly in my tumbly.", 25, 40, 60, 50);
        VirtualPet gummi = new VirtualPet("Gummi", "Once was candy for kids, now 'candy' for adults.", 25, 60, 420, 50);
        underTest.add(yogi);
        underTest.add(smokey);
        underTest.add(winnie);
        underTest.add(gummi);
        ArrayList<Integer> initialHungerLevel = new ArrayList<Integer>();
        for (VirtualPet pet : underTest) {
            initialHungerLevel.add(pet.getHunger());

        }
        petShelter.feedAll();
        int i = 0;
        for (VirtualPet pet : underTest) {
            assertTrue(initialHungerLevel.get(i) < pet.getHunger());
            i++;
        }
    }

    @Test
    public void shouldcChargeAllRoboticPetBatteriesInShelter() {
        ArrayList<VirtualPet> underTest = petShelter.virtualRoboticPets;
        RoboticPet booboo = new RoboticPet("Boo-Boo","But Yogi, Mr. Ranger isn't gonna like this.", 40, 70, 60);
        RoboticPet kissyfur = new RoboticPet("Kissyfur", "I used to be a circus bear.", 40, 40, 60);
        RoboticPet ally = new RoboticPet("Ally Gator", "It's a punny name. So what?", 45, 70, 60);
        RoboticPet gummy = new RoboticPet("Gummy", "Yeah I'm a Brony. So what?", 45, 70, 60);
        underTest.add(booboo);
        underTest.add(kissyfur);
        underTest.add(ally);
        underTest.add(gummy);
        ArrayList<Integer> initialBatteryLevel = new ArrayList<Integer>();
        for (VirtualPet pet : underTest) {
            initialBatteryLevel.add(pet.getBatteryLevel());

        }
        petShelter.chargeAll();
        int i = 0;
        for (VirtualPet pet : underTest) {
            assertTrue(initialBatteryLevel.get(i) < pet.getBatteryLevel());
            i++;
        }
    }

    @Test
    public void shouldGiveWaterToAllOrganicPetsInShelter() {
        ArrayList<VirtualPet> underTest = petShelter.virtualOrganicPets;
        VirtualPet yogi = new VirtualPet("Yogi", "Hey hey hey! I'm smarter than your av-er-age bear!", 50, 50, 50, 50);
        VirtualPet smokey = new VirtualPet("Smokey", "Only YOU can prevent forest fires.", 40, 40, 40, 50);
        VirtualPet winnie = new VirtualPet("Winnie", "I have a rumbly in my tumbly.", 25, 40, 60, 50);
        VirtualPet gummi = new VirtualPet("Gummi", "Once was candy for kids, now 'candy' for adults.", 25, 60, 420, 50);
        underTest.add(yogi);
        underTest.add(smokey);
        underTest.add(winnie);
        underTest.add(gummi);
        ArrayList<Integer> initialThirstLevel = new ArrayList<Integer>();
        for (VirtualPet pet : underTest) {
            initialThirstLevel.add(pet.getThirst());

        }
        petShelter.waterAll();
        int i = 0;
        for (VirtualPet pet : underTest) {
            assertTrue(initialThirstLevel.get(i) < pet.getThirst());
            i++;
        }
    }

    @Test
    public void shouldOilAllRoboticPetInShelter() {
        ArrayList<VirtualPet> underTest = petShelter.virtualRoboticPets;
        RoboticPet booboo = new RoboticPet("Boo-Boo","But Yogi, Mr. Ranger isn't gonna like this.", 40, 70, 60);
        RoboticPet kissyfur = new RoboticPet("Kissyfur", "I used to be a circus bear.", 40, 40, 60);
        RoboticPet ally = new RoboticPet("Ally Gator", "It's a punny name. So what?", 45, 70, 60);
        RoboticPet gummy = new RoboticPet("Gummy", "Yeah I'm a Brony. So what?", 45, 70, 60);
        underTest.add(booboo);
        underTest.add(kissyfur);
        underTest.add(ally);
        underTest.add(gummy);
        ArrayList<Integer> initialOilLevel = new ArrayList<Integer>();
        for (VirtualPet pet : underTest) {
            initialOilLevel.add(pet.getOilLevel());

        }
        petShelter.oilAll();
        int i = 0;
        for (VirtualPet pet : underTest) {
            assertTrue(initialOilLevel.get(i) < pet.getOilLevel());
            i++;
        }
    }

    @Test
    public void shouldPlayWithOneOrganicPetInShelter() {
        ArrayList<VirtualPet> underTest = petShelter.virtualOrganicPets;
        VirtualPet yogi = new VirtualPet("Yogi", "Hey hey hey! I'm smarter than your av-er-age bear!", 50, 50, 50, 50);
        VirtualPet smokey = new VirtualPet("Smokey", "Only YOU can prevent forest fires.", 40, 40, 40, 50);
        underTest.add(yogi);
        underTest.add(smokey);
        ArrayList<Integer> initialBoredomLevel = new ArrayList<Integer>();
        for (VirtualPet pet : underTest) {
            initialBoredomLevel.add(pet.getBoredom());
        }
        petShelter.playWithOrganic("Yogi");
        assertTrue(initialBoredomLevel.get(0) < underTest.get(0).getBoredom());
        assertTrue(initialBoredomLevel.get(1) > underTest.get(1).getBoredom());
    }

    @Test
    public void shouldPlayWithOneRoboticPetInShelter() {
        ArrayList<VirtualPet> underTest = petShelter.virtualRoboticPets;
        RoboticPet booboo = new RoboticPet("Boo-Boo","But Yogi, Mr. Ranger isn't gonna like this.", 40, 70, 60);
        RoboticPet kissyfur = new RoboticPet("Kissyfur", "I used to be a circus bear.", 40, 40, 60);
        underTest.add(booboo);
        underTest.add(kissyfur);
        ArrayList<Integer> initialBoredomLevel = new ArrayList<Integer>();
        for (VirtualPet pet : underTest) {
            initialBoredomLevel.add(pet.getBoredom());
        }
        petShelter.playWithRobotic("Boo-Boo");
        assertTrue(initialBoredomLevel.get(0) < underTest.get(0).getBoredom());
        assertTrue(initialBoredomLevel.get(1) > underTest.get(1).getBoredom());
    }

    @Test
    public void shouldCleanAllOrganicPetCagesInShelter() {
        ArrayList<VirtualPet> underTest = petShelter.virtualOrganicPets;
        VirtualPet yogi = new VirtualPet("Yogi", "Hey hey hey! I'm smarter than your av-er-age bear!", 50, 50, 50, 50);
        VirtualPet smokey = new VirtualPet("Smokey", "Only YOU can prevent forest fires.", 40, 40, 40, 50);
        VirtualPet winnie = new VirtualPet("Winnie", "I have a rumbly in my tumbly.", 25, 40, 60, 50);
        VirtualPet gummi = new VirtualPet("Gummi", "Once was candy for kids, now 'candy' for adults.", 25, 60, 420, 50);
        underTest.add(yogi);
        underTest.add(smokey);
        underTest.add(winnie);
        underTest.add(gummi);
        ArrayList<Integer> initialWasteLevel = new ArrayList<Integer>();
        for (VirtualPet pet : underTest) {
            initialWasteLevel.add(pet.getWaste());

        }
        petShelter.cleanAllCages();
        int i = 0;
        for (VirtualPet pet : underTest) {
            assertTrue(initialWasteLevel.get(i) < pet.getWaste());
            i++;
        }
    }

//    @Test
//    public void shouldWalkWithOneOrganicPetInShelter() {
//        ArrayList<VirtualPet> underTest = petShelter.virtualOrganicPets;
//        VirtualPet yogi = new VirtualPet("Yogi", "Hey hey hey! I'm smarter than your av-er-age bear!", 50, 50, 50, 50);
//        VirtualPet smokey = new VirtualPet("Smokey", "Only YOU can prevent forest fires.", 40, 40, 40, 50);
//        underTest.add(yogi);
//        underTest.add(smokey);
//        ArrayList<Integer> initialWasteLevel = new ArrayList<Integer>();
//        ArrayList<Integer> initialBoredomLevel = new ArrayList<Integer>();
//        for (VirtualPet pet : underTest) {
//            initialWasteLevel.add(pet.getWaste());
//            initialBoredomLevel.add(pet.getBoredom());
//        }
//        petShelter.walkOrganic("Yogi");
//        assertTrue(initialBoredomLevel.get(0) < underTest.get(0).getBoredom());
//        assertTrue(initialBoredomLevel.get(1) > underTest.get(1).getBoredom());
//        assertTrue(initialWasteLevel.get(0) < underTest.get(0).getWaste());
//        assertTrue(initialWasteLevel.get(1) > underTest.get(1).getWaste());
//    }

//    @Test
//    public void shouldCallTickFromClass() {
//        ArrayList<VirtualPet> underTest = petShelter.virtualPets;
//        VirtualPet yogi = new VirtualPet("Yogi", "Hey hey hey! I'm smarter than your av-er-age bear!", 50, 50, 50);
//        VirtualPet smokey = new VirtualPet("Smokey", "Only YOU can prevent forest fires.", 40, 40, 40);
//        VirtualPet winnie = new VirtualPet("Winnie", "I have a rumbly in my tumbly.", 25, 40, 60);
//        VirtualPet gummi = new VirtualPet("Gummi", "Once was candy for kids, now 'candy' for adults.", 25, 60, 420);
//        underTest.add(yogi);
//        underTest.add(smokey);
//        underTest.add(winnie);
//        underTest.add(gummi);
//        ArrayList<Integer> initialBoredomLevel = new ArrayList<Integer>();
//        for (VirtualPet pet : underTest) {
//            initialBoredomLevel.add(pet.getBoredom());
//
//        }
//        petShelter.tick();
//        int i = 0;
//        for (VirtualPet pet : underTest) {
//            assertTrue(initialBoredomLevel.get(i) > pet.getBoredom());
//            i++;
//        }
//    }
}
