package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
     // задание 1
        byte b = 1;
        short sh = 1;
        int in= 1;
        long l=100L;
        float f=1.00f;
        double d=1.000d;



        // Задание 2
        System.out.println(" ЗАДАНИЕ №2");

        float boxer1Weight = 78.2f;
        float boxer2Weight = 82.7f;
        float sumWeightBoxer = boxer1Weight + boxer2Weight;
        System.out.println("общий вес боксеров " + sumWeightBoxer + "кг");
        float  difWeightBoxer = boxer2Weight % boxer1Weight;
        System.out.println( " Разница между боксерами составляет " + difWeightBoxer + "Кг ");


        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");


        System.out.println("Заданеие №3");

        float milk = 2 * 105;
        float bananas = 5*80;
        float iceCream = 2 * 100;
        float eggs = 4*70;

        float ProductGramm = (milk + bananas +iceCream +eggs);
        float ProductKg = ProductGramm / 1000;
        System.out.println("Вес завтрака составляет " + ProductGramm + "грамм");
        System.out.println("общий вес завтра" + ProductKg + "кг");



        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");


        System.out.println("Заданеие №4");

        float a250 = 0.250f;
        float a500 = 0.500f;
        int day = 7;
        float dayPoxydenie =day/a250;
        System.out.println(" Дней на похуйдени - " + dayPoxydenie);
        dayPoxydenie = day/a500;
        System.out.println(" дней на похудение - " + dayPoxydenie);

        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");

        System.out.println(" Задание №5 ");

        float MariaMoney = 67760;
        float DenisMoney = 83690;
        float KrisMoney = 76230;

        float MariaNewMoney = MariaMoney*1.10f;
        float MariaYearMoney =MariaNewMoney*12 - MariaMoney*12;
        System.out.println("Маша теперь получает " + MariaNewMoney + "руб. Ее годовой доход вырос на " + MariaYearMoney + "руб");

        float DenisNewMoney = DenisMoney*1.10f;
        float DenisYearMoney =DenisNewMoney*12 - DenisMoney*12;
        System.out.println("Маша теперь получает " + DenisNewMoney + "руб. Ее годовой доход вырос на " + DenisYearMoney + "руб");

        float KrisNewMoney = KrisMoney*1.10f;
        float KrisYearMoney =KrisNewMoney*12 - KrisMoney*12;
        System.out.println("Маша теперь получает " + KrisNewMoney + "руб. Ее годовой доход вырос на " + KrisYearMoney  + "руб");
    }
}
