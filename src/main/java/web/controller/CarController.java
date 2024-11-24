package web.controller;

import web.model.Car;
import web.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarController {

    private final ICarService carService;

    @Autowired
    public CarController(ICarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(name = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars = carService.getCars(count);  // Используем сервис для получения данных
        model.addAttribute("cars", cars);
        return "cars";  // cars.html
    }
}
