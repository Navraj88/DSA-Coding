import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comp2 {
    public static void main(String[] args) {
        // Create a list of list of strings
        List<List<String>> st = new ArrayList<>();

        // Sample input: adding three lists of [name, date]
        List<String> group1 = new ArrayList<>();
        group1.add("Alice");
        group1.add("2023-07-15");

        List<String> group2 = new ArrayList<>();
        group2.add("Charlie");
        group2.add("2022-11-03");

        List<String> group3 = new ArrayList<>();
        group3.add("Eve");
        group3.add("2024-04-27");

        // Add each group to the main list
        st.add(group1);
        st.add(group2);
        st.add(group3);

        Comparator<List<String>>cp =new Comparator<List<String>>() {
            @Override
            public int compare(List<String>a,List<String>b){
                if(!(a.get(1).equals(b.get(1)))){
                    String a1[]=a.get(1).split("-");
                    String b2[]=b.get(1).split("-");
                    if(!(a1[0].equals(b2[0]))){
                        return 1;
                    }

                }
                return -1;
            }
        };

        Collections.sort(st,cp);

        System.out.println(st);
    }
}