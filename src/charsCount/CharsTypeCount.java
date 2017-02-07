package charsCount;

public class CharsTypeCount
{
    int vowelsNum = 0;
    int consNum = 0;
    int symbNum = 0;

    public int[] charsCounter(String word) throws ArrayIndexOutOfBoundsException
    {
        try {
            char[] letters = word.toLowerCase().toCharArray();

            for (int i = 0; i < letters.length; i++) {
                int index = i;
                if (letters[index] == 'a' || letters[index] == 'e' || letters[index] == 'i' || letters[index] == 'o' || letters[index] == 'u') {
                    this.vowelsNum++;
                } else if (letters[index] == 'b' || letters[index] == 'c' || letters[index] == 'd' || letters[index] == 'f' || letters[index] == 'g' || letters[index] == 'h' || letters[index] == 'j' || letters[index] == 'k' || letters[index] == 'l' || letters[index] == 'm' || letters[index] == 'n' || letters[index] == 'p' || letters[index] == 'q' || letters[index] == 'r' || letters[index] == 's' || letters[index] == 't' || letters[index] == 'v' || letters[index] == 'w' || letters[index] == 'x' || letters[index] == 'y' || letters[index] == 'z')
                {
                    this.consNum++;
                }
                else
                {
                    this.symbNum++;
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        return new int[]{vowelsNum, consNum, symbNum};
    }

    public int getVowelsNum() {
        return vowelsNum;
    }

    public int getConsNum() {
        return consNum;
    }

    public int getSymbNum() {
        return symbNum;
    }
}
