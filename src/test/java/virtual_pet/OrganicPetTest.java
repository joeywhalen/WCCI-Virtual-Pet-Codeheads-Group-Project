package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrganicPetTest {
   OrganicPet underTest;

    @BeforeEach
    public void setUp() {
        underTest = new OrganicPet("Yogi", "Smarter than the average Bear!", 50, 45, 40, 50);
    }

    @Test
    public void shouldInstantiateClass() {

    }

    @Test
    public void shouldAcceptHungerFromConstructor() {
        assertEquals(50, underTest.getHunger());
    }

    @Test
    public void shouldAcceptThirstFromConstructor() {
        assertEquals(45, underTest.getThirst());
    }

    @Test
    public void shouldAcceptBoredomFromConstructor() {
        assertEquals(40, underTest.getBoredom());
    }


    @Test
    public void shouldAcceptWasteFromConstructor() {
        assertEquals(50, underTest.getWaste());
    }


    @Test
    public void shouldCheckIfPetIsAlive() {
        Boolean isAlive = underTest.isAlive();
        assertEquals(true, underTest.isAlive());
    }


}

