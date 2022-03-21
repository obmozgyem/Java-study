package Archive.HomeWork0203.first;
/*
1. Опишите (то есть создайте класс, описывающий…) сущность Здание.
        Здание можно охарактеризовать назначением (например, жилой дом, офисное здание, промышленный объект, хоз. постройка и т.д.),
        адресом, количеством этажей, наличием(или отсутствием) лифта, материалом,
        из которого оно построено, годом постройки. Адрес состоит из улицы и номера дома.
        */

public class Home {
    private String bilding;
    private int floor;
    private int yearofconstruction;
    private String material;
    public Address address;


    @Override
    public String toString() {
        return "Home{" +
                "bilding='" + bilding + '\'' +
                ", floor=" + floor +
                ", yearofconstruction=" + yearofconstruction +
                ", material='" + material + '\'' +
                ", address=" + address +
                '}';
    }

    public Home(String bilding, int floor, int yearofconstruction, String material, Address address) {
        this.bilding = bilding;
        this.floor = floor;
        this.yearofconstruction = yearofconstruction;
        this.material = material;
        this.address = address;

    }
    public String getBilding() {
        return bilding;
    }

    public void setBilding(String bilding) {
        this.bilding = bilding;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getYearofconstruction() {
        return yearofconstruction;
    }

    public void setYearofconstruction(int yearofconstruction) {
        this.yearofconstruction = yearofconstruction;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }



}




