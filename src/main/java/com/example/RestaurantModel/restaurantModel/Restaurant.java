package com.example.RestaurantModel.restaurantModel;


public class Restaurant {
    private String restaurantName;
    private Integer restaurantNumber;
    private String restaurantAddress;
    private String speciality;
    private Integer totalStaff;
    Restaurant(){}


    public Restaurant(String restaurantName, Integer restaurantNumber, String restaurantAddress,
                      String speciality, Integer totalStaff) {
        this.restaurantName = restaurantName;
        this.restaurantNumber = restaurantNumber;
        this.restaurantAddress = restaurantAddress;
        this.speciality = speciality;
        this.totalStaff = totalStaff;
    }


    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Integer getRestaurantNumber() {
        return restaurantNumber;
    }

    public void setRestaurantNumber(Integer restaurantNumber) {
        this.restaurantNumber = restaurantNumber;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Integer getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(Integer totalStaff) {
        this.totalStaff = totalStaff;
    }
}
