package dailypracticing;

import java.util.Arrays;

public class dailycoding4 {
    public static void main(String []args){
        System.out.println(arePermutation1("acbd", "acdb"));
        System.out.println(arePermutation1("acbd", "acde"));
        System.out.println(arePermutation1("acbd", "acde1"));
    }

    public static boolean arePermutation1(String a, String b)
    {
        char[] str1 = a.toCharArray();
        char[] str2 = b.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);
        if (a.length()!= b.length())
        {
            return false;
        }
        for (int i = 0 ; i < str1.length; i++)
        {

            if (str1[i] != str2[i])
            {
                return false;
            }

        }
        return true;
    }
}
