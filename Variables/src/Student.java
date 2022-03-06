public class Student {


        static void typeCasting(){

                // Implicit Casting order
                byte nb = 5;
                short ns = nb;
                int ni = ns;
                long nl = ni;
                float nf = nl;
                double nd = nf;
                System.out.println("Implicit casting : "+nd);

                //Explicit Casting order
                double zd = 7d;
                float zf = (float) zd;
                long zl = (long) zf;
                int zi = (int) zl;
                short zs = (short) zi;
                char zc = (char) zs;
                byte zb = (byte) zc;
                System.out.println("Explicit casting : "+zb);
                System.out.println();

                //Information loss
                byte ab = (byte) 135;  // Byte value is from -128 to 127; any other assignment will lead to loss of info
                System.out.println("Lost byte : "+ab);

                //Truncated Loss
                int ai = (int)5.99;
                System.out.println("Truncated loss : "+ai);


                
        }


        public static void main(String[] args) {

                Student.typeCasting();

        }

}
