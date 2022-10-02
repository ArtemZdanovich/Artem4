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
            res = sum / arrSize;
        }
        System.out.println("Среднемесячная температура " + res);
        //=========================================================//
        // Task2
        int[] arr = {7, 2, 10, 5, 9};
        bubbleSort(arr);
        if(arr[1] - arr[0] >= 3){
            int sum1 = 0;
            for (int i = 1; i < arr.length; i++) {
                sum1 = sum1 + arr[i];
            }
            int ElSum = sum1 / (arr.length-1);

            arr[0] = ElSum;
            System.out.println("итоговые отзывы:");
            for (int i = 0; i < arr.length; i++)
             {
                System.out.println(arr[i]);
            }
        }

    }
    public static void bubbleSort( int[] array){
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
    