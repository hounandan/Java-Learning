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

    //default Constructor
    Student(){}

    Student(int newId, char newGender, int newAge, long newPhone, double newGpa, String newName,
            String newDegree, boolean isInternationalStudentflag) {

        id = newId;
        gender = newGender;
        age = newAge;
        phone = newPhone;
        gpa = newGpa;
        name = newName;
        degree = newDegree;
        isInternationalStudent = isInternationalStudentflag;

        compute();

    }


    void compute() {

        int nextId = id + 1;
        computeCount++;

        if (isInternationalStudent) {
            tutionFee = tutionFee + internationalTutionFee;
        }

        System.out.println("Id : " + id);
        System.out.println("Next Id : " + nextId);
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Age : " + age);
        System.out.println("Phone : " + phone);
        System.out.println("GPA : " + gpa);
        System.out.println("Degree : " + degree);
        System.out.println("Tuition Fee : " + tutionFee);
        System.out.println("Compute Count : " + computeCount);
        System.out.println();


    }
}