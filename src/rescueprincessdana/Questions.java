package rescueprincessdana;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author vinhxu
 */
public class Questions {
    private String question;
    private String answer;

    public Questions(String question, String answer) {
        this.question = question;
        this.answer = answer;   
    }

    public Questions() {
        this("","");
    }
    
    
    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
    
    
    public boolean isCorrect(String string){
        if(string.trim().toLowerCase().equals(this.answer)){
            return true;
        }
        return false;
    }
    
}
