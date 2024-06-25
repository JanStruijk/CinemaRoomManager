package cinema;

import java.util.Scanner;

import static cinema.Cinema.*;

class BuyTicket {
    static void buyTicket(int rows, int seats) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a row number:");
            rowNum = scanner.nextInt();

            if (rowNum < 1 || rowNum > rows) {
                System.out.println("Wrong input!");
                continue;
            }

            System.out.println("Enter a seat number in that row:");
            seatNum = scanner.nextInt();

            if (seatNum < 1 || seatNum > seats) {
                System.out.println("Wrong input!");
                continue;
            }

            int first = rows / 2;
            int ticketPrice;

            if (cinemaHall[rowNum][seatNum] == 'B') {
                System.out.println("That ticket has already been purchased!");
            } else {
                ticketPrice = rows * seats < 60 || rowNum <= first ? 10 : 8;

                cinemaHall[rowNum][seatNum] = 'B';
                purchasedTickets++;
                currentIncome += ticketPrice;

                System.out.println("Ticket price: $" + ticketPrice);
                System.out.println();
                break;
            }
        }
    }
}
