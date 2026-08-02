package com.map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {
    @Id
    @Column(name = "answer-id")
    private  int AnswerId;
    private String answer;
    @OneToOne(mappedBy = "answer")
    private Question question;
    public Answer() {
        super();
    }

    public Answer(int answerId, String answer) {
        AnswerId = answerId;
        this.answer = answer;
    }

    public int getAnswerId() {
        return AnswerId;
    }

    public void setAnswerId(int answerId) {
        AnswerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "AnswerId=" + AnswerId +
                ", answer='" + answer + '\'' +
                '}';
    }
}
