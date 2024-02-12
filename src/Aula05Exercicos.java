public class Aula05Exercicos {
    public static void main(String[] args) {
        double yearlyPaymentPercentage1 = 7.5/100;
        double yearlyPaymentPercentage2 = 15.0/100;
        double yearlyPaymentPercentage3 = 22.5/100;
        double myYearlyPayment = 35000;
        double annualFee;
        if (myYearlyPayment <= 33920) {
            annualFee = myYearlyPayment * yearlyPaymentPercentage1;
        } else if (myYearlyPayment >= 33921 && myYearlyPayment <= 45012) {
            annualFee = myYearlyPayment * yearlyPaymentPercentage2;
        }else{
            annualFee = myYearlyPayment * yearlyPaymentPercentage3;
        }
        System.out.println(annualFee);
    }
}
