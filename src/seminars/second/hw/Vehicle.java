package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    // проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void initVehicles() {
        car = new Car("Dodge", "Ram", 2010);
        motorcycle = new Motorcycle("Ducati", "SportClassic", 2006);
    }

    @Test
    void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    // проверка того, объект Car создается с 4-мя колесами
    @Test
    void testCarIsFourWheels() {
        assertTrue(car.getNumWheels() == 4);
    }

    // проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    void testMotoIsTwoWheels() {
        assertTrue(motorcycle.getNumWheels() == 2);
    }

    // проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void testCarIsSpeedTest() {
        car.testDrive();
        assertTrue(car.getSpeed() == 60);
    }

    // проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    void testMotoIsSpeedTest() {
        motorcycle.testDrive();
        assertTrue(motorcycle.getSpeed() == 75);
    }

    // проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    void testCarIsStopAfterParking() {
        car.testDrive();
        car.park();
        assertTrue(car.getSpeed() == 0);
    }

    // проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    void testMotoIsStopAfterParking() {
        motorcycle.testDrive();
        motorcycle.park();
        assertTrue(motorcycle.getSpeed() == 0);
    }
}