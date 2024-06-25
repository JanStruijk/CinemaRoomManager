package cinema;

import java.util.Scanner;

import static cinema.BuyTicket.buyTicket;
import static cinema.ShowSeats.*;
import static cinema.ShowStatistics.*;

public class Cinema {
    static int rowNum;
    static int seatNum;
    static char[][] cinemaHall;
    static int purchasedTickets = 0;
    static int currentIncome = 0;

    public static void main(String[] args) throws java.util.InputMismatchException {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of rows:");
            int rows = scanner.nextInt();

            System.out.println("Enter the number of seats in each row:");
            int seats = scanner.nextInt();

            cinemaHall = new char[rows + 1][seats + 1];

            boolean flag = true;
            while (flag) {
                System.out.println("1. Show the seats");
                System.out.println("2. Buy a ticket");
                System.out.println("3. Statistics");
                System.out.println("0. Exit");

                System.out.print("Enter your choice: ");
                int option = scanner.nextInt();

                while (true) {
                    switch (option) {
                        case 1 -> showSeats(rows, seats, rowNum, seatNum);
                        case 2 -> buyTicket(rows, seats);
                        case 3 -> showStatistics(rows, seats);
                        case 0 -> flag = false;
                    }
                    if (option == 1 || option == 2 || option == 3 || option == 0) {
                        break;
                    }
                    option = scanner.nextInt();
                }
            }
        }
    }
}
