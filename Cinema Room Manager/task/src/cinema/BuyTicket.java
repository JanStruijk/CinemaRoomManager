package cinema;

import java.util.Scanner;

import static cinema.Cinema.*;
import static java.lang.System.out;

class BuyTicket {
    static void buyTicket(int rows, int seats) {
        Scanner s = new Scanner(System.in);

        while (true) {
            out.println("Enter a row number:");
            rowNum = s.nextInt();

            if (rowNum < 1 || rowNum > rows) {
                out.println("Wrong input!");
                continue;
            }

            out.println("Enter a seat number in that row:");
            seatNum = s.nextInt();

            if (seatNum < 1 || seatNum > seats) {
                out.println("Wrong input!");
                continue;
            }

            int first = rows / 2;
            int ticketPrice;

            if (cinemaHall[rowNum][seatNum] != 'B') {
                ticketPrice = rows * seats < 60 || rowNum <= first ? 10 : 8;

                cinemaHall[rowNum][seatNum] = 'B';
                purchasedTickets++;
                currentIncome += ticketPrice;

                out.println("Ticket price: $" + ticketPrice);
                out.println();
                break;
            } else {
                out.println("That ticket has already been purchased!");
            }
        }
    }
}
