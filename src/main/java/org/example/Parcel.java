package org.example;

public class Parcel {
    private int id;
    private String address;
    private double weight;
    private boolean isAssigned = false;

    public Parcel(int id, String address, double weight) {
        this.id = id;
        this.address = address;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isAssigned() {
        return isAssigned;
    }

    public void setAssigned(boolean assigned) {
        isAssigned = assigned;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", weight=" + weight +
                ", isAssigned=" + isAssigned +
                '}';
    }
}
