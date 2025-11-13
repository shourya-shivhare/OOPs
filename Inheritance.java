class Animal {
    int age;
    void eat() {};
    void sleep() {};

    Animal(int age) {
        this.age = age;
    }
}

class Dog extends Animal implements Mammals {
    void bark() {};
    @Override
    public void walk() {};
    int pugs;
    Dog(int age , int kids) {
        // super();  If we remove the paramerterized constructor of the parent class then this will run.
        super(age);
        pugs = kids;
    }
}

class Pitbull extends Dog {
    int info;
    Pitbull(int info , int age , int kids) {
        super(age , kids);
        this.info = info;
    }
}

class GermanShepherd extends Dog {
    int stripes;
    GermanShepherd(int stripes , int age , int kids) {
        super(age , kids);
        this.stripes = stripes;
    }
}

interface Mammals {
    void walk();
}

// Final classes cannot be inherited.
// by default declaring a class final will result in making all its methods and fields to be final as well.

// final class box {
//     int height;
//     int length;
//     int breadth;

//     box(int side) {
//         height = side;
//         length = side;
//         breadth = side;
//     }
// } 

// class square extends box {
//     square(int side) {
//         super(side);
//     }
// }



public class Inheritance {
    // Static class concpt - All the objects of inner classes are linked to the object of the outer class.
    //                       hence a object of a non-static class cannot be created inside a static class.
    //                       but the object of a static class can be created inside a static class not only that but the static methods 
    //                       and static fields of a non-static class can also be accessed through the class name.    
    class xyz{
        static int x = 0;
        static int inc(int y) {
            return x + y;
        }
    }
    public static void main(String[] args) {

        
        // INHERITANCE - It allows a class (child or subclass) to inherit properties and
        // behaviors (fields and methods) from another class (parent or superclass or base).

            // -> SUPER - Used to call the constructor of the parent class inside the child class.
                // -> You can access the parent class variables inside the child class using the "super" keyword.
                //    (incase you have same name variables in both parent and child class)
                // -> If you don't have any declared constructor "only then" will super call the default constructor if you declare 
                //    any parametized constructor then super will call that constructor only that means it will require 
                //    those parameters 
                // -> You must first call super inside the constructor of the child constructor before initilizing the variables 
                //    of the child class.

            // -> You cannot access the private stuff of the parent class in the child class.But you can have getter and setters 
            //    like functionalities.
            // -> (referance name) (Object name) = new (constructor call);
            //    here if we see their are two main parts one is the referance name and other is the constructor call.
            //    -> Referance name - tells us what all variables can be accessed through this object.
            //    -> Constructor call - tells what all variables are declared.
            //       ** parent var = new child(); **
            //    here the var will have access to only the variable present in the parent class vice versa will cause error.

            Dog D1 = new Dog(8 , 3);
            // System.out.println(D1.age);
            // System.out.println(D1.pugs);


        // TYPES OF INHERITANCE
            // 1. Single Inheritance - when only one class inherits another class.
            //      Eg - Dog extends Animal.

            // 2. MultiLevel Inheritance - when first class inherits second and then third class inherits the second class.
            //      Eg - Dog extends Animal and PitBull extends Dog.

            // 3. Hierarchy Inheritance - when multiple classes extends the same parent class.
            //      Eg - PitBull and GermanShepherd extends Dog class.

            // 4. Multiple Inheritance - when one class extends from more than one class. Done using Interfaces.
            //      Eg - Dog extends from Animal class and Mammals.

            // 5. Hybrid/Virtual Inheritance - a mix of more than one form of inheritance.
            //      Eg - GermanShepherd and PitBull extends Dog (Hierarchical Inheritacne) & 
            //           Dog extends from both Animal and Mammals class (Multiple Inheritance)

            // xyz o = new xyz();
            // System.out.println(xyz.inc(25));
        
    }
}

// Q. Why multiple inheritance is not available in OOPs ?
// A. Diamond Problem — a situation where a class inherits from two classes that have methods with the same name, causing ambiguity.
