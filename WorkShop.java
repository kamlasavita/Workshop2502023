package com.workshop.first;

import java.util.Scanner;

public class WorkShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.nextLine();
//        int age = sc.nextInt();
        char ss = sc.next().charAt(0);
        System.out.println("Name: "+name);
//        System.out.println("Age: "+age);
        sc.close();


    }
}
