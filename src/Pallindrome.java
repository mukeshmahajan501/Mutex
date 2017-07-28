
public class Pallindrome {
    public static void main(String args[])
    {
        String s1="Nayan";
        String s=s1.toLowerCase();
        int startPos=0;
        int endPos=s.length()-1;
        boolean iss=true;

        while(startPos<endPos) {

            char startLetter = s.charAt(startPos);
            char endLetter = s.charAt(endPos);
            if (startLetter != endLetter) {

                iss = false;
                break;
            }
            startPos++;
            endPos--;
        }
            if (iss==true)
            {

                System.out.println(s +" is a pallindrome");
            }
            else
            {
                System.out.println(s  +"   is a NOT pallindrome");

            }
        }
    }

