package ru.skypro;

        public class Main {


                    public static void main(String[] args) {
                        // 1st
                        byte a = 3;
                        System.out.println("byte = " +a);
                        short b = 3333;
                        System.out.println("short = " +b);
                        int c = 333333;
                        System.out.println("int = " +c);
                        long d = 33333333333333333L;
                        System.out.println("long = " +d);
                        float e = 1.5555555f;
                        System.out.println("float = " +e);
                        double f = 1.5555555555;
                        System.out.println("double = " +f);
                        char g = 'g';
                        System.out.println("char = " +g);

                        boolean b2 = true;
                        System.out.println("boolean = " +true);



                        // 2nd
                        float firstBoxerWeight = 78.2f;
                        System.out.println("вес первого боксера " + firstBoxerWeight + " кг");
                        float secondBoxerWeight = 82.7f;
                        System.out.println("вес второго боксера " + secondBoxerWeight + " кг");
                        float totalWeight = firstBoxerWeight + secondBoxerWeight;
                        System.out.println("общий вес бойцов " + totalWeight + " кг");
                        float differentInWeight = secondBoxerWeight - firstBoxerWeight;
                        System.out.println("разница в весе " + differentInWeight + " кг");


                        //3rd
                        byte bananas = 5;
                        int bananasGr = bananas * 80;
                        int bananasWeight = bananasGr;
                        System.out.println("Вес бананов в граммах = " +bananasWeight );

                        int milkVolumeMl = 200;
                        int milkWeightGrPer100Ml = 105;
                        float milkWeightGr = milkWeightGrPer100Ml * (milkVolumeMl / 100);
                        System.out.println("Молоко в граммах = " +milkWeightGr);

                        byte iceCream = 2;
                        byte iceCreamGr = 100;
                        int iceCreamWeight = iceCream * iceCreamGr;
                        System.out.println("Вес молока в граммах = " + iceCreamWeight);

                        byte eggs = 4;
                        byte eggsGr = 70;
                        int eggsWeight = eggs * eggsGr;
                        System.out.println("Вес яиц в граммах = " +eggsWeight);

                        float coctailWeight = eggsWeight + iceCreamWeight + milkWeightGr + bananasWeight;
                        System.out.println("Вес коктеля в граммах = " +coctailWeight);

                        float coctailWeightGr = coctailWeight / 1000f;
                        System.out.println("Вес коктеля в килограммах = " +coctailWeightGr);


                        //4th

                        byte menWeightDifferenceKg = 7;
                        int oneKiloPerGr = 1000;
                        int menWeightDirreneceGr = oneKiloPerGr * menWeightDifferenceKg;
                        int firstMethodWeightLossPerDay = 250;
                        int firstWeightLossMethod = menWeightDirreneceGr / firstMethodWeightLossPerDay;
                        System.out.println("Количество дней похудения, если худеть по 250 грамм в день = " +firstWeightLossMethod);
                        int secondMethodWeightLossPerDay = 500;
                        int secondWeightLossMethod = menWeightDirreneceGr / secondMethodWeightLossPerDay;
                        System.out.println("Количество дней похудения, если худеть по 500 грамм в день = " +secondWeightLossMethod);
                        int averageDaysForWeightLoss = (firstWeightLossMethod + secondWeightLossMethod) / 2;
                        System.out.println("Среднее количество дней для похудения = " +averageDaysForWeightLoss);

                        //5th

                        int mashaWages = 67_760;
                        double mashaNewWagesDifference = 67_760 * 0.1;
                        double mashaWagesNew = mashaWages + mashaNewWagesDifference;
                        double mashaWagesDifferenceOld = mashaNewWagesDifference * 12;
                        int mashaOldWagesPerYear = mashaWages * 12;
                        double mashaNewWagesPerYear = mashaWagesNew * 12;
                        System.out.println("Теперь Маша получает = " + mashaWagesNew + " Годовой доход вырос на = " + (mashaNewWagesPerYear - mashaOldWagesPerYear));

                        int denisWages = 83_690;
                        double denisNewWagesDifference = 83_690 * 0.1;
                        double denisWagesNew = denisWages + denisNewWagesDifference;
                        double denisWagesDifferenceOld = denisNewWagesDifference * 12;
                        int denisOldWagesPerYear = denisWages * 12;
                        double denisNewWagesPerYear = denisWagesNew * 12;
                        System.out.println("Теперь Денис получает = " + denisWagesNew + " Годовой доход вырос на = " + (denisNewWagesPerYear - denisOldWagesPerYear));

                        int krisWages = 76_230;
                        double krisNewWagesDifference = 76_230 * 0.1;
                        double krisWagesNew = krisWages + krisNewWagesDifference;
                        double krisWagesDifferenceOld = krisNewWagesDifference * 12;
                        int krisOldWagesPerYear = krisWages * 12;
                        double krisNewWagesPerYear = krisWagesNew * 12;
                        System.out.println("Теперь Кристина получает = " + krisWagesNew + " Годовой доход вырос на = " + (krisNewWagesPerYear - krisOldWagesPerYear));


                    }
                }
