package abhayMade;

import java.util.ArrayList;
import java.util.LinkedList;

class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x) {
        ArrayList<Integer> head3= new ArrayList<Integer>();
        int count=0;
        for(int i=0;i<head1.size();i++)
        {
            head3.add(i,x-head1.get(i));
        }
        for(int i=0;i<head2.size();i++)
        {
            if(head3.contains(head2.get(i)))
            {
                count++;

            }
        }
        return  count;
    }
}