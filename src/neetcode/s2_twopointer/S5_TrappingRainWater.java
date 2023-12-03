package neetcode.s2_twopointer;

public class S5_TrappingRainWater {
    public static void main(String[] args) {
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(getTrappedWater(heights));
    }

    private static int getTrappedWater(int[] heights){

        int[] lMaxHeights = new int[heights.length];
        int[] rMaxHeights = new int[heights.length];

        int lMax= heights[0];
        int rMax = heights[heights.length-1];

        //filling lMaxHeights
        for (int i=0; i<heights.length; i++) {
            if(lMax < heights[i]){
                lMax = heights[i];
            }
            lMaxHeights[i] = lMax;
        }

        //filling rMaxHeights
        for (int i=heights.length-1; i>=0; i--) {
            if(rMax < heights[i]){
                rMax = heights[i];
            }
            rMaxHeights[i] = rMax;
        }

        // to know trapped water of a position we actually
        // need to get min of left most height and right most height of that position - height of that position
        int totalTrapped = 0;
        for (int i=0; i<heights.length; i++) {
            totalTrapped += Math.min(rMaxHeights[i],lMaxHeights[i]) - heights[i];
        }
        return totalTrapped;
    }
}
