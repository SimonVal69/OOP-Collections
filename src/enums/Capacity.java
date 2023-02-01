package enums;

public enum Capacity {
    TINY(null, 10),
    SMALL(null, 25),
    MEDIUM(40, 50),
    LARGE(60, 80),
    HUGE(100, 120);

    private final Integer downLimit;
    private final Integer upLimit;

    Capacity(Integer downLimit, Integer upLimit) {
        this.downLimit = downLimit;
        this.upLimit = upLimit;
    }

    public Integer getDownLimit() {
        return downLimit;
    }

    public Integer getUpLimit() {
        return upLimit;
    }

    @Override
    public String toString() {
        if (downLimit == null) {
            return "Вместимость до: " + upLimit + " мест ";
        } else {
            return "Вместимость от: " + downLimit + " до: " + upLimit + " мест";
        }
    }
}
