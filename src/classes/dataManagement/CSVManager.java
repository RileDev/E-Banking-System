package classes.dataManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVManager{

    public static void changePinInDatabase(String userID, String pin) throws IOException {
        File inputFile = new File("users.csv");

        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }

        boolean userFound = false;
        for (int i = 0; i < lines.size(); i++) {
            String[] user = lines.get(i).split(",");
            String existingUserID = user[5];

            if (existingUserID.equals(userID)) {

                user[4] = pin;
                lines.set(i, String.join(",", user));
                userFound = true;

            }
        }

        if (userFound) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
                for (String line : lines) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        } else {
            System.out.println("User ID not found in the database.");
        }

    }

    public static void addUserToCSV(String firstName, String lastName, String gender, String email, String pin, String id){
        String csvFilePath = "users.csv";

        String csvRecord = String.format("%s,%s,%s,%s,%s,%s,%s,%s%n", firstName, lastName, gender, email, pin, id, DataFormatter.formatAccountNumber(), "0");

        try (FileWriter writer = new FileWriter(csvFilePath, true)) {
            writer.append(csvRecord);
        } catch (IOException e) {
            System.err.println("Error writing to users.csv: " + e.getMessage());
        }
    }

    public static void changeAmount(String userID, Double amount) throws IOException{
        File inputFile = new File("users.csv");

        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }

        boolean userFound = false;
        for (int i = 0; i < lines.size(); i++) {
            String[] user = lines.get(i).split(",");
            String existingUserID = user[5];

            if (existingUserID.equals(userID)) {

                user[7] = amount.toString();
                lines.set(i, String.join(",", user));
                userFound = true;

            }
        }

        if (userFound) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
                for (String line : lines) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        } else {
            System.out.println("User ID not found in the database.");
        }
    }

}
