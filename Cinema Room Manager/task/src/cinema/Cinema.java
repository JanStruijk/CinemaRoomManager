package cinema;

import java.util.InputMismatchException;
import java.util.Scanner;

import static cinema.BuyTicket.*;
import static cinema.ShowSeats.*;
import static cinema.ShowStatistics.*;
import static java.lang.System.out;

public class Cinema {
    static int rowNum;
    static int seatNum;
    static char[][] cinemaHall;
    static int purchasedTickets = 0;
    static int currentIncome = 0;

    public static void main(String[] args) throws InputMismatchException {

        try (Scanner s = new Scanner(System.in)) {
            out.println("Enter the number of rows:");
            int rows = s.nextInt();

            out.println("Enter the number of seats in each row:");
            int seats = s.nextInt();

            cinemaHall = new char[rows + 1][seats + 1];

            boolean flag = true;
            while (flag) {
                out.println("1. Show the seats");
                out.println("2. Buy a ticket");
                out.println("3. Statistics");
                out.println("0. Exit");

                out.print("Enter your choice: ");
                int option = s.nextInt();

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
                    option = s.nextInt();
                }
            }
        }
    }
}
