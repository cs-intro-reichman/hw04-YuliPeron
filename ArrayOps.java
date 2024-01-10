public class ArrayOps {
    public static void main(String[] args) {
       
    }
    
    public static int findMissingInt (int [] array) {
        // Write your code here:
        int n = array.length+1;
        int sum = (n *(n+1)) / 2; // the sum of numbers from 0 to n
        int actualSum = 0; // the sum of the array with the missing int
        int missingInt;
        for (int i = 0; i<array.length; i++) {
           actualSum += array[i];
        }
        missingInt = sum - actualSum; // check what is the missing int
        return missingInt;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i<array.length; i++) {
            if(array[i]>largest) {
                secondLargest = largest;
                largest = array[i];
            }
            else if (array[i] > secondLargest && array[i] !=largest ) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
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
