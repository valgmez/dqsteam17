import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DQS {


    public static void searchByString () throws IOException {
        System.out.println("Enter file name: ");
        Scanner userInput = new Scanner(System.in);
        String fileRead = userInput.nextLine();
        System.out.println("Enter the search term:");
        String searchTerm = userInput.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(fileRead));
        ArrayList<String> questionDatabase = new ArrayList<>();


        String line = br.readLine();
        while (line != null) {
            questionDatabase.add(line);
            line = br.readLine();
        }


        br.close();

        for (int i = 0; i < questionDatabase.size(); i++) {
            if (questionDatabase.get(i).contains(searchTerm)) {
                System.out.println("In the question bank,'" + searchTerm + "' is found at line " + (i + 1) + ".");
            }
        }

    }

    public static void loadFile() {
        Scanner fileRd = new Scanner(System.in);

        try {
            System.out.println("Enter file name: ");
            String FileRead = fileRd.nextLine();

            FileReader fr = new FileReader(FileRead);
            BufferedReader br = new BufferedReader(fr);

            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);


            }
            br.close();

        } catch (IOException e) {
            System.out.println("An error occured.");
        }

    }

    public static void addNewQuestions() {
        Scanner currentCSV = new Scanner(System.in);

        try {
            System.out.println("Enter File name that contains the questions:");
            String currentCSVOpen = currentCSV.nextLine();
            Scanner csvInput = new Scanner(System.in);

            System.out.println("Enter name of Question:");
            String newQuestion = csvInput.nextLine();

            System.out.println("Enter option A:");
            String optionA = csvInput.nextLine();
            System.out.println("Enter option B:");
            String optionB = csvInput.nextLine();
            System.out.println("Enter option C:");
            String optionC = csvInput.nextLine();
            System.out.println("Enter option D:");
            String optionD = csvInput.nextLine();

            System.out.println("Enter correct answer (A,B,C or D): ");
            String correctOption = csvInput.nextLine();
            System.out.println("Enter feedback:");
            String feedback = csvInput.nextLine();


            FileWriter writer = new FileWriter(currentCSVOpen, true);
            writer.write(newQuestion + "," + optionA + "," + optionB + "," + optionC + "," + optionD + "," + correctOption + "," + feedback + System.lineSeparator());
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
