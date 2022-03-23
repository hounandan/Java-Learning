public class Main {




    static void preAndPost(){

        int i=0;

        int y;

        y = i++;
        System.out.println("y="+y+" i="+i);

        i=5;y=0;
        y = --i;
        System.out.println("y="+y+" i="+i);

        int index=0;
        int[] arrays = new int[3];
        arrays[index++] = 10;
        arrays[index++] = 20;
        arrays[index++] = 30;
        System.out.println("Index value = "+index);

    }

    static void compoundArithmeticAssignments(){
        int x = 100;
        System.out.println("x += 5 : "+(x+=5));
        System.out.println("x -= 5 : "+(x-=5));
        System.out.println("x *= 5 : "+(x*=5));
        System.out.println("x /= 5 : "+(x/=5));
        System.out.println("x %= 5 : "+(x%=5));

    }

    static void isOddOrEven(int a){
        System.out.println(a%2);
    }

    static void comparisonOperators(){
        int age = 25;

        System.out.println("age > 21 : "+ (age>21));
        System.out.println("age >= 21 : "+ (age>=21));
        System.out.println("age < 21 : "+ (age<21));
        System.out.println("age <= 21 : "+ (age<=21));
        System.out.println("age == 21 : "+ (age==21));
        System.out.println("age != 21 : "+ (age!=21));

        Student s1 = new Student(1, "Nandan");
        Student s2 = new Student(2, "Hounandan");
        System.out.println("s1 == s2: "+ (s1 == s2));
        System.out.println("s1 != s2: "+ (s1 != s2));

        s1.update(s1, "Nandy");
        System.out.println("Updated name of s1: "+s1.name);

    }

    static void logicalOperators(){

        Person p1 = new Person(37, 90_000d);
        int age = p1.getAge();
        double salary = p1.getSalary();
        boolean hasBadCredit = p1.isHasBadCredit();

        if(age > 40 || salary>100_000){
            System.out.println("Loan approved");
        }else {
            System.out.println("Loan not approved");
        }

    }

    static void bitwiseOperators(){

        int x = 1;
        int y = 3;

        System.out.println("x & y: "+(x&y));
        System.out.println("x | y: "+(x|y));
        System.out.println("x ^ y: "+(x^y));
        System.out.println("~x: "+(~x));
        System.out.println("true & false: "+(true & false));

        char c1 = 'a';
        char c2 = 'b';
        System.out.println("c1 | c2: "+(c1|c2));


    }


    public static void main(String[] args) {

//        preAndPost();
//        compoundArithmeticAssignments();
//        isOddOrEven(5);
//        comparisonOperators();
//        logicalOperators();

        bitwiseOperators();
    }


}
