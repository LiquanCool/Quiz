public class CodeWordChecker {
    private int min;
    private int max;
    private String str;

    public CodeWordChecker(int min, int max, String str)
    {
        this.min = min;
        this.max = max;
        this.str = str;
    }

    public CodeWordChecker(String str)
    {
        this.min = 6;
        this.max = 20;
        this.str = str;
    }

    public boolean isValid(String code)
    {
        if (code.length()<min||code.length()>max)
        {
            return false;
        }
        else if (code.indexOf(str) != -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
