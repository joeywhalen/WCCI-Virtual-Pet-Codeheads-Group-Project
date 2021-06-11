package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RoboticPetTest {

    RoboticPet underTest;

    @BeforeEach
    public void setUp() {
        underTest = new RoboticPet("Ally Gator", "This is words", 50, 45, 40);
    }

    @Test
    public void shouldInstantiateClass() {

    }

    @Test
    public void shouldGetNewPetNameFromConstructor() {
        String name = underTest.getName();
        assertEquals("Ally Gator", underTest.getName());
    }

    @Test
    public void shouldGetDescriptionFromConstructor() {
        String description = underTest.getDescription();
        assertEquals("This is words", underTest.getDescription());
    }

    @Test
    public void shouldAcceptBatteryLevelFromConstructor() {
        assertEquals(50, underTest.getBatteryLevel());
    }

    @Test
    public void shouldAcceptOilLevelFromConstructor() {
        assertEquals(45, underTest.getOilLevel());
    }

    @Test
    public void shouldAcceptBoredomFromConstructor() {
        assertEquals(40, underTest.getBoredom());
    }


}
