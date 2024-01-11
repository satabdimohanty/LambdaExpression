/**
 * InnerArithmeticOperation
 */
interface InnerArithmeticOperation {
    void run();

}

public class ArithmeticOperation {
    // private int a;
    public static void main(String[] args) {
        InnerArithmeticOperation ii = () -> {
            int n = 120;

            if (n > 200)

            {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        };
        ii.run();
        InnerArithmeticOperation iii = () -> {
            int arr[] = { 1, 10, 2 };
            int max = arr[0];
            int min = arr[1];
            int secmin = arr[2];
            for (int i = 0; i < arr.length; i++) 
            {
                if (arr[i] > max) 
                {
                
                    max = arr[i];
                } 
                else if (arr[i] < min) 
                {
                    min = arr[i];
                } 
                else if (arr[i] < secmin)// &&arr[i]>min)
                {
                    secmin = arr[i];

                }

            }
            System.out.println(max + "\t" + min + "\t" + secmin);

        };
        iii.run();
    }

}
