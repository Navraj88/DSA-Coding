import java.util.Stack;

public class ReversePolishExpan {
    private void addOps(Stack<String>st){
        int adda=Integer.parseInt(st.pop());
        int addb=Integer.parseInt(st.pop());
        int tadd=adda+addb;
        st.push(Integer.toString(tadd));
    }
    private void multOps(Stack<String>st){
        int multa=Integer.parseInt(st.pop());
        int multb=Integer.parseInt(st.pop());
        int tmult=multa*multb;
        st.push(Integer.toString(tmult));
    }
    private void divOps(Stack<String>st){
        int diva=Integer.parseInt(st.pop());
        int divb=Integer.parseInt(st.pop());
        int tdiv=divb/diva;
        st.push(Integer.toString(tdiv));
    }
    private void subOps(Stack<String>st){
        int suba=Integer.parseInt(st.pop());
        int subb=Integer.parseInt(st.pop());
        int tsub = subb-suba;
        st.push(Integer.toString(tsub));
    }
    public int evalRPN(String[] tokens) {
        Stack<String>st= new Stack<>();

        for(int i=0;i<tokens.length;i++){
            String temp=tokens[i];
            switch (temp){
                case "+":
                    addOps(st);
                    break;
                
                case "-":
                    subOps(st);
                    break;

                case "*":
                    multOps(st);
                    break;

                case "/":
                    divOps(st);
                    break;

                default:
                    st.push(temp);
            }
        }
        return Integer.parseInt(st.pop());
    }
}
