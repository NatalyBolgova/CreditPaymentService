public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthPayment1year = service.calculate(1000000,12);
        System.out.printf("Ежемесячный платёж составит %.0f\n", monthPayment1year);

        double monthPayment2year = service.calculate(1000000,24);
        System.out.printf("Ежемесячный платёж составит %.0f\n", monthPayment2year);

        double monthPayment3year = service.calculate(1000000,36);
        System.out.printf("Ежемесячный платёж составит %.0f\n", monthPayment3year);
    }
}

