import java.util.ArrayList;

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 11
        int last;
        int length = A.length;

        ArrayList<Integer> l = new ArrayList<Integer>();

        for(int i=0 ; i<length ; i++){
            l.add(A[i]);
        }


        for( int a=0 ; a<K ;a++){
            last = l.get(l.size() -1);

            l.add(0,last);
            l.remove(l.size() -1);
        }

        System.out.println(l);
        return A;
    }

}
