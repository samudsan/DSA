package dsa2_LinearSearch;

public class Array2_SearchingInStringArray1 {
    public static void main(String[] args) {

        String arr ="sanlkjsdf";
        char target = 'n';
        System.out.println("Found Element: "+isElementFound(arr, target));
        System.out.println("Found Element: "+isElementFoundForEach(arr, target));
        System.out.println("Found Element at index: "+getElementIndex(arr, target));
        System.out.println("Found Element found in range: "+isElementFoundInRange(arr, 1,4,target));

    }

    static boolean isElementFound(String arr, char target){
        for (int i = 0; i < arr.length(); i++) {
            if(target == arr.charAt(i))
                return true;
        }
        return false;
    }

    static boolean isElementFoundForEach(String arr, char target){
        for(char element : arr.toCharArray()){
            if(element == target)
                return true;
        }
        return false;
    }
    static int getElementIndex(String arr, int target){
        for (int i = 0; i < arr.length(); i++) {
            if(target == arr.charAt(i))
                return i;
        }
        return -1;
    }

    static boolean isElementFoundInRange(String arr, int startIndex, int endIndex, int target){
        while(startIndex < endIndex){
            if(arr.charAt(startIndex) == target)
                return true;
            startIndex++;
        }
        return false;
    }
}
