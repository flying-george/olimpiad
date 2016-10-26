package com.github.flying.george.olimpiad.io;

import com.github.flying.george.olimpiad.tasks.Task1Solver;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by corney on 10/26/16.
 */
public class Task1Processor extends FileProcessor<Task1Solver> {

    public Task1Processor(File file) throws FileNotFoundException {
        super(file);
    }

    @Override
    protected Task1Solver getInstance(String line) {
        int[] n = parseLine(line);
        if (n.length != 3) {
            throw new IllegalArgumentException("Wrong line format: " + line);
        }
        return new Task1Solver(n[0], n[1], n[2]);
    }
}
