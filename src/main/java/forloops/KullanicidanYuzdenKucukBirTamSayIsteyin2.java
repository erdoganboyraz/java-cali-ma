package forloops;

import java.util.Scanner;

public class KullanicidanYuzdenKucukBirTamSayIsteyin2 {
    public static void main(String[] args) {

         /*
        5 ) Kullanicidan 100'den kucuk bir tamsayi isteyin.
        1'den baslayarak girilen sayiya kadar 3'un veya 5'in kati olan sayilari yazdirin.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk bir sayi giriniz");
        int ch = input.nextInt();


        for (int i = 1; i < ch; i++) {

            if (ch>99) {
                System.out.println("Lutfen 100'den kucuk bir sayi giriniz");
                break;
            } if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
