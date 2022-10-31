import java.util.ArrayList;
public class Main {
    static ArrayList<String> goodsArray = new ArrayList<>(); //Массив товаров
    static ArrayList<Double> pricesArray = new ArrayList<>(); //Массив цен
    public static void main(String[] args) {
        int qtyOfGuys, qtyOfGoods;
        int i = 0;
        double sum = 0;
    qtyOfGuys = howManyGuys.howManyGuys();
    qtyOfGoods = goodsEntering.goodsArrayCreating();

        System.out.println("\nДОБАВЛЕННЫЕ ТОВАРЫ: ");
        while (i < qtyOfGoods){
            System.out.println((i+1) + ") " + goodsArray.get(i));
            sum += pricesArray.get(i);
            i++;
            }
        double payment = (double) sum / qtyOfGuys;
        System.out.println("С каждого участника по " + String.format("%.2f", payment) + rubWord.rubWord(payment));
    }

}

