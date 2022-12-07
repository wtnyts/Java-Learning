import java.util.Scanner;

public class factorial {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение х: ");
        int x=in.nextInt();
        System.out.println(fact(x));}

    public static int fact(int x){
        int f=1;
        while (x!=0) {
            f=f*x;
            --x;
        } return f;
    }
}
