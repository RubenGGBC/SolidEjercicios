package ejer5;

public class VAT implements VATCalculator {
    @Override
    public float calc(float initialAmount) {
        return (float) (initialAmount * 0.16);
    }
}