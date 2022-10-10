public class Main {
    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 30;
        int sayi3 = 20;

        int enBuyuk = sayi1;
        int enKucuk = sayi3;

        //buyuk sayi if blogu
        if (enBuyuk<sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk<sayi3) {
            enBuyuk = sayi3;
        }

        //kucuk sayi if blogu

        if (enKucuk>sayi2) {
            enKucuk = sayi2;
        }
        if (enKucuk>sayi1) {
            enKucuk = sayi1;
        }

        System.out.println("En buyuk sayi = "+enBuyuk);
        System.out.println("En kucuk sayi = "+enKucuk);
    }
}