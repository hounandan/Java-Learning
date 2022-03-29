public class Instance {

    private String name;
    private int id;
    private String gender;

    {
        System.out.println("Instance Initializer - START");
        name = "Nandan";
        id = 35;
        gender = "Male";
        System.out.println("Instance Initializer - END");
    }

    public void listFields(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(gender);
        System.out.println();
    }

}
