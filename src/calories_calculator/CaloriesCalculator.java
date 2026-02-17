package calories_calculator;

public class CaloriesCalculator {

    private double weightKg;
    private double heightCm;
    private int age;
    private Gender gender;
    private ActivityLevel activityLevel;
    private double exerciseCalories;

    public CaloriesCalculator(double weightKg,
                              double heightCm,
                              int age,
                              Gender gender,
                              ActivityLevel activityLevel,
                              double exerciseCalories) {

        setWeightKg(weightKg);
        setHeightCm(heightCm);
        setAge(age);
        setGender(gender);
        setActivityLevel(activityLevel);
        setExerciseCalories(exerciseCalories);
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg > 0 ? weightKg : 1.0;
    }

    public void setHeightCm(double heightCm) {
        this.heightCm = heightCm > 0 ? heightCm : 50.0;
    }

    public void setAge(int age) {
        this.age = age > 0 ? age : 1;
    }

    public void setGender(Gender gender) {
        this.gender = gender != null ? gender : Gender.MALE;
    }

    public void setActivityLevel(ActivityLevel activityLevel) {
        this.activityLevel = activityLevel != null
                ? activityLevel
                : ActivityLevel.NONE;
    }

    public void setExerciseCalories(double exerciseCalories) {
        this.exerciseCalories = exerciseCalories >= 0
                ? exerciseCalories
                : 0.0;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public double getHeightCm() {
        return heightCm;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public ActivityLevel getActivityLevel() {
        return activityLevel;
    }

    public double getExerciseCalories() {
        return exerciseCalories;
    }

    public double calculateRMR() {
        int g = (gender == Gender.MALE) ? 1 : 0;

        return (9.95 * weightKg)
                + (6.28 * heightCm)
                - (4.94 * age)
                + (167.0 * g)
                - 160.0;
    }

    public double calculateDailyBurnedCalories() {
        return calculateRMR() * activityLevel.getActivityCoefficient();
    }

    public double calculateCaloriesForWeightLoss() {
        return (calculateDailyBurnedCalories() + exerciseCalories) - 500.0;
    }
}