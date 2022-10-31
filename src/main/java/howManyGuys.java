import java.util.Scanner;
public class howManyGuys {
    static int qtyOfGuys;
    public static void main(String[] args) {

        qtyOfGuys = howManyGuys(); //проверяем и определяем кол-во человек
    }
    public static int howManyGuys() {
        boolean flag = false;
        System.out.print("На какое кол-во человек разделить счёт? ");
        while (!flag) {
            Scanner userInput = new Scanner(System.in);
            if (userInput.hasNextInt()) {
                qtyOfGuys = userInput.nextInt();
                if (qtyOfGuys > 1) {
                    flag = true;
                    break;
                } else {
                    System.out.println("Кол-во человек должно быть больше 1, повторите ввод:"); }
            } else {
                System.out.println("Некорректный ввод, укажите кол-во человек >1:"); }
        }
        return qtyOfGuys;
    }
}