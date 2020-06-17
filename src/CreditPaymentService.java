public class CreditPaymentService {
    public double calculate(double amount, double period) {
        double yearRate = 0.008325;
        double monthRate = yearRate /100 / 12;
        double paymentPeriod = yearRate+(yearRate/((Math.pow((1+yearRate),period)-1)));
        double paymentAmount = amount * paymentPeriod;
        return paymentAmount;

    }
}
