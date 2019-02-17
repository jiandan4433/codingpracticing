package dailypracticing;

public class dailycoding3 {
     /*
	    Implement an algorithm to determine if a string has all unique characters.
	    What if you cannot use additional data structures?
	     */

    /*   The approach is valid for strings having alphabet as a-z. This approach is little tricky.
     * Instead of maintaining a boolean array, we maintain an integer value called checker(32 bits). As we iterate over the string,
     * we find the int value of the character with respect to ��a�� with the statement int bitAtIndex = str.charAt(i)-��a��;
     * Then the bit at that int value is set to 1 with the statement 1 << bitAtIndex .
     *  Now, if this bit is already set in the checker, the bit AND operation would make checker > 0. Return false in this case.
     * Else Update checker to make the bit 1 at that index with the statement checker = checker | (1 <<bitAtIndex);
     */

    public static void main(String []args){
        System.out.println(approach4("abcdefg"));
        System.out.println(approach4("abAdAsa"));
    }

    public static boolean approach4 (String a)
    {
        int checker = 0;
        for (int i = 0; i < a.length(); i++)
        {
            int bitAtIndex = a.charAt(i) - 'a';
            if ((checker & (1 << bitAtIndex)) > 0)
                return false;
            checker = checker | 1 << bitAtIndex;
        }
        return true;
    }
/*
		    public static boolean sorting(String a)
		    {
		      char[] chararray = a.toCharArray();
		      Arrays.sort(chararray);
		      for (int i = 0; i < chararray.length-1; i++)
		      {
		          if (chararray[i] == chararray[i+1])
		          {
		            return false;
		          }

		      }
		      return true;
		    }
		    */
	/*     public static boolean bruteforce(String a)
	     {
	       int size = a.length();
	       for (int i = 0; i < size; i++)
	       {
	         for (int j= i+1; j < size; j++)
	         {
	           if (a.charAt(i) == a.charAt(j))
	           {
	             return false;
	           }
	         }
	       }
	       return true;
	     }
	     */
    //O(n) using data structure
//	     public static boolean isUniqueLetters(String a)
//	     {
//	         int[] unique = new int[127];
//	         int size = a.length();
//	         for (int i = 0 ; i < size; i++)
//	         {
//	             if (unique[a.charAt(i)] == 0)
//	             {
//	                 unique[a.charAt(i)]++;
//	             }
//	             else
//	             {
//	                 return false;
//	             }
//	         }
//	         return true;
//	     }

}
