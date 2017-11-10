import java.util.Scanner;
public class Hangman
{
    private String word;
    private String hangs;
    private Scanner input = new Scanner(System.in);

    public void enterInput()
    {
        char guess = input.next().toLowerCase().charAt(0);
        char[] hangsArray = hangs.toCharArray();
        for (int i = 0; i < hangsArray.length; i++)
        {
            if (guess == word.charAt(i))
            {
                hangsArray[i] = guess;
            }
        }
        hangs = new String(hangsArray);

    }
    public String toString()
    {
        return hangs;
    }
    public boolean isCompleted()
    {
        return !hangs.contains("_");
    }
    public Hangman(String word)
    {
        this.word = word;
        hangs = this.word.replaceAll("\\S","_");
    }
}