package Binary_Search;

public class Guess_Number_Higher_Lower {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int guess_no = low + (high - low) / 2;
            int val = guess(guess_no);
            if (val == 0) {
                return guess_no;
            } else if (val == -1) {
                high = guess_no - 1;
            } else {
                low = guess_no + 1;
            }
        }
        return -1;
    }

    private int guess(int guessNo) {
        return 0;
    }

    public static void main(String[] args) {

    }
}
