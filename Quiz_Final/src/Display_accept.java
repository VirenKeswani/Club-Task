import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Display_accept extends Checking_Answer
{
    int Questions_Display(int questions , ArrayList<Integer> order) throws IOException
    {
        Gson gson = new Gson();
        File file = new File("data.json");
        Scanner in = new Scanner(file);
        ArrayList<Integer> option_order = order;
        String data = "" , answer = "" ;
        int user_answer , point_sender;
        while (in.hasNext()) {
            data += in.nextLine();
        }
        quiz_data[] arr = gson.fromJson(data, quiz_data[].class);
        System.out.println(arr[questions-1].q);

        for(int i =0; i <= 3 ; i++)
        {
            System.out.println((i+1)+" : "+arr[questions - 1].items.get(option_order.get(i) - 1));
        }
        // System.out.println("The correct answer is " + arr[questions-1].ans);
        user_answer = Accept_answer();

        answer = arr[questions - 1].items.get(option_order.get(user_answer-1)-1).toString();


        //System.out.println("user entered " + answer );

        point_sender = check(answer , arr[questions-1].ans);
        int z = Calculator(point_sender);
        System.out.println("points " + z);
        option_order.clear();
        return z;

    }
    int Accept_answer()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your answer option index");
        return in.nextInt();

    }



}
