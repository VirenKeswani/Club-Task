import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class main
{
    public static void main(String[] args)throws IOException
    {
        Display_accept printf = new Display_accept();
        Randomize shuffle = new Randomize();
        Set_Limit question_type = new Set_Limit();
        int points=0,f=0;
        int question_limits[] = question_type.sender();
        String st="";
        String passer[]=null;
        //question block
        ArrayList<Integer> q_no = shuffle.random_number_passer(question_limits[0] , question_limits[1], "q");//random question order generator
        //option/point/checker block
        for(int i = 0 ; i < 5 ; i++)
        {

            ArrayList<Integer> option_order = shuffle.random_number_passer(1 , 4 , "o");//random option order generator
            points =  printf.Questions_Display(q_no.get(i) , option_order);


        }
        System.out.println("You answered " + points + " / " + q_no.size() + " correct!");

        //reload
        Scanner in = new Scanner(System.in);
        System.out.println("do you want to try again?");
        while(f==0)
        {
            System.out.println("enter 'y' for yes and 'n' for no");
            st=in.next();
            st=st.trim();
            if(st.equalsIgnoreCase("y")||st.equalsIgnoreCase("n"))
            {
                f=1;
            }
            else
                System.out.print("please ");

        }
        if(st.equalsIgnoreCase("y"))
        {
            System.out.println("\n================================================\n");
            main(passer);

        }
        if (st.equalsIgnoreCase("n"))
            System.out.println("Thank you for playing!");


    }
}