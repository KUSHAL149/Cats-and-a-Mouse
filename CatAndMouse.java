import java.util.Scanner;
import java.math.*;
public class CatAndMouse
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int catA,catB,mouse;
        for(int loop=0;loop<num;loop++)
        {
            catA=in.nextInt();
            catB=in.nextInt();
            mouse=in.nextInt();
            catA=Math.abs(mouse-catA);
            catB=Math.abs(mouse-catB);
            if(catA==catB)
            System.out.println("Mouse C");
            if(catA<catB)
            System.out.println("Cat A");
            if(catA>catB)
            System.out.println("Cat B");
        }
        in.close();
    }
}