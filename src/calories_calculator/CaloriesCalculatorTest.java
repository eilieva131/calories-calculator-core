package calories_calculator;

public class CaloriesCalculatorTest {

    static void main() {

        CaloriesCalculator calculator = new CaloriesCalculator(
                70.0,
                175.0,
                20,
                Gender.MALE,
                ActivityLevel.MEDIUM,
                300.0
        );

        System.out.println("Weight: " + calculator.getWeightKg() + " kg");
        System.out.println("Height: " + calculator.getHeightCm() + " cm");
        System.out.println("Age: " + calculator.getAge());
        System.out.println("Gender: " + calculator.getGender());
        System.out.println("Activity: " + calculator.getActivityLevel()
                + " (factor " + calculator.getActivityLevel().getActivityCoefficient() + ")");
        System.out.println("Exercise calories: " + calculator.getExerciseCalories());

        System.out.println();
        System.out.println("RMR: " + calculator.calculateRMR());
        System.out.println("Daily burned calories (with activity): "
                + calculator.calculateDailyBurnedCalories());
        System.out.println("Max calories for losing 0.5kg/week: "
                + calculator.calculateCaloriesForWeightLoss());
    }
}