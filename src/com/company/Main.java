package com.company;

import Auto.*;
import Exceptions.*;
import Interface.*;

public class Main {
    public static void main(String[] args)  {

        try {
             /*
            Transport car = new Car("BMW", 5);
            System.out.println(Vehicle.getAverage(car));
            Vehicle.printNamesModel(car);
            Vehicle.printPricesModel(car);
            car.addNewModel("Машина5",540);
            car.addNewModel("Машина6",-540);
            Vehicle.printNamesModel(car);
            Vehicle.printPricesModel(car);
            car.deleteModelByName("Машина0");
            Vehicle.printNamesModel(car);
            Vehicle.printPricesModel(car);
            car.setNewModelName("Машина665","Машина6663");
            car.setPriceModelByName("Машина8",700);
            Vehicle.printNamesModel(car);
            Vehicle.printPricesModel(car);
           */
            Transport motorbike = new Motorbike("Harley", 5);
            System.out.println(Vehicle.getAverage(motorbike));
            Vehicle.printNamesModel(motorbike);
            Vehicle.printPricesModel(motorbike);
            motorbike.addNewModel("Мотоцкил6",540);
           // motorbike.addNewModel("Мотик34",-540);
            Vehicle.printNamesModel(motorbike);
            Vehicle.printPricesModel(motorbike);
            motorbike.deleteModelByName("Мотоцикл1");
            Vehicle.printNamesModel(motorbike);
            Vehicle.printPricesModel(motorbike);
            motorbike.setNewModelName("Мотоцикл2","Мотоцикл5");
            //motorbike.setPriceModelByName("Мотоцикл5",700);
            Vehicle.printNamesModel(motorbike);
            Vehicle.printPricesModel(motorbike);

        } catch (DuplicateModelNameException | NoSuchModelNameException e) {
            System.out.println(e);
        }
    }
}
