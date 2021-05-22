package com.withWahib;
import java.util.Scanner;

public class Main {
    public static double []reverse (double[] list){
        double[]result=new double[list.length];
        for(int i=0,j= result.length-1;i< list.length;i++,j--){
            result[j]=list[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        // copy an array
        System.out.print(" Enter n number : ");
        int n = v.nextInt();
        double numbers[] = new double[n];
        for (int i=0; i<numbers.length; i++){
            numbers[i]= (int) (Math.random()*50);
        }
        double num1[]= reverse(numbers);

        for(double i: numbers){
            System.out.println(i);
        }
        System.out.println();
        for(double i: num1){
            System.out.println(i);
        }
    }
}