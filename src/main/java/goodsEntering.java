import java.util.Scanner;
public class goodsEntering {

public static int goodsArrayCreating(){
int qtyOfGoods= 0;
String enteredName = "";
Double enteredPrice = 0d;
Boolean f1, f2;
Boolean stopWhile = false;

    while (!stopWhile) {
        Scanner name = new Scanner(System.in);
        Scanner price = new Scanner(System.in);
        while (!enteredName.equalsIgnoreCase("Завершить")) {
            System.out.println("Введите название товара №" + (qtyOfGoods+1) + ":");
            enteredName = name.nextLine();
            if (!enteredName.equalsIgnoreCase("Завершить")) {
                //========= Начало блока для запроса и проверок по ценам товаров
                System.out.println("Введите цену товара:");
                if (price.hasNextDouble()) {
                    enteredPrice = price.nextDouble();
                    //System.out.println("тип данных введённой цены: " + enteredPrice.getClass() + enteredPrice);
                    if (enteredPrice > 0) {
                        qtyOfGoods++;
                        Main.goodsArray.add(enteredName);
                        Main.pricesArray.add(enteredPrice);
                        if (!enteredName.equalsIgnoreCase("Завершить")) {
                            System.out.println("Добавлен товар №" + qtyOfGoods + " '" + enteredName + "' " + " за " + String.format("%.2f", enteredPrice));
                        }
                    } else {
                        System.out.println("Цена должна быть >0! Повторите ввод...");
                        //break;
                    }
                } else {
                    System.out.println("Это не похоже на цену! Повторите ввод...");
                    //break;
                }


            }
        stopWhile = true;
        } // stopWhile по вводу цен
    } // stopWhile по вводу названий
    return qtyOfGoods; } // Завершение метода ввода товаров и цен

}
