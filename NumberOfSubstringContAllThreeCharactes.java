public class NumberOfSubstringContAllThreeCharactes {
    class Solution {
    public int numberOfSubstrings(String s) {
        int a=0,b=0,c=0,n=s.length();
        int count=0,l=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a'){
                a++;
            }
            else if(s.charAt(i)=='b'){
                b++;
            }
            else{
                c++;
            }

            while(a>0 && b>0 && c>0){
                count+=n-i;
                if(s.charAt(l)=='a'){
                    a--;
                }
                else if(s.charAt(l)=='b'){
                    b--;
                }
                else{
                    c--;
                }
                l++;
            }
        }
        return count;
    }
}
}
