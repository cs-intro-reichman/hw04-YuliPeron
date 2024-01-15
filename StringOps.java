public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String str = "   Intro to coMPUter   sCIEncE";
        System.out.println(camelCase(str));
    }

    public static String capVowelsLowRest (String string) {
        // Write your code here:
        String newString = "";
        for (int i =0; i<string.length(); i++)
        {
            if (string.charAt(i) >= 'A' && string.charAt(i)<= 'Z')
            {
                if((string.charAt(i)!= 'A')&&(string.charAt(i)!= 'E')&&(string.charAt(i)!= 'I')&&(string.charAt(i)!= 'O')&&(string.charAt(i)!= 'U')) {
                    newString += (char) (string.charAt(i) + 32);
                }
                else {
                    newString += string.charAt(i);
                }
            }
            else{
                if((string.charAt(i)== 'a')||(string.charAt(i)== 'e')||(string.charAt(i)== 'i')||(string.charAt(i)== 'o')||(string.charAt(i)== 'u')) {
                    newString += (char) (string.charAt(i) - 32);
                }
                else {
                    newString += string.charAt(i);
                }
            }
        }
        return newString;
    }

    public static String lowerCase(String s) {
        // Replace the following statement with your code
        String newString = "";
        for (int i =0; i<s.length(); i++)
        {
            if (s.charAt(i) >= 'A' && s.charAt(i)<= 'Z')
            {
                newString+=(char)(s.charAt(i)+32);
            }
            else{
                newString += s.charAt(i);
            }

        }
        return newString;
    }

    public static String camelCase (String string) {
        // Write your code here:
        String newString = "";
        String temp = lowerCase(string);
        int tempIndex = 0;
        if(temp.charAt(0) != 32) {
            newString += temp.charAt(0);
        }
        else {
            while (temp.charAt(tempIndex) == 32) {
                newString = newString;
                tempIndex ++;
            }
            newString += temp.charAt(tempIndex);
        }
        for (int i =tempIndex+1 ; i<temp.length(); i++) {
            if ((temp.charAt(i) == 32 ) && (temp.charAt(i-1) == 32 )) {
                newString = newString;
            }

            else if ((temp.charAt(i-1) == 32) && (temp.charAt(i) != 32)) {
                newString += (char)(temp.charAt(i) -32);
            }
            else if ((temp.charAt(i-1) != 32) && (temp.charAt(i) != 32) ) {
                newString += (temp.charAt(i));
            }
        }
        return newString;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
