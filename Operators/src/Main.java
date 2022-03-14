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


    public static void main(String[] args) {

        preAndPost();
        compoundArithmeticAssignments();
        isOddOrEven(5);

    }


}
