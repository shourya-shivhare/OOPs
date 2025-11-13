class box {
    int length;
    int height;

    box(int length, int height) {
        this.length = length;
        this.height = height;
    }
}

class A {
    static int num = 5;
    static int add(int x , int y) {
        return x + y;
    }
    static int add(int x) {
        return x + num;
    }
}

class singleton {
    public static int value;
    public static singleton Obj;

    private singleton() {
        value = 0;
    }

    public static singleton getInstance() {
        if(Obj == null) {
            Obj = new singleton();
            System.out.println("Instance created!");
        }
        return Obj;
    }

    public static int getValue() {
        if(Obj == null) {
            System.out.println("No Object exists.");
            return -1;
        }
        return Obj.value;
    }

    public static void setValue(int val) {
        if(Obj == null) {
            System.out.println("No object exists.");
            return;
        }
        Obj.value = val;
    }
}

public class Introduction {
    public static void main(String[] args) {

        // 1. FINAL - keyword used before variable so that its value cannot be changed
        // here the variable must be initialized.

            final Integer a = 8;
            // System.out.println(a);
            // a++;
            // a = 32;
            // System.out.println(a);

            final box b1 = new box(4, 5);
            // System.out.println(b1.length);
            // System.out.println(b1.height);
            // b1.length++;
            // b1.height = 10;
            // System.out.println(b1.length);
            // System.out.println(b1.height);
            // box b2 = new box(2 , 3);
            // b1 = b2;



        // 2. FINALIZATION - any function to be performed when ever java destroys and
        // collects garbage.



        // 3. STATIC - The variable or method named static will be common to all the
        // objects of that class.It is accessed through class name instead of object
        // name.

            // -> We can access and run the static methods without creating an object.
            // -> The main method is declared static.
            // -> We cannot call a non-static method inside a static method because the
            //    non-static method depend upon a instance of the class whereas the static
            //    method does not(solution : create a obj inside that static method of that
            //    non-static method to access its methods).
            // -> If we have static variables inside a class then we can create a static
            //    block that will be executed only once when the class is loaded generally used
            //    to initialize these static variables.
            // -> All the inner classes depends upon the object of the outer class hence a
            //    inner class can be static but an outer class cannot be static.
            // -> As the static stuff does not depends upon the object hence static stuff is done
            //    at runtime.
         
            A N1 = new A();
            // System.out.println(N1.add(4 , 6));

            // System.out.println(A.add(4, 6));
            // System.out.println(A.add(6));



        // 4. SINGLETON CLASS - The class who can have only one object/instance.

            // -> The class will have single static instance and static methods.
            // -> The constructor is private.

            // singleton.getValue();
            // singleton S1 = singleton.getInstance();
            
            // System.out.println(S1.value);
            // singleton.setValue(27);
            // System.out.println(singleton.getValue());
            // System.out.println(S1.value);

    }
}