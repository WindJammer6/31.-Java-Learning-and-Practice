//import CustomStack;
//import StackImpl;

public class CheckBalancedBrackets {

    public static void main(String[] args) {

        System.out.println(isOpenBracket('(')); // true
        System.out.println( isOpenBracket('a')); // false
        System.out.println(isCloseBracket(']')); // true
        System.out.println(isCloseBracket('a')); // false
        System.out.println( isMatchBracket('(',')')); // true
        System.out.println( isMatchBracket('a','a')); // false
        System.out.println(isBalancedBrackets("()[]()")); // true
        System.out.println(isBalancedBrackets("([]())")); // true

    }

    public static boolean isBalancedBrackets( String expression ){
        char[] charArray = expression.toCharArray();
        StackImpl<Character> stack = new StackImpl<>();

        for (int i = 0; i < expression.length(); i++){
            if (isOpenBracket(charArray[i]) == true){
                stack.push(charArray[i]);
            } else if(isCloseBracket(charArray[i]) == true){
                char poppedElement = stack.pop();

                if (isMatchBracket(poppedElement, charArray[i]) == true){
                    continue;
                } else{
                    return false;
                }
            }
        }

        if (stack.isEmpty() == true){
            return true;
        } else{
            return false;
        }
    }

    public static boolean isOpenBracket( char c){
        String brackets = "({[";
        char[] charArray = brackets.toCharArray();

        for (int i = 0; i < brackets.length(); i++){
            if (c == charArray[i]){
                return true;
            }
        }
        return false;
    }

    public static boolean isCloseBracket(char c){
        String brackets = ")}]";
        char[] charArray = brackets.toCharArray();

        for (int i = 0; i < brackets.length(); i++){
            if (c == charArray[i]){
                return true;
            }
        }
        return false;
    }

    public static boolean isMatchBracket(char c1, char c2){
        if ((c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}')) {
            return true;
        } else{
            return false;
        }
    }
}

