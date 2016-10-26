package com.github.flying.george.olimpiad;

import com.github.flying.george.olimpiad.io.Task1Processor;
import com.github.flying.george.olimpiad.tasks.Task1Solver;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by george.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        final String name = args.length > 1 ? args[0] : "sample/task1.in";

        Task1Processor processor = new Task1Processor(new File(name));

        while (processor.hasNext()) {
            Task1Solver solver = processor.next();
            System.out.println(solver.solve());
        }

    }
}
