package mechanics;

import cars.Transport;
import errExp.IncorrectInput;

public class Mechanic {
    private String name;
    private String company;

    Enum transp;

    public Mechanic(String name, String company, Mechanic.Transp transp) {
        this.name = name;
        this.company = company;
        this.transp = transp;

    }

    public Mechanic(Mechanic cars) {
    }

    @Override
    public String toString() {
        return "Механик: " + "имя = " + name + ", компания = " + company +", " + transp;
    }

    private void mechDiagnostic(){
        System.out.println("провести техобслуживание");
    }

    private void fixCar(){
        System.out.println("починить машину");
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void setName(String name) throws IncorrectInput {
        if (name == null && name.isBlank()) {
            throw new IncorrectInput("Incorrect input");
        } else {
            this.name = name;
        }
    }

    public void setCompany(String company) throws IncorrectInput {
        if (company == null && company.isBlank()) {
            throw new IncorrectInput("Incorrect input");
        } else {
            this.company = company;
        }
    }
    public enum Transp{
        EASYCAR("Легковые"), TRUCKS("Грузовые"), BUS("Автобусы"), ALL("Все");

        String type;

        Transp(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Работаю с " + type;
        }
    }

//    public String getWorkCar() {
//        return workCar;
//    }
//
//    public void setWorkCar(String workCar) throws IncorrectInput {
//        if (workCar == null && workCar.isBlank()) {
//            throw new IncorrectInput("Incorrect input");
//        } else {
//            this.workCar = workCar;
//        }
//
//    }
}
