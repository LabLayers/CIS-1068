/**
 * Meal Plan Calculator using for loops
 * @author Victor Lourng
 * @version	2016
 */
import java.util.Scanner; 

public class LoopFor {
  /**
   * Ask user for information about their meal plan, then runs methods below.
   */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How much does the meal plan cost?");
    Double plan_rate = keyboard.nextDouble();
    System.out.println("How many meals per week does the meal plan provide?");
    Double plan_type = keyboard.nextDouble();
    System.out.println("On average, how many meals do you actually plan to eat on campus per week?");
    Double actual = keyboard.nextDouble();
    Double actual_rate = CalculateActualRate(actual);
    SuggestMealPlan(plan_rate, actual_rate);
  }
  /**
   * Calculate actual cost of meals if purchased invidually.
   */
  public static Double CalculateActualRate (Double actual) {
    Double actual_rate = 0.00;
    for (int weeks = 1; weeks <= 20; weeks++) {
      actual_rate += actual * 8.49;
    }
    return actual_rate;
  }
  /**
   * Suggest to the user if it is cheaper to purchase a meal plan or purchase a meal individually.
   */
  public static void SuggestMealPlan (Double plan_rate, Double actual_rate) {
    if (actual_rate < plan_rate) {
      System.out.println("It is cheaper to purchase meals individually (at $" + actual_rate + "/semester) than to purchase a meal plan (at $" + plan_rate + "/semester).");
    }
    else if (actual_rate > plan_rate) {
      System.out.println("It is cheaper to purchase a meal plan (at $" + plan_rate + "/semester) than it is to purchase a meal individually (at $" + actual_rate + "/semester).");
    }
    else {
      System.out.println("It costs the same to purchase a meal plan than it is to purchase a meal individually (at $" + actual_rate + "/semester).");
    }
  }
}