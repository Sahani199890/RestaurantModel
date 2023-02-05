package com.example.RestaurantModel.restaurantService;

import com.example.RestaurantModel.restaurantModel.Restaurant;

import java.util.ArrayList;
import java.util.function.Predicate;

@org.springframework.stereotype.Service

public class Service {
    private static ArrayList<Restaurant> list=new ArrayList<>();
    static{
        list.add(new Restaurant("Bawarchi",89898989,"FamousePlace","Dosa",12));
        list.add(new Restaurant("Cookie",89898988,"FamousePlace1","Biryani",120));
        list.add(new Restaurant("Bawarchi2",89898987,"FamousePlace1","RudeBehaviour",1200));
    }
    public void addInfo(Restaurant restaurant) {
        list.add(restaurant);
    }
    public ArrayList<Restaurant> getAll() {
        return list;
    }
    public Restaurant getbyname(String name) {
        Predicate<? super Restaurant> predicate = resto -> resto.getRestaurantName().equals(name);
        Restaurant resto = list.stream().filter(predicate).findFirst().get();
        return resto;
    }
}
