import java.util.Scanner;
public class WordCensor {
    public static void main(String[] args) {
        // TODO: Read a full sentence from the user using Scanner.nextLine()
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // TODO: Replace each banned word with exactly ***: dang, nuts, oops, yikes
        String replace = s.replace("oops","***").replace("dang","***").replace("nuts","***").replace("yikes","***");
        // TODO: Print the result prefixed with: Censored:
        System.out.print("Censored: " + replace);
        // NOTE: Tests require exactly three asterisks (no ****) for every replacement
    }
}