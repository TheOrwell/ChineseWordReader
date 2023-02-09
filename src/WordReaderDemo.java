import java.util.Scanner;

public class WordReaderDemo
{
    public static void main(String[] args)
    {
        // Creates a scanner, takes input, and inserts it into method
        Scanner inputGrabber = new Scanner(System.in);
        System.out.println("Try inputting a Chinese word, like 你好: ");
        String userInput = inputGrabber.nextLine();
        WordReader check1 = new WordReader(userInput);

        check1.checkString();

    }
}
