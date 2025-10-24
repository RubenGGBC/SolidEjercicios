package ejer5;

public class Deduction implements DeductionCalculator {
    @Override
    public float calc(float initialAmount, int deductionPercentage) {
        return (initialAmount * deductionPercentage) / 100;
    }
}