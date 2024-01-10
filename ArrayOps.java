public class ArrayOps {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(secondMaxValue(arr));
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
        for (int i = 0; i<array.length;i++) {
           if(!contains(array,i)) {
               return i;
           }
        }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:

        int [] newArray = new int [array.length];

        for(int i = 0; i<array.length; i++) {
            newArray[i] = array[i];
        }
        int max = newArray[0];
        int maxIndex = 0;
        for(int i = 0; i<newArray.length; i++) {
            if(newArray[i]>=max) {
                max = array[i];
                maxIndex = i;
            }
        }
        int temp = newArray[newArray.length-1];
        newArray[newArray.length-1] = max;
        newArray[maxIndex] = temp;

        int secondMax = 0;
        int newArrayMax = newArray[0];
        for (int i = 0; i<newArray.length-1; i++) {
            if(newArray[i]>=newArrayMax) {
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
                else {
                    isExist = false;
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
        return false;
    }

}
