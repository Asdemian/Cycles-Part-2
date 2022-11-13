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
        int populationGrowthPerYear = 0;
        for (i = 1; i <= 10; i++) {
            System.out.println("Год " + i + " , численность населения составляет " + countryY);
            populationGrowthPerYear = birthRatePerYear - mortalityPerYear;
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
        //task 2-2
        int cashDeposit2 = 15000;
        int total1 = cashDeposit2;
        for (i = 1; total1 < 12_000_000; i++) {
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " накопления составили " + total1);
            }
            int percent2 = total1 / 100 * 7;
            total1 = total1 + percent2;
        }
        System.out.println("Для накопления 12 миллионов потребуется " + i + " месяцев");
        //task 2-3
        int deposit = 15000;
        int accumulationTime = 9 * 12;
        int totaal = deposit;
        for (i = 1; i <= accumulationTime; i++) {
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " накопления составили " + totaal);
            }
            int perceent = totaal / 100 * 7;
            totaal = totaal + perceent;
        }
        System.out.println("Накопления Василия за 9 лет составят " + totaal);
        //task 2-4
        int fridayTheFirst = 4;
        for (; fridayTheFirst <= 31; fridayTheFirst = fridayTheFirst + 7) {
            System.out.println("Сегодня пятница, " + fridayTheFirst + "-е число. Необходимо подготовить отчет.");
        }
        //task 3-1
        int cometArrival = 79;
        int theLastTwoHundred = 2022 - 200;
        int futureServiceStations = 2022 + 100;
        for (; theLastTwoHundred <= 2022; theLastTwoHundred++) {
            if (theLastTwoHundred % 79 == 0) {
                System.out.println(theLastTwoHundred);
            }
        }
        for (; futureServiceStations >= 2022; futureServiceStations--) {
            if (futureServiceStations % 79 == 0) {
                System.out.println(futureServiceStations);
            }
        }
        //task 3-2
        int o = 2;
        for (int n = 1; n <=10; n++) {
            int r = o * n;
            System.out.println(o+ "*" +n+ "=" +r);
        }
    }
}