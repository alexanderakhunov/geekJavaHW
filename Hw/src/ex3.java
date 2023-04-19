/*Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)
 */
public class ex3 {
    public static void main(String[] args) {
        int i, j;
        boolean check;

        for (i = 2; i < 100; i++) {
            check = true;

            for (j = 2; j < i; j++) {
                if ((i % j) == 0) {
// если число нацело разделилось на какое-либо стоящее перед ним, то это непростое (false)
                    check = false;
// System.out.print(j);
// System.out.println(check);
                    break;
                }
            }

            if (check) {
                System.out.println(i + " simple");

            }
        }
    }
}