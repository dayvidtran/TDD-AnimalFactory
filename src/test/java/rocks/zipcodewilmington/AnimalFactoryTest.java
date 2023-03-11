package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)` done
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)` done

    @Test
    public void catCreationTest(){
        String expectedName = "chico";
        Date expectedBirthDate = new Date(12/23/2020);
        Cat cat1 = AnimalFactory.createCat(expectedName, expectedBirthDate);
        String actualName = cat1.getName();
        Date actualBirthDate =cat1.getBirthDate();
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);

    }

    @Test
    public void dogCreationTest(){
        String expectedName = "milo";
        Date expectedBirthDate = new Date(12/22/2020);
        Dog dog1 = AnimalFactory.createDog(expectedName, expectedBirthDate);
        String actualName = dog1.getName();
        Date actualBirthDate = dog1.getBirthDate();
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

}
