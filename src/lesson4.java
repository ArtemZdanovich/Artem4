import java.util.Scanner;
//Task1
//среднемесячная температура
public class lesson4 {

    public static void main(String[] args) {
        System.out.println("Введите число дней месяца\n");
        Scanner in = new Scanner(System.in);
        int arrSize = in.nextInt();
        int days[];
        System.out.println("Введите температуру");
        days = new int[arrSize];
        for (int a = 0; a < days.length; a++) {
            days[a] = in.nextInt();

        }
        double sum = 0;
        double res = 0;
        for (int a = 0; a < days.length; a++) {
            sum += days[a];
            res = sum/arrSize;
        }
        System.out.println("Среднемесячная температура "+res);




    }


}