import java.util.Scanner;
public class goodsEntering {
public static int goodsArrayCreating(){
int qtyOfGoods= 0;
String enteredName = "";
Double enteredPrice = 0d;
Scanner name = new Scanner(System.in);
Scanner price = new Scanner(System.in);
        while (!enteredName.equalsIgnoreCase("Завершить")) {
            System.out.print("\nВведите название товара №" + (qtyOfGoods+1) + ": ");
            enteredName = name.nextLine();
            if (!enteredName.equalsIgnoreCase("Завершить")) {
                System.out.print("Введите цену товара: ");
                if (price.hasNextDouble()) {
                    enteredPrice = price.nextDouble();
                    if (enteredPrice > 0) {
                        qtyOfGoods++;
                        Main.goodsArray.add(enteredName);
                        Main.pricesArray.add(enteredPrice);
                        if (!enteredName.equalsIgnoreCase("Завершить")) {
                            System.out.println("Добавлен товар №" + qtyOfGoods + " '" + enteredName + "' " + "за " + String.format("%.2f", enteredPrice) + rubWord.rubWord(enteredPrice));
                        }
                    } else {
                        System.out.println("Цена должна быть >0! Повторите ввод...");
                    }
                } else {
                    System.out.println("Это не похоже на цену! Повторите ввод...");
                    price.next();
                }
            }
        } // stopWhile
   return qtyOfGoods; }

}
