package com.company;

import com.company.factory.IceCream;

public class App {
    public static void main(String[] args) {
        IceCream iceCream = new IceCream();
        IceCream iceCream1 = new IceCream();


        System.out.println("this system handles data from factory to consumer " + iceCream + iceCream1);
    }
}

