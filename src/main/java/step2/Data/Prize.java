package step2.Data;

import java.util.Arrays;

public enum Prize {
    KRW_5_000(3, 5_000),
    KRW_50_000(4, 50_000),
    KRW_1_500_000(5, 1_5000_000),
    KRW_2_000_000_000(6, 2_000_000_000);

    private int matchCount;
    private int earningMoney;

    Prize(int matchCount, int earningMoney) {
        this.matchCount = matchCount;
        this.earningMoney = earningMoney;
    }

    public static int getPrice(int matchCount) {
        return Arrays.stream(values())
                .filter(prize -> prize.getMatchCount() == matchCount)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new)
                .getEarningMoney();
    }

    public int getMatchCount() {
        return this.matchCount;
    }

    public int getEarningMoney() {
        return this.earningMoney;
    }
}