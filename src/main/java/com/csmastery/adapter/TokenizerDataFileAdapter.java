package com.csmastery.adapter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TokenizerDataFileAdapter extends TokenizerData {

    private File file;
    private String separator;
    private String input;

    public TokenizerDataFileAdapter(File file, String separator) {
        super();
        this.file = file;
        this.separator = separator;
    }

    @Override
    public String getData() {
        if (input != null)
            return input;

        try {
            Scanner scanner = new Scanner(this.file);
            input = scanner.nextLine();
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return input;
    }

    @Override
    public String getSeparator() {
        return separator;
    }
}
