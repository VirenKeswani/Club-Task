import com.google.gson.annotations.SerializedName;

import java.util.List;

public class quiz_data
{
    @SerializedName("index")
    public String num;
    @SerializedName("question")
    public String q;
    @SerializedName("answer")
    public String ans;
    public List items;

    quiz_data(String num, String q , String ans , List items , String option)
    {
        this.num=num ;
        this.q=q;
        this.ans=ans;
        this.items=items;
        //  this.option=option;
    }

    public void print()
    {
        //options obj = new options();

        System.out.println("id:" + num + "\n" + "question:" + q  + "\n" + "answer:" + ans
                + "\n" + "option "  );
        for (int i = 0 ; i<items.size();i++)
        {
            System.out.println(items.get(i));
        }



    }

}