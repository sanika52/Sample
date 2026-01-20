import java.util.*;

public class multi{

    public static int multiplication(int a, int b){
        return a*b;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = multiplication(a, b);
        System.out.println("Multiplication ::" + c);
    }
}