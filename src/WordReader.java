import java.util.Objects;

public class WordReader
{
    // Instance fields
    private String valToRead;

    public WordReader(String input)
    {
        if (Objects.equals(input, "你好"))
        {
            System.out.println(input);
            System.out.println("Nǐ hǎo");
        }
        else
        {
            System.out.println("Yeah I got no clue what dat is holmes.");
        }

    }
    public void checkString()
    {

    }
}
