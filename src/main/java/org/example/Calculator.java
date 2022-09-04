package org.example;

public class Calculator {

    public int add(int numberA, int numberB){
        return numberA + numberB;
    }

    public char determineGrade(int percentage) throws IllegalArgumentException {

        char grade = 'Q';

        if(percentage < 0){
            throw new IllegalArgumentException("Wrong input!");
        } else if (percentage < 60) {
            grade =  'F';
        }
        else if (percentage < 70) {
            grade = 'D';
        }
        else if (percentage < 80) {
            grade = 'C';
        }
        else if (percentage < 90) {
            grade = 'B';
        }
        else {
            grade = 'A';
        }
        return grade;
    }
}
