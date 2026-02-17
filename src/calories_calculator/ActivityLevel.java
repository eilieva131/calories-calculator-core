package calories_calculator;

public enum ActivityLevel {
    NONE(1, 1.2),
    LOW(2, 1.38),
    MEDIUM(3, 1.55),
    HIGH(4, 1.73),
    EXTREME(5, 1.9);

    private final int activityNumber;
    private final double activityCoefficient;

    ActivityLevel(int activityNumber, double activityCoefficient) {
        this.activityNumber = activityNumber;
        this.activityCoefficient = activityCoefficient;
    }

    public double getActivityCoefficient() {
        return activityCoefficient;
    }

    public static ActivityLevel userChoice(int number) {
        for (ActivityLevel activityLevel : values()) {
            if (activityLevel.activityNumber == number) {
                return activityLevel;
            }
        }
        throw new IllegalArgumentException(
                "Ниво на активност трябва да е число от 1 до 5"
        );
    }
}

