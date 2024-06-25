package cinema;

import static cinema.CalculateTotalIncome.*;
import static cinema.Cinema.*;
import static java.lang.System.out;

class ShowStatistics {
    static void showStatistics(int rows, int seats) {
        int totalSeats = rows * seats;
        double percentage = ((double) purchasedTickets / totalSeats) * 100;

        out.println("Number of purchased tickets: " + purchasedTickets);
        out.printf("Percentage: %.2f%%\n", percentage);
        out.println("Current income: $" + currentIncome);
        out.println("Total income: $" + calculateTotalIncome(rows, seats));
    }
}
