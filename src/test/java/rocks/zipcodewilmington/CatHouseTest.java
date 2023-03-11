package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.Mammal;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)` done
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)` done
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()` done

    @Test
    public void addCatTest(){
        Cat cat1 = AnimalFactory.createCat(null, null);
        CatHouse.add(cat1);
        int expected = 1;
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }

    //    @Test
//    public static void removeCatById(){
//        Cat cat3 = new Cat(null,null,1003);
//        CatHouse.add(cat3);
//        CatHouse.remove(1003);
//        String expected =
//        Assert.assertEquals(expected, actual);

    @Test
    public void removeCatTest(){
        Cat cat2 = AnimalFactory.createCat(null,null);
        CatHouse.add(cat2);
        CatHouse.remove(cat2);
        int expected = 0;
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);

    }

//    @Test
//    public void getCatById(){
//        Cat cat1 = new Cat("meme", null, 54);
//        CatHouse.add(cat1);
//        int expected = 54;
//        int actual = CatHouse.getCatById();
//        Assert.assertEquals(expected, actual);
//    }



    @Test
    public void getNumberOfCatsTest(){
        Cat cat1 = AnimalFactory.createCat(null,null);
        CatHouse.add(cat1);
        int expected = 1;
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }





}
