package part2.bit_roller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitRoller {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long number = Long.valueOf(reader.readLine());
        int f = Integer.valueOf(reader.readLine());
        int r = Integer.valueOf(reader.readLine());
        int shifter = 18;

        if ( f == 18) {
            shifter --;
        }

        for (int i = 1; i <= r; i++) {
            number = swapBits(number, f);
            long rightMostBit = (number & 1) << shifter;
            number = (number >> 1) | rightMostBit;
        }

        System.out.println(number);
    }

    private static long swapBits(long number, int freezingBitPosition) {
        long bitBefore = ((number >> freezingBitPosition + 1) & 1);
        long freezingBit = ((number >> freezingBitPosition) & 1);

        if (bitBefore != freezingBit) {
            number = number & (~ (1 << freezingBitPosition));
            number = number | (1 << freezingBitPosition + 1);
        }

        return number;
    }


}
