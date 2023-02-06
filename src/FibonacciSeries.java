import java.util.Scanner;

public class FibonacciSeries {
    //Program to print fibonacci series
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly enter a number to see upto fibonacci series");
        int size = scanner.nextInt();
        int sum = 0, num1=0, num2=1;
        System.out.println("Fibonacci series: ");
        System.out.println("0");
        System.out.println("1");
        int i=0;
        while (i<size-2){
            sum=num1+num2;
            num1=num2;
            num2=sum;
            System.out.println(sum);
            i++;
        }

    }
}