import java.util.Scanner;
//Veri alabilmek için Scanner sınıfını projeye dahil ediyoruz


public class Main {
    public static void main(String[] args) {


        //Kullanıcıdan gelecek değerler ve formul için değişkenler atıyoruz
        int fktrA=1,fktrB=1,fktrC=1 ,C,n,r;

        Scanner inp =new Scanner(System.in);


        //Kullanıcıdan değerleri alıyoruz
        System.out.println("Değer giriniz: ");
        n = inp.nextInt();

        System.out.println("Değer giriniz: ");
        r = inp.nextInt();


        //Kullanıcıdan gelen değerlerin faktöriyeli alınıyor
        for(int i =1 ;i<=n; i++){

            fktrA *= i;
        }
        for(int i =1 ;i<=r; i++) {

            fktrB *= i;
        }
        for(int i =1 ;i<=(n-r); i++){

            fktrC *= i;
        }

        //kombinasyon formuluyle hesaplama yapılıyor ve sonuc yazılıyor
        C=fktrA/(fktrB*(fktrC));
        System.out.println("C(n,r) Kombinasyonu\n"+C);

    }
}