import java.util.Scanner;
/*Вычислить n! (произведение чисел от 1 до n)
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите число fact ");
        int fact = scan1.nextInt();
        System.out.println(GetFact(fact));
    }

    static int GetFact(int a) {
        int res = 1;
        for (int i = 1; i <= a; i++) {
        res*=i;
        }
        return res;
    }
}
