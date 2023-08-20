package com.example.demo.practice;

public class ClassWritingPractice {

    String s = "Sonia";
   static int a = 10;
    String schoolName = "A";

    public void soniaDetails(){
        String s = "Amana Sonia";
        int age = 28;
        System.out.println("Name: "+s+" Age: "+age);
    }

    public void RoneyDetails(){
        int age = 28;
        System.out.println("Name: "+s+" Age: "+age);
    }


    public static void main(String[] args) {
        System.out.println("Hi there");
        ClassWritingPractice p = new ClassWritingPractice();
        p.soniaDetails();
        p.RoneyDetails();
        System.out.println("Both are studying at "+p.schoolName);
        System.out.println("Age "+ ClassWritingPractice.a);
    }
}
