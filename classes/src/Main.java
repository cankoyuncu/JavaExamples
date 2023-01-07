public class Main {
    public static void main(String[] args) {
        customerManager customerManager1 = new customerManager();
        customerManager customerManager2 = new customerManager();
        customerManager1.Add();
        customerManager1.Delete();
        customerManager1.Update();

        customerManager2.Update();

        int[] numbers1 = new int[]{1,2,3};
        int[] numbers2 = new int[]{4,5,6};
        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println(numbers2[0]);
    }
}