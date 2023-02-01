package enums;

public enum LoadCapacity {
    N1(null, 3.5F),
    N2(3.5F, 12.5F),
    N3(12.5F, null);

    private final Float downLimit;
    private final Float upLimit;

    LoadCapacity(Float downLimit, Float upLimit) {
        this.downLimit = downLimit;
        this.upLimit = upLimit;
    }

    public Float getDownLimit() {
        return downLimit;
    }

    public Float getUpLimit() {
        return upLimit;
    }

    @Override
    public String toString() {
        if (downLimit == null) {
            return "Грузоподъёмность до: " +
                    upLimit + " тонн ";
        } else if (upLimit == null) {
            return "Грузоподъёмность свыше: " +
                    downLimit + " тонн ";
        }
        return "Грузоподъёмность от: " +
                downLimit + " тонн " + "до: " + upLimit + " тонн ";
    }
}
