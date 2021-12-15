import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] dict = {"ноль","один","два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать", "двадцать", "двадцать один", "двадцать два", "двадцать три", "двадцать четыре", "двадцать пять", "двадцать шесть", "двадцать семь", "двадцать восемь", "двадцать девять", "тридцать", "тридцать один", "тридцать два", "тридцать три", "тридцать четыре", "тридцать пять", "тридцать шесть", "тридцать семь", "тридцать восемь", "тридцать девять", "сорок", "сорок один", "сорок два", "сорок три", "сорок четыре", "cорок пять"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name and number (max 5 dig): ");

        String str = scanner.nextLine();

        System.out.println(str);
//        String str = "Maximus 1";
        String[] words = str.split(" ");
        String[] numbers = words[1].split("");

        int [] nums = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++){
            nums[i] = Integer.parseInt(numbers[i]);
        }
        if (nums.length == 1)
            System.out.println("Привет " + words[0] + "! " + "Сумма чисел = " + dict[(nums[0])]);
        else System.out.println("Привет " + words[0] + "! " + "Сумма чисел = " + dict[(sum(nums)[0])]);
    }

    public static int[] sum(int[] nums) {
        int[] tmp = new int[nums.length - 1];
        if (nums.length > 1) {
            int tmpNum = nums[nums.length - 1];
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = nums[i];
            }
            tmp[tmp.length - 1] += tmpNum;
            if (tmp.length > 1)
                tmp = sum(tmp);
        }
        return tmp;
    }


}
