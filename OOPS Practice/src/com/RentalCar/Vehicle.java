package com.RentalCar;

public abstract class Vehicle {
    private String vehicleNumber;
    private String modelName;
    private boolean isAvailable;
    private double rentPerDay;
    private double maintenancePerDay;
    private double currentFuelLevel;

    public Vehicle(String vehicleNumber,String modelName,boolean isAvailable,
                   double rentPerDay,double maintenancePerDay, double currentFuelLevel){
        this.vehicleNumber = vehicleNumber;
        this.modelName = modelName;
        this.isAvailable = true;
        this.rentPerDay = rentPerDay;
        this.maintenancePerDay = maintenancePerDay;
        this.currentFuelLevel = currentFuelLevel;
    }

    public abstract void rentVehicle();

    public abstract void calculateRent(int days);

    public abstract void returnVehicle(double fuelReturned);

    public void getVehicleInfo(){
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Model Name : " + modelName);
        System.out.println("Rent Per Day : " + rentPerDay);
        System.out.println("Maintenance fees Per day : " + maintenancePerDay);
        System.out.println("Current Fuel Level  : " + currentFuelLevel);
        System.out.println("Vehicle is available : " + (isAvailable ? "Yes" : "NO"));
    }

    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public String getModelName(){
        return  modelName;
    }
    public boolean isAvailable(){
        return  isAvailable;
    }
    public void setAvailable(boolean isAvailable){
        isAvailable = isAvailable;
    }
    public double getRentPerDay() {
        return rentPerDay;
    }

    public double getMaintenanceFeePerDay() {
        return maintenancePerDay;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }
}
