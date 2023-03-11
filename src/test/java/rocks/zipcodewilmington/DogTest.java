package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`done
    // TODO - Create tests for `speak` done
    // TODO - Create tests for `setBirthDate(Date birthDate)` done
    // TODO - Create tests for `void eat(Food food)` done
    // TODO - Create tests for `Integer getId()` done
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void getDogNameTest() {
        Dog dog1 = new Dog(null, null, null);
        String expected = "milo";
        String actual = dog1.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dogSpeakTest() {
        Dog dog1 = new Dog(null, null, null);
        String expected = "bark!";
        String actual = dog1.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogBirthDate() {
        Dog dog1 = new Dog(null, new Date(12/22/2020), null);
        Date expected = new Date(12 / 22 / 2020);
        Date actual = dog1.getBirthDate();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getDogIdTest() {
        Dog dog = new Dog(null, null, 88);
        int expected = 88;
        int actual = dog.getId();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void dogEatTest(){
        Dog dog = new Dog(null,null,null);
        dog.eat(new Food());
        int expected = 1;
        int actual = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }
}
