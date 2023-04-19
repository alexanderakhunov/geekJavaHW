import java.util.Scanner;
/*Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)
 */
public class ex4 {
    public static void main(String[] args){
        Scanner scan1= new Scanner(System.in);
        System.out.println("Введите n1 ");
        int n1 = scan1.nextInt();
        System.out.println("Введите n2 ");
        int n2 = scan1.nextInt();
        System.out.println("Введите операцию");
        String operation = GetOperations();
        System.out.println(GetResult(operation,n1,n2));

    }
static String GetOperations(){
        Scanner arifm = new Scanner(System.in);
        String operation = arifm.nextLine();
        return operation;
}
static  int GetResult(String opr,int num1,int num2){
    int result = 0;
    switch (opr) {
        case "+":
            result = num1 + num2;
            break;
        case "-":
            result = num1 - num2;
            break;
        case "*":
            result = num1 * num2;
            break;
        case "/":
            result = num1 / num2;

    }
    return result;
}
}

