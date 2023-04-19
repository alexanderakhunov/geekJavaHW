import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner iScan = new Scanner(System.in);
        System.out.println("Введите n-ое число ");
        int num = iScan.nextInt();
        System.out.printf("%d\n",getNum(num));
    }
    static int getNum(int a){
        return (a*(a+1))/2;

    }
    /*Вычислить n-ое треугольного число (сумма чисел от 1 до n)
     */
}