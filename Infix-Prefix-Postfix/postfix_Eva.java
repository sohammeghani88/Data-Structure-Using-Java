import java.util.*;
public class postfix_Eva {
    public static void main(String[] args){
        Stack<Integer> stack= new Stack<>();
        String str = "5+89";
        int ans=-1;
        for(int i=0;i<str.length();i++){
            char temp = str.charAt(i);
            if(Character.isLetterOrDigit(temp)){
                stack.push(Character.getNumericValue(temp));
            }else{
                if(stack.size()==1){
                    System.out.println("Error");
                    return;
                }
                int v2 = stack.pop();
                int v1 = stack.pop();
                if(temp=='+')  ans = (v1+v2);
                if(temp=='-')  ans = (v1-v2);
                if(temp=='*')  ans = (v1*v2);
                if(temp=='/')  ans = (v1/v2);
                stack.push(ans);
            }
        }
        if(stack.size()==1) System.out.println(stack.pop());
    }
}