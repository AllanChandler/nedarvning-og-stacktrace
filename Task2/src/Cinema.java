public class Cinema {

    String[][] seats;


    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats];

        for (int i = 0; i < this.seats.length; i++) {
            for (int j = 0; j < this.seats[i].length; j++) {
                this.seats[i][j] = "O";

            }

        }

        this.seats[0][0] = "X";

    }

    public int getRows() {

        return seats.length;
    }
    public int getSeats() {

        return seats[0].length;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {

        if (seats.length <= row) {
            return false;
        } else if (seats[row].length <= seat) {
            return false;
        }
        if (seats[row][seat].equals("O")) {
            seats[row][seat] = "X";

            return true;
        }

        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("X")) {
            seats[row][seat] = "O";
            return true;
        }
        return false;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}
