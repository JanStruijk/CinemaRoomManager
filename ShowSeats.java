package cinema;

import static cinema.Cinema.*;

class ShowSeats {
    static void showSeats(int rows, int seats, int rowNum, int seatNum) {
        System.out.println("Cinema:");
        char count = '1';

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= seats; j++) {
                if (cinemaHall[i][j] != 'B') {
                    cinemaHall[i][j] = 'S';
                }
            }
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 1; j <= seats; j++) {
                cinemaHall[0][j] = count;
                count++;
            }
            count = '1';
        }

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < 1; j++) {
                cinemaHall[i][j] = count;
                count++;
            }
        }

        char b = 'B';
        cinemaHall[rowNum][seatNum] = b;
        cinemaHall[0][0] = ' ';
        int i = 0;
        while (i <= rows) {
            for (int j = 0; j <= seats; j++) {
                System.out.print(cinemaHall[i][j] + " ");
            }
            System.out.println();
            i++;
        }
    }
}