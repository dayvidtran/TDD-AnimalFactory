package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)` done
    // TODO - Create tests for `speak` done
    // TODO - Create tests for `setBirthDate(Date birthDate)` done
    // TODO - Create tests for `void eat(Food food)` done
    // TODO - Create tests for `Integer getId()` done
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }


    @Test
    public void setCatNameTest() {
        Cat cat = new Cat("Zula", null, null);
        String expected = "Zula";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setCatBirthDate() {
        Cat cat = new Cat(null, new Date(12/23/2020), null);
        Date expected = new Date(12 / 23 / 2020);
        Date actual = cat.getBirthDate();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getCatIdTest() {
        Cat cat = new Cat(null, null, 54);
        int expected = 54;
        int actual = cat.getId();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void catSpeakTest(){
        Cat cat = new Cat(null,null,null);
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catEatTest(){
        Cat cat = new Cat(null,null,null);
        cat.eat(new Food());
        int expected = 1;
        int actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }
}

