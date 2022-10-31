public class rubWord {

    public static String rubWord(double payInput) {
        String payOutput;
        int payInputNorm = (int) payInput;
        String payString = Integer.toString(payInputNorm);
        char endOfPayment = payString.charAt(payString.length() - 1);
        switch (Character.toString(endOfPayment)) {
            case "1": payOutput = " рубль."; break;
            case "2":
            case "3":
            case "4":
                payOutput = " рубля."; break;
            default: payOutput = " рублей."; break;
        }
        return payOutput;
    }
}
