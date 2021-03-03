import java.util.Stack;

public class MergeStack {
    //括号匹配
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                char topChar = stack.pop();
                if(topChar=='('&&c!=')'){
                    return false;
                }
                if(topChar=='['&&c!=']'){
                    return false;
                }
                if(topChar=='{'&&c!='}'){
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
//        System.out.println((new MergeStack()).isValid("()"));
        System.out.println((new MergeStack()).isValid("()[]}{"));
//        System.out.println((new MergeStack()).isValid("({[]})"));
//        System.out.println((new MergeStack()).isValid("({)}[]"));
//        Stack<Character> stack = new Stack<>();
//        boolean s= stack.isEmpty();
//        System.out.println(s);

    }
}
