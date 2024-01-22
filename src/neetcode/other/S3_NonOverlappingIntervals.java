package neetcode.other;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

//    https://leetcode.com/problems/non-overlapping-intervals/description/
public class S3_NonOverlappingIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
//        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(intervals, Comparator.comparingInt((int[] interval) -> interval[0]).thenComparingInt(interval -> -interval[1]));
        for (int[] interval : intervals){
            System.out.println(Arrays.toString(interval));
        }
        System.out.println(getNonOverlappingIntervals(intervals));
    }

    public static int getNonOverlappingIntervals(int[][] intervals){
        int count =0;
        LinkedList<int[]> list = new LinkedList<>();
        for (int[] interval : intervals){
            if(list.isEmpty() || interval[0] < list.getLast()[1]) {
                list.add(interval);
            }
            else
                count++;
        }
        return count;

    }
}
