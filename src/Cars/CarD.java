package Cars;

public enum CarD {
    VERYSMALL(null, 10 ), SMALL(null, 25), MEDIUM(40, 50), LARGE(60, 80), VERYLARGE(100, 120);

    private Integer minSeats;
    private Integer maxSeats;

    CarD(Integer minSeats, Integer maxSeats) {
        this.minSeats = minSeats;
        this.maxSeats = maxSeats;
    }

    @Override
    public String toString() {
        if (minSeats == null) {
            return "Вместимость: до " + maxSeats + " мест.";
        } else {
            return "Вместимость: " + minSeats + " - "+ maxSeats + " мест.";
        }
    }

    public Integer getMinSeats() {
        return minSeats;
    }

    public Integer getMaxSeats() {
        return maxSeats;
    }
}
