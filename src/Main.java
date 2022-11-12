public class Main {
    public static void main(String[] args) {
        //task1
        int month = 1;
        double accumulation = 0;
        double cashDeposit = 15000;
        double purpose = 2_459_000;
        double percent = cashDeposit * 0.12;
        while (accumulation <= purpose) {
            accumulation = accumulation + cashDeposit;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + accumulation + " рублей.");
            accumulation = accumulation + percent;
            month++;
        }
    }
}