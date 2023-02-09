import java.util.Objects;

public class WordReader
{
    // Instance fields
    private String valToRead;

    public WordReader(String input)
    {
        // Basic string checker logic
        // TODO: Create a dictionary of known Chinese words and their Pinyin
        if (Objects.equals(input, "你好"))
        {
            System.out.println(input);
            System.out.println("Nǐ hǎo");
        }
        else
        {
            // TODO: craft this statement to take the chinese word, and then the Pinyin from the user, if unknown.
            System.out.println("Yeah I got no clue what dat is holmes.");
        }
    }
    public void checkString()
    {

    }
}
