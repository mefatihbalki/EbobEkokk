import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

//Kullanıcı Girişi
    System.out.print("n1 Değerini Giriniz: ");
        int n1 = input.nextInt();

        //Değişken Tanımlamaları
        System.out.print("n2 Değerini Giriniz: ");
        int n2 = input.nextInt();
        int ebob=1;
        int ekok = 0;

//Döngü Başlangıcı
        int i=1;
        while (i<=n1){
            i++;
            if (n1 % i == 0 && n2 % i == 0){
                ebob=i;
            }
            
            ekok = (n1*n2)/ebob;
        }
//Program Çıktısı
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);

    }
}