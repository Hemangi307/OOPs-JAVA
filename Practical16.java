class LoanCalculator {

    // Home loan
    void calculateEMI(int principal, int time, float rate) {
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Home Loan EMI: Rs. " + emi);
    }

    // Vehicle loan
    void calculateEMI(double principal, int time, double rate) {
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Vehicle Loan EMI: Rs. " + emi);
    }

    // Short-term personal loan (fixed rate = 10%)
    void calculateEMI(int principal, int time) {
        double rate = 10.0;
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Personal Loan EMI: Rs. " + emi);
    }
}

public class Practical16 {
    public static void main(String[] args) {

        System.out.println("Enrollment No:240390107011");
        LoanCalculator loan = new LoanCalculator();

        // Home loan
        loan.calculateEMI(500000, 20, 8.5f);

        // Vehicle loan
        loan.calculateEMI(300000.0, 5, 9.2);

        // Personal loan
        loan.calculateEMI(100000, 2);
    }
}
