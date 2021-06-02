import java.util.Scanner;

public class Set_Limit
{
    int[] sender()
    {
        int index[] ={0,0};
        String accept_set="";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for questions on Tech \nEnter 2 for questions on chem \nEnter 3 for questions on physics");
        accept_set = in.next();
        if(accept_set.equals("1"))
        {
            index[0] = 1;
            index[1] = 5;
        }
        else if(accept_set.equals("2"))
        {
            index[0] = 6;
            index[1] = 10;
        }
        else if(accept_set.equals("3"))
        {
            index[0] = 11;
            index[1] = 15;
        }
        else
        {
            sender();
        }
        return index;
    }
}
