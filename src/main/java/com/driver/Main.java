package com.driver;

class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of class B
        B obj = new B();

        // Calling the method from class A using the object of class B
        String resultA = obj.meth();
        System.out.println("Result from method of class A: " + resultA);

        // Calling the overridden method from class B
        String resultB = obj.meth();
        System.out.println("Result from overridden method of class B: " + resultB);
    }
}
