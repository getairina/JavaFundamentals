package com.UG.algorithmsAndDataStructure.algorithms;

/*
 Print first n natural numbers - iterative
 */
public class AlgorithmPrintNumbersRec {
    public static void main(String[] args) {
        AlgorithmPrintNumbersRec myNumber = new AlgorithmPrintNumbersRec();
        myNumber.displayRecursive(10);


    }

    public void displayRecursive(int n){
        if(n!=0){
            displayRecursive(n-1);
        }
        System.out.println(n);
    }

}
