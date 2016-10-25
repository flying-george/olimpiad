package com.github.flying.george.olimpiad;

import com.github.flying.george.olimpiad.task1.Task1Solver;

/**
 * Created by george.
 */
public class Main {

    public static void main(String[] args) {
        Task1Solver solver = new Task1Solver(50, 50, 50);

        System.out.print(solver.getAlesha());
        System.out.print(" ");
        System.out.print(solver.getDobrynia());
        System.out.print(" ");
        System.out.println(solver.getIlya());
    }
}
