public class Factorial {
    public static long computeFactorial(int number) {
       
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    public static void main(String[] args) {
        System.out.println(computeFactorial(3));
    }
}