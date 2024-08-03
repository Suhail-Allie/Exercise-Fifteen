package org.example;
import java.util.Scanner;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Declare Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();
//Declare Arrays
        String[] names = new String[numStudents];
        int[] scores = new int[numStudents];
//Use for loop
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.println("Enter the score of student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
            scanner.nextLine();
        }

        Integer[] indices = new Integer[numStudents];
        for (int i = 0; i < numStudents; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> scores[b] - scores[a]);

        System.out.println("Student names in decreasing order of their scores:");
        for (int i : indices) {
            //Output
            System.out.println(names[i]);
        }

        scanner.close();
    }
}
