import java.util.ArrayList;
import java.util.Stack;

public class SunsetViews {
    public static void main(String[] args) {
        int[] buildings={3, 5, 4, 4, 3, 1, 3, 2};
        sunsetViews(buildings,"EAST").forEach(System.out::println);
    }
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        Stack<Integer> candidateBuildings = new Stack<>();
        int idx=0;
        while(idx<buildings.length){
            while (!candidateBuildings.isEmpty()&&buildings[candidateBuildings.peek()]<=buildings[idx]){
                candidateBuildings.pop();
            }
            candidateBuildings.push(idx);
            idx++;
        }

        return new ArrayList<Integer>(candidateBuildings);
    }
}
