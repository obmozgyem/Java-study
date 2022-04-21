package HomeWorkFor1104.Task1;

import java.io.*;


public class Task1 {
    public static void main(String[] args) throws IOException {

        File file1 = new File("resources", "Task1.txt");
        File file2 = new File("resources", "TaskResult.txt");


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))) {

            String number = bufferedReader.readLine();
            String[] numberArray = number.split(" ");
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < numberArray.length; i++) {
                stringBuilder.append((int) Math.pow(Integer.parseInt(numberArray[i]), 3)).append(" ");

            }
            bufferedWriter.write(stringBuilder.toString().trim());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
