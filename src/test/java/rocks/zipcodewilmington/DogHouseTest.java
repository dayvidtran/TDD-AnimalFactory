package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)` done
    // TODO - Create tests for `void remove(Integer id)`done
    // TODO - Create tests for `void remove(Dog dog)` done
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`done

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addDogTest(){
        Dog dog = new Dog(null, null,null);
        DogHouse.add(dog);
        int expected = 1;
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public  void removeDogTest(){
        Dog dog = AnimalFactory.createDog(null,null);
        DogHouse.add(dog);
        DogHouse.remove(dog);
        int expected = 0;
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeDogByIdTest(){
        Dog dog = new Dog(null,null,4);
        DogHouse.add(dog);
        Dog expected = dog;
        Dog actual =DogHouse.getDogById(54);
        Assert.assertEquals(expected, actual);
        CatHouse.clear();

    }

    @Test
    public void addDogByIdTest(){
        Dog dog = new Dog(null,null,10);
        DogHouse.add(dog);
        Dog actual = DogHouse.getDogById(10);
        Dog expected = dog;
        Assert.assertEquals(expected, actual);
    }
}
