package org.example;

public class Courier {
    private int id;
    private String name;
    private double maxCapacity;
    private double currentLoad;

    public Courier(int id, String name, double maxCapacity) {
        this.id = id;
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.currentLoad = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public double getCurrentLoad() {
        return currentLoad;
    }

    public void setCurrentLoad(double currentLoad) {
        this.currentLoad = currentLoad;
    }

}
