import java.util.ArrayList;
public class Main {
    static ArrayList<String> goodsArray = new ArrayList<>(); //Массив товаров
    static ArrayList<Double> pricesArray = new ArrayList<>(); //Массив цен
    public static void main(String[] args) {
        int qtyOfGuys;
        int qtyOfGoods;
        Boolean flag;

        // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости
        // рабочие строки, не удалять qtyOfGuys = howManyGuys.howManyGuys();
        // рабочие строки, не удалять System.out.println(qtyOfGuys);
        //goodsAddingEngine.goodsAddingEngine();

        //qtyOfGoods = goodsArray.size();

        qtyOfGoods = goodsEntering.goodsArrayCreating();

                //goodsAddingEngine.goodsRequests();
        System.out.println("\nКол-во введённых товаров: " + qtyOfGoods);
        System.out.println(goodsArray.get(0));
        System.out.println(pricesArray.get(0));



    }

}

