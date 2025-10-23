package ejer2;

public class DeductionCalculator {
    public float calculate(float initialAmount, int deductionPercentage) {
        if(initialAmount>3600) {
            return (initialAmount * deductionPercentage+4.5f) / 100;
        }
        return (initialAmount * deductionPercentage) / 100;
    }
}