package com.londonappbrewery.destini;

/**
 * Created by a7med on 9/30/2017.
 */

public class Story {
    private int Story_id;
    private int answer_1_id;
    private int Answer_1_Goto_id;
    private int answer_2_id;
    private int answer_2_Goto_id;
    public Story (int set_Story_id,int set_answer_1_id, int set_Answer_1_Goto_id, int set_answer_2_id
    ,int set_answer_2_Goto_id){
         Story_id = set_Story_id;
         answer_1_id = set_answer_1_id;
         Answer_1_Goto_id = set_Answer_1_Goto_id;
         answer_2_id = set_answer_2_id;
         answer_2_Goto_id = set_answer_2_Goto_id;
    }

    public int getStory_id() {
        return Story_id;
    }

    public void setStory_id(int story_id) {
        Story_id = story_id;
    }

    public int getAnswer_1_id() {
        return answer_1_id;
    }

    public void setAnswer_1_id(int answer_1_id) {
        this.answer_1_id = answer_1_id;
    }

    public int getAnswer_1_Goto_id() {
        return Answer_1_Goto_id;
    }

    public void setAnswer_1_Goto_id(int answer_1_Goto_id) {
        Answer_1_Goto_id = answer_1_Goto_id;
    }

    public int getAnswer_2_id() {
        return answer_2_id;
    }

    public void setAnswer_2_id(int answer_2_id) {
        this.answer_2_id = answer_2_id;
    }

    public int getAnswer_2_Goto_id() {
        return answer_2_Goto_id;
    }

    public void setAnswer_2_Goto_id(int answer_2_Goto_id) {
        this.answer_2_Goto_id = answer_2_Goto_id;
    }
}
