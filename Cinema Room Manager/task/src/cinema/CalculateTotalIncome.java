package cinema;

class CalculateTotalIncome {
    static int calculateTotalIncome(int rows, int seats) {
        int totalSeats = rows * seats;

        if (totalSeats <= 60) return totalSeats * 10;
        else {
            int first = rows / 2;
            int frontRows = first * seats;
            int backRows = (rows - first) * seats;
            return (frontRows * 10) + (backRows * 8);
        }
    }
}
