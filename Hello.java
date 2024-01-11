
/**
 * InnerHello
 */
interface InnerHello<G> {
    void printMessage(G t);

}

public class Hello {

    private static final String String = null;

    public static void main(String[] args) {
        InnerHello<Integer> ii = (n) ->

        {

            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum = sum + digit;
                n = n / 10;

            }
            System.out.println("The Sum of digits is : " + sum);

        };
        ii.printMessage(1234);

        InnerHello<String> iii = (String rev) ->

        {
            String rString = "";
            for (int i = rev.length() - 1; i >= 0; i--) {

                rString = rString + rev.charAt(i);

            }
            System.out.println(rString);

        };
        iii.printMessage("Hello World");

    }
}