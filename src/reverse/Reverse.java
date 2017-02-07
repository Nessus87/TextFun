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
        return new String(drow);
    }
}
