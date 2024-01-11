/**
 * InnerAddition
 */
interface InnerAddition 
{
    int run(int a, int b);

}

public class Addition 
{
    public static void main(String[] args) 
    {

        InnerAddition i = (a, b) -> 
        {

            return a + b;

        };
         System.out.println(i.run(5, 6));
    
    }

}
