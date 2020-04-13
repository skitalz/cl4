package ru.netology.unit;


public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        if (amount <= 0) {
            try {
                throw new IllegalAccessException("amount must be greater than zero");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        boolean isNeedMore = amount % boundary != 0;
        if (!isNeedMore) {
            return 0;
        }

        int remain = boundary - amount % boundary;
        return remain;
    }
}
