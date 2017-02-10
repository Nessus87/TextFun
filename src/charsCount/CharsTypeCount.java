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

                boolean isVowel;

                if (letters[index] == 'a' || letters[index] == 'e' || letters[index] == 'i' || letters[index] == 'o' || letters[index] == 'u') {
                    isVowel = true;
                } else {
                    isVowel = false;
                }

                if (isVowel) {
                    this.vowelsNum++;
                } else if (Character.isLetter(letters[index]) && !isVowel)
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
