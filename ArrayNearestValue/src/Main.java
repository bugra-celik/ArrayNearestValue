import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int sayi;


        Scanner scan = new Scanner(System.in);
        System.out.print("Girilen sayı:");

        sayi = scan.nextInt();
        int[] list = {15,12,788,1,-1,-778,2,0,sayi};

        Arrays.sort(list);

        int index = Arrays.binarySearch(list,sayi);


        System.out.println("Girilen sayıdan küçük en yakın sayı:" +list[index-1]);
        System.out.println("Girilen sayıdan büyük en yakın sayı:" +list[index+1]);




    }
}
