/**
 * InnerIntMethod
 */
interface InnerIntMethod {
    int run();

}

public class IntMethod {
    public static void main(String[] args) {

        InnerIntMethod ii = () -> {
            int a = 0, b = 1;
            for (int i = 0; i <= 5; i++) {
                System.out.println(a);
            
                int c = a+b;
                a = b;
                b = c;
            }
            return a;
            

        };
        System.out.println(ii.run());

        InnerIntMethod iii=()->
        {
            int a=50,b=60;
            int c=a;
            a=b;
            b=c;
            System.out.println(a+"\t"+b);
            return 0;

        };
        System.out.println(iii.run());
        
       
    }

}
