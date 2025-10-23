package ejer2;
public class VATCalculator {
    private float vatRate = 0.21f; // SOLO CAMBIAR AQUÍ: de 0.16 a 0.21

    public float calculate(float amount) {
        return amount * vatRate;
    }
}