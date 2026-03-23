//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//Задание №1
    System.out.println("Задание №1");
    for (int i = 1; i <= 10; i += 1) {
        System.out.println("Значение i = " + i);
    }
//Задание №2
    System.out.println("Задание №2");
    for (int q = 10; q >= 1; q -= 1) {
        System.out.println("Значение q = " + q);
    }
//Задание №3
    System.out.println("Задание №3");
    for (int w = 0; w <= 17; w += 1) {
        if (w %2 == 0){
            System.out.println("Значение w = " + w);
        }
    }
//Задание №4
    System.out.println("Задание №4");
    for (int e = 10; e >= -10; e -= 1){
        System.out.println("Значение e = " + e);
    }
//Задание №5
    System.out.println("Задание №5");
    for (int year = 1904; year <= 2096; year += 4) {
        System.out.println(year + " год является високосным");
    }
//Задание №6
    System.out.println("Задание №6");
    for (int r = 7; r <= 98; r += 7) {
        System.out.println(r);
    }
//Задание №7
    System.out.println("Задание №7");
    for (int t = 1; t <= 512; t *= 2) {
        System.out.println(t);
    }
//Задание №8
    System.out.println("Задание №8");
    int selary = 29000;
    for (int month = 0; month <= 12; month += 1) {
        System.out.println("Месяц " + month + " сумма накоплений равна " + (selary * month) + " рублей");
    }
//Задание №9
    System.out.println("Задание №9");
    int selaryBank = 29000;
    int totalSelary = 0;
    for (int month = 0; month <= 12; month += 1) {
       totalSelary = selaryBank * month;
       int percentBank = totalSelary / 100 * month;
       int totalSelaryBank = totalSelary + percentBank;
       System.out.println("Месяц " + month + " сумма накоплений равна " + totalSelaryBank  + " рублей");
    }
//Задание №10
    System.out.println("Задание №10");
    int number = 2;
    for ( int y = 1; y <= 10; y += 1) {
        int result = number * y;
        System.out.println(y + "*" + number + "=" + result);
    }

}
