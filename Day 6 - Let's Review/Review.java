import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();



        for (int i = 0; i < testCases; i++) {
            String evenText = "";
            String oddText = "";
            String text = scanner.next();

            for (int j = 0; j < text.length(); j++) {
                if (j % 2 == 0) {
                    evenText += text.charAt(j);
                } else {
                    oddText += text.charAt(j);
                }
            }

            System.out.println(evenText + " " + oddText);

        }

    }
}
