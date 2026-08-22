import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        HashMap<Character ,Character> pairs=new HashMap<>();
        pairs.put(')','(');
        pairs.put(']','[');
        pairs.put('}','{');

        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);

            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }else{
                if(stack.isEmpty() || stack.peek()!=pairs.get(c)){
                    return false;
                }
                stack.pop();

            }
        }
        return stack.isEmpty();
        
    }
}