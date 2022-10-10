public class Main {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Mukemmel : Gectiniz");
                break;

            case 'B':
            case 'C':
                System.out.println("Guzel : Gectiniz");
                break;

            case 'F':
                System.out.println("Kotu : Kaldiniz");
                break;

            default:
                System.out.println("Gecersiz giris yaptiniz!");
        }
    }
}