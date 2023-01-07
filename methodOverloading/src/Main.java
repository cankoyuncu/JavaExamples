public class Main {
    public static void main(String[] args) {
        FourOperations fourOperations = new FourOperations();
        System.out.println(fourOperations.add(4,8));
        fourOperations.add(1,2);
        System.out.println(fourOperations.add(4,6,8));
    }
}