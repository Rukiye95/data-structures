import java.util.ArrayList;

public class BigOExamplesSet1 {
    public static void main(String[] args) {
        int n=10000;
        int m=100;
        System.out.println("Input size n is = "+ n);
        // Task 1 Single Loop...................
        long startTime=System.currentTimeMillis();
        int numberOfOperations=0;
        for(int i=0;i<n;i++){
            numberOfOperations++;
        } // n + n^2 + n^3 =23153 = 23142
        long endTime=System.currentTimeMillis();
        System.out.println("Number of Operations in Task #1 O(n)= "+ numberOfOperations + " in "+ (endTime-startTime));
        // Task 1 End...................
        // ......................................................................................................
        // Task 2 Nested Loops...................
        startTime=System.currentTimeMillis();
        numberOfOperations=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                numberOfOperations++;
        }
        endTime=System.currentTimeMillis();
        System.out.println("Number of Operations in Task #2 O(n^2)= "+ numberOfOperations + " in "+ (endTime-startTime));
        // Task 2 End...................
// ......................................................................................................
      // Task 3 Three Nested Loops...................
        startTime=System.currentTimeMillis();
        long numberOfOperations2= (long) 0.0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++)
                    numberOfOperations2++;
            }
        }
        endTime=System.currentTimeMillis();
        System.out.println("Number of Operations in Task #3 O(n^3) = "+ numberOfOperations2 + " in "+ (endTime-startTime));
        // Task 3 End...................
// ......................................................................................................
       // Task 4 N and M Nested Loops...................
        startTime=System.currentTimeMillis();
        numberOfOperations=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                numberOfOperations++;
            }
        }
        ArrayList<Integer> a=new ArrayList<>();
        endTime=System.currentTimeMillis();
        System.out.println("Number of Operations in Task #4 O(nxm)= "+ numberOfOperations + " in "+ (endTime-startTime));
        // Task 4 End...................

        // Task 5 Logarithmic Complexity...................
       startTime=System.currentTimeMillis();
       numberOfOperations=0;
        for(int i=1;i<=n;i=i*2){
            numberOfOperations++;
        }
        endTime=System.currentTimeMillis();
        System.out.println("Number of Operations in Task #5 O(log n)= "+ numberOfOperations + " in "+ (endTime-startTime));
        // Task 5 End...................*/
    }
}
