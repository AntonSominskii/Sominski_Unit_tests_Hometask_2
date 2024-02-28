package seminars.second.hw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void carIsAlsoAVehicle() {
        Car car = new Car("Toyota", "Camry", 2020);
        assertTrue(car instanceof Vehicle, "Автомобиль должен быть экземпляром Vehicle");
    }

    @Test
    void carIsCreatedWithFourWheels() {
        Car car = new Car("Toyota", "Camry", 2020);
        assertEquals(4, car.getNumWheels(), "Автомобиль должен иметь 4 колеса");
    }

    @Test
    void motorcycleIsCreatedWithTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2021);
        assertEquals(2, motorcycle.getNumWheels(), "Мотоцикл должен иметь 2 колеса");
    }

    @Test
    void carTestDriveSpeedIs60() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.testDrive();
        assertEquals(60, car.getSpeed(), "Скорость автомобиля должна быть 60 во время тестовой поездки");
    }

    @Test
    void motorcycleTestDriveSpeedIs75() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2021);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed(), "Скорость мотоцикла должна быть 75 во время тестовой поездки");
    }

    @Test
    void carStopsWhenParkedAfterTestDrive() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.testDrive(); // Предполагается, что автомобиль теперь в движении
        car.park(); // Теперь автомобиль должен быть припаркован
        assertEquals(0, car.getSpeed(), "Скорость автомобиля должна быть 0 при парковке");
    }

    @Test
    void motorcycleStopsWhenParkedAfterTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2021);
        motorcycle.testDrive(); // Предполагается, что мотоцикл теперь в движении
        motorcycle.park(); // Теперь мотоцикл должен быть припаркован
        assertEquals(0, motorcycle.getSpeed(), "Скорость мотоцикла должна быть 0 при парковке");
    }
}