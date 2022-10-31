import java.util.ArrayList;
import java.util.Scanner;
public class goodsAddingEngine {

   // static goodsClass enteredGood;
    static int qty;
    static String name;
    static double price;
    //public goodsCls(String name, double price) {
    //    this.name = name;
    //    this.price = price;
    //}


    public static void main(String[] args) {
        //ArrayList<String> enteredGoods = new ArrayList<>(); //Массив товаров
        //ArrayList<Double> enteredPrices = new ArrayList<>(); //Массив цен
goodsClass enteredGood = new goodsClass("", 0);
    } // конец тела main

    public static void goodsAddingEngine() { //запрос списка товаров и цен
            boolean flag = false;
        String enteredName = "";
        double enteredPrice = 0;

        while (!flag) {

            Scanner name = new Scanner(System.in);
            Scanner price = new Scanner(System.in);
            System.out.println("Введите название товара:");
            enteredName = "";
            enteredName = name.nextLine();

            if (!enteredName.equalsIgnoreCase("Завершить")) {

                System.out.println("Введите цену товара:");
                if (price.hasNextDouble()) {
                    enteredPrice = price.nextDouble();
                    //price.close();
                    if (enteredPrice > 0) {
                        //enteredGood.name = enteredName;
                        //enteredGood.price = enteredPrice;
                        qty++;
                        Main.goodsArray.add(enteredName);
                        Main.pricesArray.add(enteredPrice);
                        name.close();
                        //System.out.println("Успешно добавлен товар: " + enteredGood.name + " за " + enteredGood.price);
                    } else {
                        System.out.println("Сумма должна быть больше нуля, повторите ввод:");
                    }
                } else {
                    System.out.println("Некорректный ввод, повторите, указав цену >0:");
                    name.close();
                    //price.close();
                }
            } //Конец IF по "Завершить"
            else {
                System.out.println("Ввод товаров завершён");
                flag = true; }
        } // Конец WHILE
        //return flag;
    } // Конец метода запросов и формирования массивов
}
