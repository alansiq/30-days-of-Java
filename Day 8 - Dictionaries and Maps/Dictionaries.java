import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class Dictionary {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String, Integer> contactList = new HashMap<String,Integer>();


        for (int i = 0; i < n; i++) {
            String name = in.next();
            int number = in.nextInt();

            contactList.put(name, number);
        }

        while(in.hasNext()) {
            String s = in.next();

            if (contactList.containsKey(s)) {
                int result = contactList.get(s);
                System.out.println(s + "=" + result);
            } else {
                System.out.println("Not found");
            }

        }
    }
}





