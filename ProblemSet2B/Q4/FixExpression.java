public abstract class FixExpression {


    private String expression;
    private String validChars = "0123456789+-*/";

    // you may encounter issues if this is not declared public
    public FixExpression(String expression){
        this.expression = expression;
    }

    // complete this method
    public boolean isValidString(){
        char[] charArray = this.expression.toCharArray();

        for (int i = 0; i < this.expression.length(); i++){
            if ((charArray[i] == '0') || (charArray[i] == '1') || (charArray[i] == '2') || (charArray[i] == '3') || (charArray[i] == '4') || (charArray[i] == '5') || (charArray[i] == '6') || (charArray[i] == '7') || (charArray[i] == '8') || (charArray[i] == '9')  || (charArray[i] == '+') || (charArray[i] == '-') || (charArray[i] == '*') || (charArray[i] == '/')){
                continue;
            } else{
                return false;
            }
        }
        return true;
    }

    public String getExpression() {
        return expression;
    }

    public String getValidChars() {
        return validChars;
    }

    public abstract int evaluateExpression();

}
