abstract class Checking_Answer
{
    int final_point = 0;

    int check (String user_answer , String actual_answer )
    {
        int answer_check = 0;
        if(user_answer.equals(actual_answer))
        {
            System.out.println("Your answer is correct");
            answer_check = 1;
        }
        else
        {
            System.out.println("the answer you entered is wrong the correct answer is " + actual_answer);
        }
        return answer_check;
    }
    int Calculator(int points)
    {
        final_point+=points;
        return final_point;
    }
}
