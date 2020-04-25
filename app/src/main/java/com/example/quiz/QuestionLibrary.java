package com.example.quiz;

public class QuestionLibrary {

    private String mQuestions []={
            "How many sizes are supported by Android?",
            "How to get current location in Android?",
            "What is ADB in Android?",
            "What is JSON in Android"
    };
    private String mChoices[][]={
            {"Android supported all sizes","Android does not support all sizes","Android supports small,normal,large and extra-large sizes"},
            {"Using with GPRS","SQlite","A&B"},
            {"Image Tool","Development Tool","Android Debug Bridge"},
            {"Java Script Object Native","Java Script Oriented Notation","Java Script Object Notation"}
    };

    private String mCorrectAnswers[]={"Android supports small,normal,large and extra-large sizes","A&B","Android Debug Bridge","Java Script Object Notation"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return  question;
    }
    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }
    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
