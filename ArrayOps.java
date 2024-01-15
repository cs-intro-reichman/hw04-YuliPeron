public class ArrayOps {
    public static void main(String[] args) {
        int [] arr = {1,3,2};
        int [] arr1 = {8,2,7,7,3};
        System.out.println(isSorted(arr));
    }
    public static boolean contains(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false ;
    }
    public static int findMissingInt (int [] array) {
        // Write your code here:
        if(array.length == 1) {
            return 1;
        }
        for (int i = 0; i<array.length;i++) {
           if(!contains(array,i)) {
               return i;
           }
        }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:

        int [] newArray = new int [array.length]; //set a new array

        for(int i = 0; i<array.length; i++) { // put the original array values in the new array
            newArray[i] = array[i];
        }

        int max = newArray[0];
        int maxIndex = 0;
        for(int i = 0; i<newArray.length; i++) { //going through the new array to find the maximum value
            if(newArray[i]>=max) {
                max = newArray[i];
                maxIndex = i;
            }
        }

        if(maxIndex != (newArray.length-1)) { // if the maximum value is not in the last location
            int temp = newArray[newArray.length-1];
            newArray[newArray.length-1] = max;// put the maximum value in the last place of the array
            newArray[maxIndex] = temp; // put the last index where the maximum value was
        }

        int secondMax = newArray[0];
        for (int i = 0; i<newArray.length-1; i++) {
            if(newArray[i]>=secondMax) {
                secondMax = newArray[i];
            }
        }

        return secondMax;
    }


    public static boolean contains(int[] arr, int value, int index) {
        for (int i = 0; i < index; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false ;
    }
    public static int countUnique(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = contains(arr, arr[i], i) ? count : count + 1;
        }
        return count;
    }

    public static int [] set (int[] arr) {
        int [] res = new int [countUnique(arr)];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!contains(arr, arr[i], i)){
                res[index++] = arr[i];
            }
        }
        return res;
    }
    public static int print (int[] arr) {

        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i]+ " ");
        }
        System.out.println();
        return -1;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        int [] shortArray1 = set(array1);
        int [] shortArray2 = set(array2);

        if(shortArray1.length != shortArray2.length) {
            return  false;
        }
        boolean isExist = false;
        for(int i = 0; i<shortArray1.length; i++) {
            for (int j = 0; j<shortArray2.length; j++) {
                if(shortArray1[i] == shortArray2[j]){
                    isExist = true;
                }
            }
            if (!isExist) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        boolean sortedArrayMinToMax = false;
        boolean sortedArrayMaxToMin = false;

            for(int i = array.length-1; i> 0; i--) {
                if(array[i] <= array[i-1]){
                    sortedArrayMaxToMin = true;
                }
                else {
                    break;
                }
            }
            for(int i = 1; i<array.length; i++) {
                if(array[i] >= array[i-1]){
                    sortedArrayMinToMax = true;
                }
                else {
                    break;
                }
            }
            if (sortedArrayMinToMax || sortedArrayMaxToMin){
                return true;
            }
            return false;
    }

}
