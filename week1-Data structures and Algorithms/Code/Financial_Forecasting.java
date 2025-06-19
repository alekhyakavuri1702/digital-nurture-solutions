import java.util.Scanner;

public class Financial_Forecasting {

    public static void explainRecursion() {
        System.out.println("----- 1. Understanding Recursion -----");
        System.out.println("Recursion is when a method calls itself to solve a smaller sub-problem.");
        System.out.println("It is useful when a problem can be broken into similar smaller problems.");
        System.out.println("Examples include factorial, Fibonacci, and financial growth predictions.");
        System.out.println("--------------------------------------\n");
    }

    public static double forecastFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return forecastFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void analyzeForecast() {
        System.out.println("\n----- 4. Time Complexity Analysis -----");
        System.out.println("Each recursive call reduces 'years' by 1 until it reaches 0.");
        System.out.println("So, Time Complexity = O(n), where n = number of years.");
        System.out.println("Space Complexity = O(n) due to recursion stack.");
        System.out.println("To optimize:");
        System.out.println("- Use iteration instead of recursion for better performance.");
        System.out.println("- Or use memoization if overlapping subproblems exist (e.g., in Fibonacci).");
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        explainRecursion();

        Scanner sc = new Scanner(System.in);
        System.out.println("----- Financial Forecasting Tool -----");
        System.out.print("Enter current value: ");
        double currentValue = sc.nextDouble();

        System.out.print("Enter annual growth rate (e.g., 0.05 for 5%): ");
        double growthRate = sc.nextDouble();

        System.out.print("Enter number of years to forecast: ");
        int years = sc.nextInt();

        double futureValue = forecastFutureValue(currentValue, growthRate, years);

        System.out.printf("\nPredicted future value after %d years: %.2f\n", years, futureValue);

        analyzeForecast();
    }
}
