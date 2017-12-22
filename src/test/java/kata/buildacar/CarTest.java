package kata.buildacar;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    // test body.component
    @Test
    public void testBodyComponent() throws Exception {
        Car car = new Car(7, 1);
        assertNotNull("'Car.body.component' is not defined", car.body.component);
    }

    // test chassis.component
    @Test
    public void testChassisComponent() throws Exception {
        Car car = new Car(7, 1);
        assertNotNull("'Car.chassis.component' is not defined", car.chassis.component);
    }
//
//    // test length-exception
//    @Test (expected = java.lang.Exception.class)
//    public void testLengthException() throws Exception {
//        Car car = new Car(6, 1);
//    };
//
//    // test no-door-exceptions
//    @Test (expected = java.lang.Exception.class)
//    public void testNoDoorException() throws Exception {
//        Car car = new Car(7, 0);
//    };
//
//    // test too-many-doors-exception
//    @Test (expected = java.lang.Exception.class)
//    public void testManyDoorsException() throws Exception {
//        Car car = new Car(7, 4);
//    };
//
//    // test small car
//    @Test
//    public void testSmallCar() { testCar(7, 1, " ____\n|  []\\\n-o--o-'"); }
//
//    // test medium car
//    @Test
//    public void testMediumCar() { testCar(12, 2, " _________\n|[]     []\\\n-o-o-----o-'"); }
//
//    // test large car
//    @Test
//    public void testLargeCar() { testCar(17, 5, " ______________\n|[][]    [][][]\\\n-o-o-o------o-o-'"); }

//    // helper method
//    private void testCar(int length, int doors, String test) {
//        Car car;
//        String value, output;
//        try { car = new Car(length, doors); }
//        catch (Exception e) { System.out.println("Unexpected Exception!" + e); return; }
//        value = car.body.component + car.chassis.component;
//        output = "\nExpected car:\n" + test + "\nYour car:\n" + value + "\n\n";
//        assertEquals(output, value, test); // test
//        System.out.println(output);
//    }

    @Test
    public void showTopCar(){
        assertEquals(" _____", Car.showTop(8));
    }

    @Test
    public void showMiddleCar(){
        assertEquals("|   []\\", Car.showMiddle(8));
    }

    @Test
    public void showBottom(){
        assertEquals("-o---o-'", Car.showBottom(8));
    }

    @Test
    public void drawCar(){

        int length = 16;

        System.out.println(Car.showTop(length));
        System.out.println(Car.showMiddle(length));
        System.out.println(Car.showBottom(length));
    }

    @Test
    public void numAlestest(){
//        assertEquals(2, Car.numAxles(7));
//        assertEquals(3, Car.numAxles(12));
        assertEquals(4, Car.numAxles(14));
        assertEquals(4, Car.numAxles(15));
        assertEquals(5, Car.numAxles(16));
    }
}