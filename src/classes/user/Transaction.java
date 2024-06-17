package classes.user;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private final String FILE_NAME = "log.txt";
    private String currentDate;
    private String senderAccountNumber;
    private String recipientAccountNumber;
    private double balance;
    private String purpose;

    public Transaction(String senderAccountNumber, String recipientAccountNumber, double balance, String purpose) {
        this.currentDate = this.getDate();
        this.senderAccountNumber = senderAccountNumber;
        this.recipientAccountNumber = recipientAccountNumber;
        this.balance = balance;
        this.purpose = purpose;
    }

    private String getDate(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String timeStamp = now.format(formatter);
        return timeStamp;
    }

    public void logTransaction(){
        try (FileWriter writer = new FileWriter(this.FILE_NAME, true)){
            writer.append(this.toString());
        } catch (IOException e) {
            System.err.println("Error writing to " + this.FILE_NAME + ": " + e.getMessage());

        }
    }

    @Override
    public String toString() {
        return "sent:" + currentDate +
                ",senderAccountNumber:'" + senderAccountNumber + '\'' +
                ",recipientAccountNumber:'" + recipientAccountNumber + '\'' +
                ",balance:" + balance + "EUR"+
                ",purpose:'" + purpose + '\'' +
                "\n";
    }
}
