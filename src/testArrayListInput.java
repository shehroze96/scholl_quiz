import java.util.ArrayList;
import java.util.Scanner;

public class testArrayListInput {
    public static void main(String[] args) {
        ArrayList<String> testString = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Scanner answer = new Scanner(System.in);
            System.out.println("Enter a string value");
            String ans = answer.nextLine();

            testString.add(ans);
        }

        for (int i = 0; i < testString.size(); i++) {
            System.out.println(testString.get(i));
        }
    }
}
