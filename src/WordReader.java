import java.util.Objects;

public class WordReader
{
    // Instance fields
    private String valToRead;

    public WordReader()
    {

    }

    public void checkString(String input)
    {
        // Basic string checker logic
        // TODO: Create a dictionary of known Chinese words and their Pinyin
        if (Objects.equals(input, "你好"))
        {
            System.out.println("Nǐ hǎo");
        }
        else
        {
            // TODO: craft this statement to take the chinese word, and then the Pinyin from the user, if unknown.
            System.out.println(" ? ");
        }
    }
    public void iterateString(String input)
    {
        for (int i = 0; i <= input.length()-1; i++)
        {
            System.out.print("   " + input.charAt(i));
            // TODO: get the checkString method running it's logic here!
            System.out.print(checkString(input));
        }

    }
}
