package com.example.demo2.Maruf;

import java.time.LocalDate;

public class RestaurantBooking {
    private String restaurantName;
    private LocalDate date;
    private int people;

    public RestaurantBooking(String restaurantName, LocalDate date, int people) {
        this.restaurantName = restaurantName;
        this.date = date;
        this.people = people;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "RestaurantBooking{" +
                "restaurantName='" + restaurantName + '\'' +
                ", date=" + date +
                ", people=" + people +
                '}';
    }
}
