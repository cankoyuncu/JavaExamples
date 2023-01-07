public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
        int search = 8;
        boolean isThere = false;

        for (int number : numbers) {
            if (number == search) {
                isThere = true;
                break;
            }
        }
        if (isThere) {
            sendMessage("Number is found!" +search);
        } else {
            sendMessage("Number is not found!" +search);
        }
    }
    public static void sendMessage(String message){
        System.out.println(message);
    }
}
