package Cars;

public enum CarC {
    N1(null, 3.5f), N2(3.5f, 12f), N3(12f, null);

    private Float minMass;
    private Float maxMass;


    CarC(Float minMass, Float maxMass) {
        this.minMass = minMass;
        this.maxMass = maxMass;
    }

    @Override
    public String toString() {
        if (minMass == null) {
            return "Грузоподъемность: до " + maxMass + " тонн.";
        } else if (maxMass == null) {
            return "Грузоподъемность: от " + minMass + " тонн.";
        } else {
            return "Грузоподъемность: от " + minMass +
                    " тонн, до " + maxMass + " тонн.";
        }
    }

    public float getMinMass() {
        return minMass;
    }

    public float getMaxMass() {
        return maxMass;
    }
}
