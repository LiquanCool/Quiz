public class RandomWord {
    private String word1;
    private String word2;
    private String randomWord;

    public RandomWord(String word1, String word2)
    {
        this.word1 = word1;
        this.word2 = word2;
        randomWord = "";
    }

    public String randomLetter(int n)
    {
        if (n == 1)
        {
            int random = (int)(Math.random()*word1.length());
            randomWord = randomWord + word1.substring(random, random+1);
            return word1.substring(random, random+1);
        }
        else
        {
            int random = (int)(Math.random()*word2.length());
            randomWord = randomWord + word2.substring(random, random+1);
            return word2.substring(random, random+1);
        }
    }

    public String getNewWord()
    {
        return randomWord;
    }

    public void resetWord()
    {
        randomWord="";
    }
}
