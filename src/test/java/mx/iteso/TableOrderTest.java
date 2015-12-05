package mx.iteso;

import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TableOrderTest {
    TableOrder tableOrder;
    @Before
    public void setUp(){
        tableOrder = Table1.getInstance();
    }

    @Test
    public void testAddingDrinks(){
        Drink drink = new Drink();
        drink.setName("Pepsi");
        drink.setDescription("Big pepsi");
        drink.setWaiter("Waiter 1");
        drink.setPrice(8);
        drink.getDescription();
        tableOrder.addDrink(drink);
        drink.setName("Coke");
        drink.setDescription("Big coke");
        drink.setWaiter("Waiter 1");
        drink.setPrice(8);
        drink.getDescription();
        tableOrder.addDrink(drink);
        drink.setName("Lemon water");
        drink.setDescription("Lemon water");
        drink.setWaiter("Waiter 2");
        drink.setPrice(6);
        drink.getDescription();
        tableOrder.addDrink(drink);

        assertEquals(3, tableOrder.drinks.size());

        tableOrder.printCheck();
    }

    @Test
    public void testAddingDishes(){
        Dish dish = new Dish();
        dish.setName("Pozole");
        dish.setDescription("Pozole blanco");
        dish.setWaiter("Waiter 1");
        dish.setPrice(35);
        dish.getDescription();
        tableOrder.addDish(dish);
        dish.setName("Taco");
        dish.setDescription("Taco e asada");
        dish.setWaiter("Waiter 1");
        dish.setPrice(5);
        dish.getDescription();
        tableOrder.addDish(dish);

        assertEquals(2, tableOrder.dishes.size());

        tableOrder.printCheck();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testDrinksException(){
        tableOrder.clearDrinks();
        tableOrder.drinks.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testDshesException(){
        tableOrder.clearDishes();
        tableOrder.dishes.get(0);
    }

}
