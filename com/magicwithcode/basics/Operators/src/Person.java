public class Person {

    int age;
    double salary;
    boolean hasBadCredit;

    public Person(int age, double salary){
        this.age = age;
        this.salary = salary;
        this.hasBadCredit = true;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isHasBadCredit() {
        return hasBadCredit;
    }

    public void setHasBadCredit(boolean hasBadCredit) {
        this.hasBadCredit = hasBadCredit;
    }



}
