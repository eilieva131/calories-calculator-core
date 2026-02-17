# Calories Calculator Core

Core calculation library for BMI and daily calorie needs.

## What's Inside
- `ActivityLevel.java` - Activity level enum (1-5 with coefficients)
- `Gender.java` - Gender enum (MALE/FEMALE)
- `CaloriesCalculator.java` - Main calculation logic

## Formulas
RMR = (9.95 × weight) + (6.28 × height) - (4.94 × age) + (167 × gender) - 160

Daily Calories = RMR × Activity Coefficient
