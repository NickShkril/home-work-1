package ru.skypro;

public class Main {
// 1st homework
    public static void main(String[] args) {
        // 1st excerises
        byte a = 3;
        System.out.println("byte = " + a);
        short b = 3333;
        System.out.println("short = " + b);
        int c = 333333;
        System.out.println("int = " + c);
        long d = 33333333333333333L;
        System.out.println("long = " + d);
        float e = 1.5555555f;
        System.out.println("float = " + e);
        double f = 1.5555555555;
        System.out.println("double = " + f);
        char g = 'g';
        System.out.println("char = " + g);
        boolean b2 = true;
        System.out.println("boolean = " + true);


        // 2nd excerises
        float firstBoxerWeight = 78.2f;
        System.out.println("вес первого боксера " + firstBoxerWeight + " кг");
        float secondBoxerWeight = 82.7f;
        System.out.println("вес второго боксера " + secondBoxerWeight + " кг");
        float totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("общий вес бойцов " + totalWeight + " кг");
        float differenceInWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("разница в весе " + differenceInWeight + " кг");


        //3rd excerises
        byte bananasAmount = 5;
        int bananasGr = bananasAmount * 80;
        int bananasWeight = bananasGr;
        System.out.println("Вес бананов в граммах = " + bananasWeight);

        int milkVolumeMl = 200;
        int milkWeightGrPer100Ml = 105;
        float milkWeightGr = milkWeightGrPer100Ml * (milkVolumeMl / 100);
        System.out.println("Молоко в граммах = " + milkWeightGr);

        byte iceCreamAmount = 2;
        byte iceCreamGr = 100;
        int iceCreamWeight = iceCreamAmount * iceCreamGr;
        System.out.println("Вес молока в граммах = " + iceCreamWeight);

        byte eggsAmount = 4;
        byte eggsGr = 70;
        int eggsWeight = eggsAmount * eggsGr;
        System.out.println("Вес яиц в граммах = " + eggsWeight);

        float coctailWeightInGr = eggsWeight + iceCreamWeight + milkWeightGr + bananasWeight;
        System.out.println("Вес коктеля в граммах = " + coctailWeightInGr);

        float coctailWeightInKg = coctailWeightInGr / 1000f;
        System.out.println("Вес коктеля в килограммах = " + coctailWeightInKg);


        //4th excerises

        byte menWeightTarget = 7;
        int oneKiloPerGr = 1000;
        int menWeightTargetInGr = oneKiloPerGr * menWeightTarget;
        int firstWayWeightLossPerDay = 250;
        int firstWeightLossMethod = menWeightTargetInGr / firstWayWeightLossPerDay;
        System.out.println("Количество дней похудения, если худеть по 250 грамм в день = " + firstWeightLossMethod);
        int secondWayWeightLossPerDay = 500;
        int secondWeightLossMethod = menWeightTargetInGr / secondWayWeightLossPerDay;
        System.out.println("Количество дней похудения, если худеть по 500 грамм в день = " + secondWeightLossMethod);
        int averageDaysForWeightLoss = (firstWeightLossMethod + secondWeightLossMethod) / 2;
        System.out.println("Среднее количество дней для похудения = " + averageDaysForWeightLoss);

        //5th excerises

        int mashaWages = 67_760;
        double mashaNewWagesDifference = 67_760 * 0.1;
        double mashaWagesNew = mashaWages + mashaNewWagesDifference;
        double mashaWagesDifferenceOld = mashaNewWagesDifference * 12;
        int mashaOldWagesPerYear = mashaWages * 12;
        double mashaNewWagesPerYear = mashaWagesNew * 12;
        double totalWagesDifferenceMasha = mashaNewWagesPerYear - mashaOldWagesPerYear;
        System.out.println("Теперь Маша получает = " + mashaWagesNew + " Годовой доход вырос на = " + totalWagesDifferenceMasha);

        int denisWages = 83_690;
        double denisNewWagesDifference = 83_690 * 0.1;
        double denisWagesNew = denisWages + denisNewWagesDifference;
        double denisWagesDifferenceOld = denisNewWagesDifference * 12;
        int denisOldWagesPerYear = denisWages * 12;
        double denisNewWagesPerYear = denisWagesNew * 12;
        double totalWagesDifferenceDenis = denisNewWagesPerYear - denisOldWagesPerYear;
        System.out.println("Теперь Денис получает = " + denisWagesNew + " Годовой доход вырос на = " + totalWagesDifferenceDenis);

        int krisWages = 76_230;
        double krisNewWagesDifference = 76_230 * 0.1;
        double krisWagesNew = krisWages + krisNewWagesDifference;
        double krisWagesDifferenceOld = krisNewWagesDifference * 12;
        int krisOldWagesPerYear = krisWages * 12;
        double krisNewWagesPerYear = krisWagesNew * 12;
        double totalWagesDifferenceKris = krisNewWagesPerYear - krisOldWagesPerYear;
        System.out.println("Теперь Кристина получает = " + krisWagesNew + " Годовой доход вырос на = " + totalWagesDifferenceKris);
    }
}
