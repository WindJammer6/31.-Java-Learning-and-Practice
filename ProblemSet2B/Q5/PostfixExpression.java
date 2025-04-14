

public class PostfixExpression extends FixExpression {


    public PostfixExpression(String expression){
        super(expression);
    }

    @Override
    public int evaluateExpression(){
        StackImpl<Integer> stack = new StackImpl<>();
        char[] charArray = getExpression().toCharArray();

        for (int i = 0; i < charArray.length; i++){
            if (isOperand(charArray[i]) == true){
                char numberCharacter = charArray[i];
                int numberInteger = Integer.parseInt(String.valueOf(numberCharacter));
                stack.push(numberInteger);
            } else{
                int poppedP1 = stack.pop();
                int poppedP2 = stack.pop();
                // System.out.println(String.format("%d, %d", poppedP1, poppedP2));
                int p3 = getValue(poppedP2, poppedP1, charArray[i]);
                stack.push(p3);
            }
        }

        int result = stack.pop();
        return result;
    }

    public boolean isOperator(char c){
        if ((c == '+') || (c == '*') || (c == '/') || (c == '-')) {
            return true;
        } else{
            return false;
        }
    }

    public boolean isOperand(char c){
        if ((c == '0') || (c == '1') || (c == '2') || (c == '3') || (c == '4') || (c == '5') || (c == '6') || (c == '7') || (c == '8') || (c == '9')){
            return true;
        } else{
            return false;
        }
    }

    public int getValue(int p1, int p2, char c){

        if (c == '+'){
            return p1 + p2;
        } else if (c == '/'){
            return p1 / p2;
        } else if (c == '-'){
            return p1 - p2;
        } else if (c == '*'){
            return p1 * p2;
        } else{
            return -100000;
        }
    }
}
