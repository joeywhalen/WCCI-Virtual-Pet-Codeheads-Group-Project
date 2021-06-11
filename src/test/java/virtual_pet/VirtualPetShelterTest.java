package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


//public class VirtualPetShelterTest {
//    VirtualPetShelter petShelter;
//    ArrayList underTest;
//
//
//    @BeforeEach
//    public void setUp() {
//        petShelter = new VirtualPetShelter();
//
//    }
//
//    @Test
//    public void shouldCallFromClass() {
//
//    }
//
//    @Test
//    public void shouldReturnCollectionOfAllPetsInShelter() { //We need to iron this out.  We can currectly find by index, but NOT by name.
//        ArrayList<VirtualPet> underTest = petShelter.virtualPets;
//        VirtualPet yogi = new VirtualPet("Yogi", "Hey hey hey! I'm smarter than your av-er-age bear!", 50, 50, 50);
//        VirtualPet smokey = new VirtualPet("Smokey", "Only YOU can prevent forest fires.", 40, 40, 40);
//        VirtualPet winnie = new VirtualPet("Winnie", "I have a rumbly in my tumbly.", 25, 40, 60);
//        VirtualPet gummi = new VirtualPet("Gummi", "Once was candy for kids, now 'candy' for adults.", 25, 60, 420);
//        underTest.add(yogi);
//        underTest.add(smokey);
//        underTest.add(winnie);
//        underTest.add(gummi);
//        assertEquals(4, underTest.size());
//
//    }
//
//    @Test
//    public void shouldRetrieveAPetBasedOnName() {
//        ArrayList<VirtualPet> underTest = petShelter.virtualPets;
//        VirtualPet yogi = new VirtualPet("Yogi", "Hey hey hey! I'm smarter than your av-er-age bear!", 50, 50, 50);
//        VirtualPet smokey = new VirtualPet("Smokey", "Only YOU can prevent forest fires.", 40, 40, 40);
//        VirtualPet winnie = new VirtualPet("Winnie", "I have a rumbly in my tumbly.", 25, 40, 60);
//        VirtualPet gummi = new VirtualPet("Gummi", "Once was candy for kids, now 'candy' for adults.", 25, 60, 420);
//        underTest.add(yogi);
//        underTest.add(smokey);
//        underTest.add(winnie);
//        underTest.add(gummi);
//        assertEquals(yogi, underTest.get(0), "Yogi");
//        assertEquals(smokey, underTest.get(1), "Smokey");
//        assertEquals(winnie, underTest.get(2), "Winnie");
//        assertEquals(gummi, underTest.get(3), "Gummi");
//    }
//
//    @Test
//    public void shouldAddAPetToShelter() {
//        ArrayList<VirtualPet> underTest = petShelter.virtualPets;
//        VirtualPet yogi = new VirtualPet("Yogi", "Hey hey hey! I'm smarter than your av-er-age bear!", 50, 50, 50);
//        VirtualPet smokey = new VirtualPet("Smokey", "Only YOU can prevent forest fires.", 40, 40, 40);
//        underTest.add(yogi);
//        underTest.add(smokey);
//        assertEquals(2, underTest.size());
//        VirtualPet winnie = new VirtualPet("Winnie", "I have a rumbly in my tumbly.", 25, 40, 60);
//        underTest.add(winnie);
//        assertEquals(3, underTest.size());
//    }
//
//    @Test
//    public void shouldRemoveOnePetFromShelter() {
//        ArrayList<VirtualPet> underTest = petShelter.virtualPets;
//        VirtualPet yogi = new VirtualPet("Yogi", "Hey hey hey! I'm smarter than your av-er-age bear!", 50, 50, 50);
//        VirtualPet smokey = new VirtualPet("Smokey", "Only YOU can prevent forest fires.", 40, 40, 40);
//        VirtualPet winnie = new VirtualPet("Winnie", "I have a rumbly in my tumbly.", 25, 40, 60);
//        VirtualPet gummi = new VirtualPet("Gummi", "Once was candy for kids, now 'candy' for adults.", 25, 60, 420);
//        underTest.add(yogi);
//        underTest.add(smokey);
//        underTest.add(winnie);
//        underTest.add(gummi);
//        assertEquals(4, underTest.size());
//        petShelter.removePetFromShelter("Winnie");
//        assertEquals(3, underTest.size());
//    }
//
//    @Test
//    public void shouldRemoveAllPetsFromShelter() {
//        ArrayList<VirtualPet> underTest = petShelter.virtualPets;
//        VirtualPet yogi = new VirtualPet("Yogi", "Hey hey hey! I'm smarter than your av-er-age bear!", 50, 50, 50);
//        VirtualPet smokey = new VirtualPet("Smokey", "Only YOU can prevent forest fires.", 40, 40, 40);
//        VirtualPet winnie = new VirtualPet("Winnie", "I have a rumbly in my tumbly.", 25, 40, 60);
//        VirtualPet gummi = new VirtualPet("Gummi", "Once was candy for kids, now 'candy' for adults.", 25, 60, 420);
//        underTest.add(yogi);
//        underTest.add(smokey);
//        underTest.add(winnie);
//        underTest.add(gummi);
//        underTest.clear();
//        assertTrue(true);
//    }
//
//    @Test
//    public void shouldFeedAllPetsInShelter() {
//        ArrayList<VirtualPet> underTest = petShelter.virtualPets;
//        VirtualPet yogi = new VirtualPet("Yogi", "Hey hey hey! I'm smarter than your av-er-age bear!", 50, 50, 50);
//        VirtualPet smokey = new VirtualPet("Smokey", "Only YOU can prevent forest fires.", 40, 40, 40);
//        VirtualPet winnie = new VirtualPet("Winnie", "I have a rumbly in my tumbly.", 25, 40, 60);
//        VirtualPet gummi = new VirtualPet("Gummi", "Once was candy for kids, now 'candy' for adults.", 25, 60, 420);
//        underTest.add(yogi);
//        underTest.add(smokey);
//        underTest.add(winnie);
//        underTest.add(gummi);
//        ArrayList<Integer> initialHungerLevel = new ArrayList<Integer>();
//        for (VirtualPet pet : underTest) {
//            initialHungerLevel.add(pet.getHunger());
//
//        }
//        petShelter.feedAll();
//        int i = 0;
//        for (VirtualPet pet : underTest) {
//            assertTrue(initialHungerLevel.get(i) < pet.getHunger());
//            i++;
//        }
//    }
//
//    @Test
//    public void shouldGiveWaterToAllPetsInShelter() {
//        ArrayList<VirtualPet> underTest = petShelter.virtualPets;
//        VirtualPet yogi = new VirtualPet("Yogi", "Hey hey hey! I'm smarter than your av-er-age bear!", 50, 50, 50);
//        VirtualPet smokey = new VirtualPet("Smokey", "Only YOU can prevent forest fires.", 40, 40, 40);
//        VirtualPet winnie = new VirtualPet("Winnie", "I have a rumbly in my tumbly.", 25, 40, 60);
//        VirtualPet gummi = new VirtualPet("Gummi", "Once was candy for kids, now 'candy' for adults.", 25, 60, 420);
//        underTest.add(yogi);
//        underTest.add(smokey);
//        underTest.add(winnie);
//        underTest.add(gummi);
//        ArrayList<Integer> initialThirstLevel = new ArrayList<Integer>();
//        for (VirtualPet pet : underTest) {
//            initialThirstLevel.add(pet.getThirst());
//
//        }
//        petShelter.waterAll();
//        int i = 0;
//        for (VirtualPet pet : underTest) {
//            assertTrue(initialThirstLevel.get(i) < pet.getThirst());
//            i++;
//        }
//    }
//
//    @Test
//    public void shouldPlayWithOnePetInShelter() {
//        ArrayList<VirtualPet> underTest = petShelter.virtualPets;
//        VirtualPet yogi = new VirtualPet("Yogi", "Hey hey hey! I'm smarter than your av-er-age bear!", 50, 50, 50);
//        VirtualPet smokey = new VirtualPet("Smokey", "Only YOU can prevent forest fires.", 40, 40, 40);
//        underTest.add(yogi);
//        underTest.add(smokey);
//        ArrayList<Integer> initialBoredomLevel = new ArrayList<Integer>();
//        for (VirtualPet pet : underTest) {
//            initialBoredomLevel.add(pet.getBoredom());
//        }
//        petShelter.playWith("Yogi");
//        assertTrue(initialBoredomLevel.get(0) < underTest.get(0).getBoredom());
//        assertTrue(initialBoredomLevel.get(1) > underTest.get(1).getBoredom());
//    }
//
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
//}
