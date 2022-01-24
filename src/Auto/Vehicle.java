package Auto;

import Interface.Transport;

public class Vehicle {
    public static double getAverage(Transport transport) {
        double[] arrPricesOfModels = transport.getArrayPricesOfModels();
        double sumPrice = 0;
        for (double price : arrPricesOfModels) {
            sumPrice += price;
        }
        return sumPrice / transport.getLenModels();
    }

    public static void printNamesModel(Transport transport) {
        String[] arrNamesOfModels = transport.getArrayNamesOfModels();
        for (String name : arrNamesOfModels) {
            System.out.println("Имя модели: " + name);
        }
    }

    public static void printPricesModel(Transport transport) {
        double[] arrPricesOfModels = transport.getArrayPricesOfModels();
        for (double price : arrPricesOfModels) {
            System.out.println("Цена модели: " + price);
        }
    }
}