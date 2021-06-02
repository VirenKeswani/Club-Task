import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Randomize
{
    int number_generator(int start , int end )
    {
        int randomNum = ThreadLocalRandom.current().nextInt(start, end + 1);
         return  randomNum;
    }
    ArrayList<Integer> random_number_passer(int begin , int end , String q_or_o)
    {
        int question_number , t = 1 , limit = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(number_generator(begin , end));
        if(q_or_o.equals("q"))
            limit = 5;
        if(q_or_o.equals("o"))
            limit = 4;
        for(int i = 0; arr.size()<= (limit - 1 ) ; i++)
        {

            question_number = number_generator(begin , end);
            for(int j = 0 ; j < arr.size() ; j++)
            {
                if(arr.get(j) == question_number)
                {

                    t=0;
                    break;
                }
            }

            if(t == 1)
            {
                arr.add(question_number);
            }
            t=1;
        }

       return arr;

    }
}
