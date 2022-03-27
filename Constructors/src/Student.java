public class Student {

    private static int computeCount = 0;

    private int id;
    private char gender;
    private int age;
    private long phone;
    private double gpa;

    private String name;
    private String degree;
    private boolean isInternationalStudent;

    private double tutionFee = 15000d;
    private double internationalTutionFee = 2000d;


    public boolean updateName(String name){
        this.name = name;
        return true;
    }

    public void swap(Student[]students, int firstIndex, int secondIndex){
        Student temp = students[firstIndex];
        students[firstIndex] = students[secondIndex];
        students[secondIndex] = temp;
    }


    //default Constructor
    Student(){}

    public Student(int id, char gender, int age, long phone, double gpa, String name,
            String degree) {

        this(id, gender, age, phone, gpa, name,
                degree, false);


    }

    // Primary Constructor
    public Student(int id, char gender, int age, long phone, double gpa, String name,
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


    public static int getComputeCount() {
        return computeCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if(gender=='M' || gender=='F' || gender=='O'){
            this.gender = gender;
        }else {
            throw new IllegalArgumentException("Invalid Gender");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public boolean isInternationalStudent() {
        return isInternationalStudent;
    }

    public void setInternationalStudent(boolean internationalStudent) {
        isInternationalStudent = internationalStudent;
    }

}