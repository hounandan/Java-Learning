class Student {

    static int staticVar = 500;
    int instanceVar = 1000;

    void compute(){

        int localVar = instanceVar + 5;

        System.out.println("Local Variable - "+ localVar);
        System.out.println("Instance Variable - "+instanceVar);
    }

    /*
    void checkLocalVar(){
        System.out.println(localVar);
    }

    The above method will throw error - because the scope of the localVar is
    within the compute() method. We cannot access that beyond the method

     */


    public static void main(String[] args) {

        Student student = new Student();

        student.compute();

        int checkStaticVar = Student.staticVar;
        System.out.println("Static Variable - "+checkStaticVar);

        /*
        For accessing an Instance variable, we have to create an object - and use the variables accordingly

        But for Static variables, we don't have to create object - they can be accessed directly from the
        class
         */

    }

}
