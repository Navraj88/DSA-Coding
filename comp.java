import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comp {
    public static void main(String[] args){ 
        List<String> st=new ArrayList<>();
        st.add("Hello");
        st.add("temp");
        st.add("Heullo");
        st.add("tennnmp");
        st.add("Hehhhllo");
        st.add("temhhhp");
        st.add("Hennnnsllo");
        st.add("tehhmp");

        Comparator<String> cp =new Comparator<String>() {
            @Override
            public int compare(String a,String b){
                if(a.length()<=b.length()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        Collections.sort(st,cp);

        System.out.println(st);
        
    }
}
