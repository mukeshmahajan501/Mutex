import java.util.SplittableRandom;
import java.util.concurrent.CountDownLatch;

/**
 * Created by Mukesh on 27-07-2017.
 */
public class StringPractice {

    public static void main(String args[])
    {
        String name ="Mutex Infotech";
        int CountofE=0;

       for(int i=0;i<name.length();i++)
        {
            char c=name.charAt(i);
            if(c=='e') CountofE++;



        }
        System.out.println("CountofE \n"+CountofE);
        //name=name.replace(" ","");

        System.out.println("Index of e="+name.lastIndexOf("e"));


    System.out.println(name.startsWith("m"));

        System.out.println(name.endsWith("ch"));

    }
}
