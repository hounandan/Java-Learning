public class Main {

    public static void main(String[] args) {

        Static s = new Static();
        Static.listFileds();

        Static1 s1 = new Static1();
        Static1.listFileName();

        Static2 s2 = new Static2();
        Static2.listFileName();

        Instance i = new Instance();
        i.listFields();

    }


}
