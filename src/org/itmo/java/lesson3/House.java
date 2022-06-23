package org.itmo.java.lesson3;

public class House {
    private Integer numberOfFloors;
    private Integer buildYear;
    private String name;

    public void setHouseInfo(Integer numberOfFloors, Integer buildYear, String name) {
        this.numberOfFloors = numberOfFloors;
        this.buildYear = buildYear;
        this.name = name;
    }

    public String getInfoAboutHouse () {
        return "Number of floors: " + numberOfFloors + ", year of build: " + buildYear + ", name of building: " + name;
    }

    public int yearFromBuild () {
        return 2022 - this.buildYear;
    }
}

class HouseMain {
    public static void main(String[] args) {
        House house1 = new House();
        house1.setHouseInfo(3,1983,"John's house");
        System.out.println(house1.getInfoAboutHouse());
        System.out.println("Years from build " + house1.yearFromBuild());

        House house2 = new House();
        house2.setHouseInfo(15,2013,"Hotel");
        System.out.println(house2.getInfoAboutHouse());
        System.out.println("Years from build " + house2.yearFromBuild());
    }
}
