package cinema;

import static cinema.CalculateTotalIncome.*;
import static cinema.Cinema.*;

class ShowStatistics {
    static void showStatistics(int rows, int seats) {
        int totalSeats = rows * seats;
        double percentage = ((double) purchasedTickets / totalSeats) * 100;

        System.out.println("Number of purchased tickets: " + purchasedTickets);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + calculateTotalIncome(rows, seats));
    }
}
