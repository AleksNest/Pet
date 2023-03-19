package Models.PackAnimals;

import Models.PackAnimal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class Camel extends PackAnimal {

    private int numberOfHumps;
    private List<String> listOfCommands;

    public Camel(String name, Date birthday, int loadCapacity, int numberOfHumps, List<String> listOfCommands) {
        super(name, birthday, loadCapacity, listOfCommands);
        this.numberOfHumps = numberOfHumps;
        this.listOfCommands = listOfCommands;

    }


    @Override
    public String toString() {
        DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        return String.format("%-8s%-5s%2d  %-5s%-8s  %-9s%-10s     %-8s%-8s  %-9s%-13s  %-9s%s %s ",
                PackAnimalsEnum.CAMEL,
                "[ Id=", super.getId(),
                "NAME=", super.getName(),
                "BIRTHDAY=", formatter.format(super.getBirthday()),
                "numberOfHumps=", numberOfHumps,
                "LoadCapacity=", super.getLoadCapacity(),
                "COMMANDS=", this.listOfCommands,
                "] ");
    }


}