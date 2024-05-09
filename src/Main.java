//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthlyPayment1 = service.calculate(1000000, 12, 9.99);
        System.out.println("Ежемесячный платеж при сумме кредита 1 000 000 р. на 1 год: " + Math.round(monthlyPayment1) + " р.");

        double monthlyPayment2 = service.calculate(1000000, 24, 9.99);
        System.out.println("Ежемесячный платеж при сумме кредита 1 000 000 р. на 2 года: " + Math.round(monthlyPayment2) + " р.");

        double monthlyPayment3 = service.calculate(1000000, 36, 9.99);
        System.out.println("Ежемесячный платеж при сумме кредита 1 000 000 р. на 3 года: " + Math.round(monthlyPayment3) + " р.");
    }
}