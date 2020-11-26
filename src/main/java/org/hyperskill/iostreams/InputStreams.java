package org.hyperskill.iostreams;

import java.io.*;
import java.util.Arrays;

class InputStreams {
    public static String reverseInputText() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder builder = new StringBuilder(
                    reader.readLine())
                    .reverse();
            return builder.toString();
        }
    }

    public static String convertToBytes() throws IOException {
        InputStream inputStream = System.in;
        StringBuilder builder = new StringBuilder();
        try (inputStream) {
            do {
                builder.append(inputStream.read());
            } while (inputStream.available() != 0);
        }
        return builder.toString();
    }

    public static int countWords() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader
                    .readLine()
                    .trim();
            return line.isEmpty() ? 0 : line.split("\\s+").length;
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(convertToBytes());
    }
}
