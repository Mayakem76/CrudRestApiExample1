package kemy.dev.CrudRestApiExample1.entities;

import javax.persistence.*;

/*
write a Spring Boot application with the necessary dependencies that:
uses Rest Repositories HAL Explorer
connects to a local MySQL db
drops the schema at the end of the session
defines a table of cars, where each Car has:
a primary key
a modelName not null
a serialNumber not null
a currentPrice that can be null
defines a repository for the cars, so that it's possible to use HAL Explorer to explore the data
use the HAL Explorer to add 2 cars in the database
use the HAL Explorer to list all the cars in the database
*/
@Entity
@Table
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private String modelName;
    @Column(nullable = false)
    private String serialNumber;
    private double currentPrice;

    public Car(){}
    public Car(Long id, String modelName, String serialNumber, double currentPrice) {
        this.id = id;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.currentPrice = currentPrice;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
