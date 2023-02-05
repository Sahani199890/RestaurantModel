package com.example.RestaurantModel.restaurantController;

import com.example.RestaurantModel.restaurantModel.Restaurant;
import com.example.RestaurantModel.restaurantService.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/restaurant")
public class Controller {
    @Autowired
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @PostMapping("/restaurant/info")
    public void saveRestaurant(@RequestBody Restaurant restaurant){
        service.addInfo(restaurant);
    }
    @GetMapping("getRestaurantInfo")
    public ArrayList<Restaurant> getAddOfRestaurant(){
        return service.getAll();
    }
    @GetMapping("RestaurantMatAana/name/{name}/")
    public Restaurant restaurantName(@PathVariable String name){
        return service.getbyname(name);
    }

}
