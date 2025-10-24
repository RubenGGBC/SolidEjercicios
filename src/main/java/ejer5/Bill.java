package ejer5;

import ejer2.BillCalculator;

import java.util.Date;

public class Bill  {
    public String code;
    public Date date;
    public float initialAmount;
    public float totalVAT;
    public float totalDeduction;
    public float billTotal;
    public int deductionPercentage;

    private DeductionCalculator deductionCalculator;
    private VATCalculator vatCalculator;

    public Bill(DeductionCalculator deductionCalculator, VATCalculator vatCalculator) {
        this.deductionCalculator = deductionCalculator;
        this.vatCalculator = vatCalculator;
    }

    public void billTotalCalc() {
        totalDeduction = deductionCalculator.calc(initialAmount, deductionPercentage);
        totalVAT = vatCalculator.calc(initialAmount);
        billTotal = (initialAmount - totalDeduction) + totalVAT;
    }
}