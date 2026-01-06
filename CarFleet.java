import java.util.Arrays;
import java.util.Stack;

public class CarFleet {
    public int carFleets(int target, int[] position, int[] speed) {
        int n=speed.length;


        //Created a 2d array to store the pos and speed
        int [][]cars = new int[n][2];
        for(int i=0;i<n;i++){
            cars[i][0]=position[i];
            cars[i][1]=speed[i];
        }

        //Sorted the cars based on position in descending order 
        Arrays.sort(cars, (a,b)-> Integer.compare(b[0],a[0]));

        Stack<Double>st = new Stack<>();
        for(int i=0;i<n;i++){
            int pos=cars[i][0];
            int sped= cars[i][1];
            //timeTaken is the time that the car will take to reach target
            double timeTaken=(double)(target-pos)/sped;
            //here We are checking if the car can reach in faster time 
            //than the car ahead of it
            // if it can reach that means it can go together as fleet
            if(st.isEmpty() || timeTaken>st.peek()){
                st.push(timeTaken);
            }
            //timeTaken of current car if smaller then time taken of car ahead that 
            //means it can join the car ahead as fleet
        }
        return st.size();

    }
}
