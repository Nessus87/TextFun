package reverse;

public class Reverse {

    public static String reverser(String word){
        char[] drow = word.toCharArray();
        int first = 0;
        int last = drow.length-1;
        char temp;
        while(last>first){
            temp = drow[first];
            drow[first] = drow[last];
            drow[last] = temp;
            last--;
            first++;
        }
        String s = new String(drow);
        if (s.toLowerCase().equals(word.toLowerCase()))
        {
            return s + " is a palindrome, and can't be reversed.\n";
        }
        else
        {
            return s + ": this have been \"DESREVER\"\n";
        }
    }
}
