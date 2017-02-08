package wordsMain;
import reverse.*;
import charsCount.CharsTypeCount;

import java.lang.StringBuilder;

public class WordsEffects {
    public static void main (String[] args)
    {
        //>>WORD REVERSE (and palindrome check, only using the custom Reverse.reverser())<<
        Reverse word = new Reverse();
        String hi = "Hi there everybody!";
        System.out.print(word.reverser(hi));

        String hi2 = "racecar";
        System.out.print(word.reverser(hi2));

        //same result, using "StringBuilder.reverse()" in place of the custom "Reverse.reverser()"
        String hi3 = "Hi there everybody!";
        String reversed2 = "\"REVERSED\"";
        System.out.print("\n" + new StringBuilder(hi3).reverse().toString() + ": this have been " + new StringBuilder(reversed2).reverse().toString() + " (StringBuilder.reverse() method)\n");

        //VOWELS AND CONSONANTS COUNT
        CharsTypeCount countMe = new CharsTypeCount();
        countMe.charsCounter("HolAaAaA!");
        System.out.println("\n" + "Your word has: " + countMe.getVowelsNum() + " vowel(s) and: " + countMe.getConsNum() + " consonant(s), you typed also: " + countMe.getSymbNum() + " non-alphabetic symbol(s)");
    }
}
