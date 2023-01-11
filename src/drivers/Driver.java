package drivers;

import errExp.LisException;

public class Driver{
    private final String FIO;
    private boolean license;
    private final int experience;

    public Driver(String FIO, boolean license, int experience) {
        this.FIO = FIO;
        this.license = license;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Водитель:  ФИО - " + FIO + ", Права - " + license + ", Стаж - " + experience;
    }

    public String getFIO() {
        return FIO;
    }

    public boolean isLicense() {
        return license;
    }

    public int getExperience() {
        return experience;
    }

    public void start() {
        System.out.println("Начал движение");
    }

    public void stop() {
        System.out.println("Закончил движение");
    }

    public void refuel() {
        System.out.println("Заправить авто");
    }

    public void chekedLisence() {
        if (!license) {
            try {
                throw new LisException("У водителя нет прав");
            } catch (LisException exp) {
                System.out.println("У водителя нет прав");
            }
        }
    }

}



