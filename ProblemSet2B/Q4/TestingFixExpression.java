public class TestingFixExpression {

    public static void main(String[] args) {

        FixExpression fixExpression1 = new TrivialImplExpression("1+2");
        System.out.println(fixExpression1.isValidString()); //true

        FixExpression fixExpression2 = new TrivialImplExpression("abc");
        System.out.println(fixExpression2.isValidString()); //false

        FixExpression fixExpression3 = new TrivialImplExpression("1+2*3-4/5");
        System.out.println(fixExpression3.isValidString()); //true

    }
}

class TrivialImplExpression extends FixExpression{

    public TrivialImplExpression(String string){
        super(string);
    }
    @Override
    public int evaluateExpression() {
//        char[] charArray = string.toChatArray();
//        int total = charArray[0];
//
//        for (int i = 1; i < getExpression().length()-1; i+=2){
//            int number = charArray[i+1];
//
//            if (charArray[i] == '+'){
//                total = total + number;
//            } else if (charArray[i] == '/'){
//                total = total / number;
//            } else if (charArray[i] == '-'){
//                total = total - number;
//            } else if (charArray[i] == '*'){
//                total = total * number;
//            } else{
//                System.out.println("Hi");
//            }
//        }
//        return total;
        return 0;
    }
}
