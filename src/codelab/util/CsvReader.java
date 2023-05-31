package codelab.util;

import codelab.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    /**
     * INSTRUCTIONS
     * You will find a Comma-Separated Value (CSV) file within this package. It contains CodeLab status for each student
     * who registered for the CodeLab course.
     * Based on number of solution you solved in CodeLab, a message will be generated for you.
     * You need to find the average score of the class.
     **/
    public static void main(String[] args) {
        String csvFilePath = System.getProperty("user.dir") + "\\src\\codelab\\data\\roster.csv";
        List<Student> roster = readCsvFile(csvFilePath);

        if (!roster.isEmpty()) {
            generateMessages(roster);
            double averageScore = calculateAverageScore(roster);
            System.out.println("Average score of the class: " + averageScore);
        } else {
            System.out.println("No valid data found in the CSV file.");
        }
    }

    private static List<Student> readCsvFile(String csvFilePath) {
        List<Student> roster = new ArrayList<>();
        String line;
        String csvSplitBy = ",";
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(csvFilePath));
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                if (lineNumber == 0) {
                    lineNumber++;
                    continue;
                }
                String[] rowArray = line.split(csvSplitBy);
                if (rowArray.length >= 11) {
                    String firstName = rowArray[5].replace("\"", "");
                    String lastName = rowArray[4].replace("\"", "");
                    int numberOfExercisesSolved = Integer.parseInt(rowArray[10]);
                    roster.add(new Student(firstName, lastName, numberOfExercisesSolved));
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return roster;
    }

    private static void generateMessages(List<Student> roster) {
        for (Student student : roster) {
            String message = convertNumberOfProblemsSolved(student);
            System.out.println(message);
        }
    }


    private static String convertNumberOfProblemsSolved(Student student) {
        String name = student.getFirstName();

        if (student.getNumberOfExercisesSolved() >= 250) {
            return name + " is a QA Engineer in the making";
        } else if (student.getNumberOfExercisesSolved() >= 200) {
            return "Great job, " + name + " - keep this up and learning Selenium will be a breeze for you";
        } else if (student.getNumberOfExercisesSolved() >= 150) {
            return "Great effort, " + name + " - I know you can get some more done";
        } else if (student.getNumberOfExercisesSolved() >= 125) {
            return "You could definitely be spending more time studying, " + name + ". Let's pick up the pace";
        } else if (student.getNumberOfExercisesSolved() >= 100) {
            return "You really need to catch up, " + name;
        } else {
            return "Very low effort. Not a good sign, " + name;
        }
    }

    private static double calculateAverageScore(List<Student> roster) {
        if (roster.isEmpty()) {
            return 0.0;
        }
        int totalSolutions = 0;
        int studentCount = 0;
        for (Student student : roster) {
            totalSolutions += student.getNumberOfExercisesSolved();
            studentCount++;
        }

        double averageScore = (double) totalSolutions / studentCount;
        return averageScore;
    }


    private static class Student {
        private String firstName;
        private String lastName;
        private int numberOfExercisesSolved;

        public Student(String firstName, String lastName, int numberOfExercisesSolved) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.numberOfExercisesSolved = numberOfExercisesSolved;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getNumberOfExercisesSolved() {
            return numberOfExercisesSolved;
        }


    }
}