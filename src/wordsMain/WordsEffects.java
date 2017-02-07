package wordsMain;
import reverse.*;
import charsCount.CharsTypeCount;

import java.lang.StringBuilder;

public class WordsEffects {
    public static void main (String[] args)
    {
        //>>WORD REVERSE<<
        Reverse word = new Reverse();
        System.out.print(word.reverser("Hi there everybody!") + ": this have been " + word.reverser("\"REVERSED\""));

        //same result, using "StringBuilder.reverse()" in place of the custom "Reverse.reverser()"
        String hi = "Hi there everybody!";
        String reversed = "\"REVERSED\"";
        System.out.print("\n" + new StringBuilder(hi).reverse().toString() + ": this have been " + new StringBuilder(reversed).reverse().toString() + " (StringBuilder.reverse() method)");

        //VOWELS AND CONSONANTS COUNT
        CharsTypeCount countMe = new CharsTypeCount();
        countMe.charsCounter("HolAaAaA!");
        System.out.println("\n" + "Your word has: " + countMe.getVowelsNum() + " vowel(s) and: " + countMe.getConsNum() + " consonant(s), you typed also: " + countMe.getSymbNum() + " non-alphabetic symbol(s)");
    }
}
