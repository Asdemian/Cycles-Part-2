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
        //task2
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(" ");
        for (int m = 10; m >= 1; m--) {
            System.out.print(m + " ");
        }
        //task3
        System.out.println(" ");
        int countryY = 12_000_000;
        int birthRatePerYear = countryY / 1000 * 17;
        int mortalityPerYear = countryY / 1000 * 8;
        int populationGrowthPerYear = birthRatePerYear - mortalityPerYear;
        for (i = 1; i <= 10; i++) {
            System.out.println("Год " + i + " , численность населения составляет " + countryY);
            countryY = countryY + populationGrowthPerYear;
        }
        //task 2-1
        int cashDeposit1 = 15000;
        int total = cashDeposit1;
        for (i = 1; total < 12_000_000; i++) {
            System.out.println("Месяц " + i + " накопления составили " + total);
            int percent1 = total / 100 * 7;
            total = total + percent1;
        }
        System.out.println("Для накопления 12 миллионов потребуется " + i + " месяцев");
    }
}