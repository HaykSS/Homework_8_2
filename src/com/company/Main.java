package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Store mobileStore = new Store(25,"Ucom",77481489,55984);

        System.out.println(mobileStore.toString());

        mobileStore.sellingProducts();


        System.out.println(mobileStore.toString());


    }
}
