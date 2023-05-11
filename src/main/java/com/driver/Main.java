package com.driver;

public class Main {
     public static class Product{
        public int product(int x , int y){
            return x * y;
        }
        public int product(int x , int y , int z){
            return x * y * z;
        }
        public double product(double x , double y){
            return x * y;
        }
    }
    public static void main(String[] args) {
        Product p = new Product();
        int l = p.product(3,4);
        int m = p.product(3,4,5);
        double n = p.product(3.1,4.1);
        System.out.println(l +" "+ m +" "+ n);
    }
}
