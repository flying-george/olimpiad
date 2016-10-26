package com.github.flying.george.olimpiad.io;

import com.github.flying.george.olimpiad.tasks.TaskSolver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by corney on 10/26/16.
 */
public abstract class FileProcessor<T extends TaskSolver> {

    private final Scanner scanner;
    private boolean closed = false;

    public FileProcessor(File file) throws FileNotFoundException {
        scanner = new Scanner(new FileInputStream(file));
    }

    public boolean hasNext() {
        boolean hasNext = scanner.hasNextLine();
        if (! hasNext && ! closed) {
            closed = true;
            scanner.close();
        }
        return hasNext;
    }


    public T next() {
        String line = scanner.nextLine();
        return getInstance(line);
    }

    protected abstract T getInstance(String line);

    protected int[] parseLine(String line) {
        String[] strings = line.split("\\s+", -1);
        int[] result = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            result[i] = Integer.parseInt(strings[i]);
        }
        return result;
    }

}
