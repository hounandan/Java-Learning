public class Student {

    static int computeCount = 0;

    int id;
    char gender;
    int age;
    long phone;
    double gpa;

    String name;
    String degree;
    boolean isInternationalStudent;

    double tutionFee = 15000d;
    double internationalTutionFee = 2000d;


    boolean updateName(String name){
        this.name = name;
        return true;
    }


    //default Constructor
    Student(){}

    Student(int id, char gender, int age, long phone, double gpa, String name,
            String degree) {

        this(id, gender, age, phone, gpa, name,
                degree, false);


    }

    // Primary Constructor
    Student(int id, char gender, int age, long phone, double gpa, String name,
            String degree, boolean isInternationalStudent) {

        this.id = id;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.gpa = gpa;
        this.name = name;
        this.degree = degree;
        this.isInternationalStudent = isInternationalStudent;
        computeCount++;

        if (this.isInternationalStudent) {
            tutionFee = tutionFee + internationalTutionFee;
        }

        if(gpa > 3.5){
            tutionFee = tutionFee - 5000d;
        }

        System.out.println("Id : " + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("Gender : " + this.gender);
        System.out.println("Age : " + this.age);
        System.out.println("Phone : " + this.phone);
        System.out.println("GPA : " + this.gpa);
        System.out.println("Degree : " + this.degree);
        System.out.println("Tuition Fee : " + this.tutionFee);
        System.out.println("Compute Count : " + computeCount);
        System.out.println();

    }



}