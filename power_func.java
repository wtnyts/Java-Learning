import java.util.Scanner;
public class power_func {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        int x = in.nextInt();
        System.out.print("Введите значение n: ");
        int n = in.nextInt();
        System.out.println(pow(x,n));}

    public static double pow(double x, double n) {
        double y=x;
        if (n==0)
            return 1;
        else
        if (n>0) {
            while (n>1) {
                --n;
                y=y*x;}
            return  y;}
        else
        if (n<0) {
            while (n<-1) {
                y=y*x;
                ++n;}
            y=1/y;
            return y;}
        return y;
    }
}
