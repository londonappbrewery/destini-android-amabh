package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    // TODO: need to Write correct comment
    Button Answer_1 ; // Top Button
    Button Answer_2 ; // Bottom button
    TextView DispelY_text; //will Display the text on the main screen

    Story Now_Display ; // will store the vale of story that are display
    int ID_Display ; // id of the story or end that Need to display

    Story[] Bank = new Story[] {// all story can be order by any index but any story need to have store to go or end
             new Story(R.string.T1_Story, R.string.T1_Ans1, R.string.T3_Story, R.string.T1_Ans2, R.string.T2_Story),
             new Story(R.string.T3_Story, R.string.T3_Ans1, R.string.T6_End,R.string.T3_Ans2, R.string.T5_End),
             new Story(R.string.T2_Story, R.string.T2_Ans1, R.string.T3_Story, R.string.T2_Ans2, R.string.T4_End)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Answer_1 = (Button) findViewById(R.id.buttonTop);
        Answer_2 = (Button) findViewById(R.id.buttonBottom);
        DispelY_text = (TextView)  findViewById(R.id.storyTextView);

        if (savedInstanceState != null){
            Story_or_End(savedInstanceState.getInt("ID")); // get the old view and look up if its story or End
        }else{
            Now_Display = Bank[0]; // startup story
            setStory();// to set the story on the screen and button
        }

        Answer_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Story_or_End (Now_Display.getAnswer_1_Goto_id());

            }
        });
        Answer_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Story_or_End (Now_Display.getAnswer_2_Goto_id());

            }
        });


    }
    public void setStory () {
        Answer_1.setText(Now_Display.getAnswer_1_id());
        Answer_2.setText(Now_Display.getAnswer_2_id());
        DispelY_text.setText(Now_Display.getStory_id());

    }
    public void DisplayEnd (int id){
        Answer_1.setVisibility(View.INVISIBLE);
        Answer_2.setVisibility(View.INVISIBLE);
        DispelY_text.setText(id);
    }
    public int Story_or_End(int id){
        int Length = Bank.length - 1;
        ID_Display = id ;

        while (Length >= 0) {
            if (Bank[Length].getStory_id() == id) {
                Now_Display = Bank[Length];
                setStory();
                return Length;
            }
            Length--;
        }
        DisplayEnd(ID_Display);
        return  -1 ;
    }
    @Override
    public void onSaveInstanceState (Bundle outside){
        super.onSaveInstanceState(outside);
        outside.putInt("ID",ID_Display);

    }
}
