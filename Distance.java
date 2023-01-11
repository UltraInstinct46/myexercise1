package myexercise1;

import java.util.Scanner;

public class Distance{
    public static void main(String[] args){
        int u,a,t,Distance;
        System.out.println("Enter the value of Initial Velocity:");
        Scanner sc1 = new Scanner(System.in);
        u=sc1.nextInt();
        System.out.println("Enter the value of acceleration:");
        Scanner sc2 = new Scanner(System.in);
        a= sc2.nextInt();
        System.out.println("Enter the value of Time:");
        Scanner sc3 = new Scanner(System.in);
        t=sc2.nextInt();
        Distance = u*t+(a*t*t)/2;
        System.out.println("Distance Travelled ="+Distance+" Meter");
    }
}