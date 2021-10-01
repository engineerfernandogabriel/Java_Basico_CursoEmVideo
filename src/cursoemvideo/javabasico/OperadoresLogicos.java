package cursoemvideo.javabasico;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int x, y, z;
        boolean r, s;
        x = 18;
        y = 7;
        z = 9;


        r = (x < y && y == z) ? true : false;

        System.out.println(r);

        if (x < y && y == z) {
            System.out.println("true");
        } else{
            System.out.println("false");
        }

        s = (x < y || y == z) ? true : false;

        System.out.println(s);

        if (x < y || y == z){
            System.out.println("true");
        } else{
            System.out.println("false");
        }

    }
}
