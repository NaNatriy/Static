package Cars;

public enum CarB {
        SEDAN("Седан"), HATCHBACK("Хетчбек"), COUPE("Купе"), UNIVERSAL("Универсал"), SUV("Внедорожник"), CROSSOVER("Кроссовер"), PICKUP("Пикап"), VAN("Фургон"), MINIVAN("Минивэн");

        private String ruName;

        CarB(String ruName) {
            this.ruName = ruName;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + ruName;
        }

        public String getRuName() {
            return ruName;
        }
    }
