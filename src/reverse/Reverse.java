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

    /*String source = "Hello World";

        for (String part : source.split(" ")) {
        System.out.print(new StringBuilder(part).reverse().toString());
        System.out.print(" ");
    }*/
}

