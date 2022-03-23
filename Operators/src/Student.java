public class Student {

    int id;
    String name;
    String gender = "Male";

    public Student(int id, String name) {
        this(name);
        this.id = id;
    }

    public Student(String name){
        this.name=name;
    }

    public boolean updateProfile(String name){
        this.name = name;
        return true;
    }

    public boolean update(Student s, String name){
        if(null != s){
            s.name = name;
            return true;
        }
        return false;
    }

}
