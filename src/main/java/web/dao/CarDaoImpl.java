package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> cars = Arrays.asList(
            new Car("Toyota", "Camry", 2020),
            new Car("Honda", "Civic", 2021),
            new Car("Ford", "Mustang", 2022),
            new Car("Chevrolet", "Malibu", 2019),
            new Car("Nissan", "Altima", 2020)
    );

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
