package ru.mirea.gibo0119.pr5;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

    publicclassMain {
public static void main(String[] args) {
        /*Week day= Week.СУББОТА;
 Week num= day;
 System.out.println(day.ordinal()+1);
 System.out.println(num.name());
 for(Week i:day) {
 System.out.println(Week.values());
        }*/
        Planet planet = Planet.EARTH;
        System.out.println("Каков ваш вес");
        Scanner sc = new Scanner(System.in);
        int ves=sc.nextInt();
        double mas=ves/planet.surfaceGravity();
        for (Planet p : Planet.values())
        System.out.printf("Your weight on %s is %f%n",
        p, p.surfaceWeight(mas));
        DecimalFormat fmt=new DecimalFormat("#.##");
        for (Planet p : Planet.values()) System.out.println("Ваш вес на планете: "+p+" "+fmt.format(p.surfaceWeight(mas)));

        }
        }
