package String;

import java.util.Stack;

public class Validparanthesis {
    public  static boolean main(String s){
        Stack<Character> st=new Stack<>();
        for (char c:s.toCharArray()){
            if(c=='(') {
                st.push(')');
            }
                else  if(c=='{'){
                    st.push('}');
                } else if (c=='[') {
                    st.push(']');

                }else if(st.isEmpty() || st.pop()!=c){
                    return false;

                }
            }
        return  st.isEmpty();
        }



    public static void main(String[] args) {
       String s  = "()[]{}";
       System.out.println(Validparanthesis.main(s));
    }
}
