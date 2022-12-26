public class Task3 {
    public static void main(String[] args) {
        int a = 90;
        int b = 3;
        int[] abc = {1, 2, 3, 4};
        try {
            System.out.println(a / b);
            printSum(23, 234);
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Divide by zero");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }

    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}