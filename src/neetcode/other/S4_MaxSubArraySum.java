package neetcode.other;

public class S4_MaxSubArraySum {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int soFarMax=0, max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            soFarMax = soFarMax + nums[i];
            if(max < soFarMax)
                max = soFarMax;
            if(soFarMax < 0)
                soFarMax =0;
        }
        System.out.println(max);
    }
}
