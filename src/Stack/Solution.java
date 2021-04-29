package Stack;

import javax.swing.table.TableRowSorter;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='['||c=='{'||c=='【'){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                char res = stack.pop();
                if(c==']'&&res!='['){
                    return false;
                }
                if(c=='}'&&res!='{'){
                    return false;
                }
                if (c=='】'&&res!='【'){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "【】{}";
        Solution solution = new Solution();
        System.out.println(solution.isValid(s));
    }
}
