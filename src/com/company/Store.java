package com.company;

import java.util.Scanner;

public class Store {
    //countOfWorkers, name, phoneNumber,
    //product number

    private int countOfWorkers;
    private String name;
    private int phonenumber;
    private int productNumber;

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if(countOfWorkers >= 2 && countOfWorkers <= 50) {
            this.countOfWorkers = countOfWorkers;
        }else {
            System.out.println("Wrong number");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 3) {
            this.name = name;
        }else {
            System.out.println("Name is too short");
        }
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {

        if( String.valueOf(phonenumber).length() >= 8){
            this.phonenumber = phonenumber;
        }else {
            System.out.println("Phone number is invaid");
        }

    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public Store() {
    }

    public Store(int countOfWorkers, String name, int phonenumber, int productNumber) {
        setCountOfWorkers(countOfWorkers);
        setName(name);
        setPhonenumber(phonenumber);
        setProductNumber(productNumber);
    }

    @Override
    public String toString() {
        return "Store{" +
                "countOfWorkers=" + countOfWorkers +
                ", name='" + name + '\'' +
                ", phonenumber=" + phonenumber +
                ", productNumber=" + productNumber +
                '}';
    }

    public int sellingProducts (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to buy a product, enter quantity, if no, press any other key");

        String quantitySold = scanner.nextLine();

        boolean allInt = false;

        for(int i = 0; i < quantitySold.length(); i ++){
            if(Character.isDigit(quantitySold.charAt(i))){
                allInt = true;

            }
        }

        if(allInt){
            int quantToInt = Integer.valueOf(quantitySold);
            productNumber -= quantToInt;
        }else {
            System.out.println("See you next time");
        }

        return productNumber;


    }

}
