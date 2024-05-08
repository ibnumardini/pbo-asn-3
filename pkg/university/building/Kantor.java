package pkg.university.building;

import pkg.blueprint.Ruangan;

public class Kantor extends Ruangan {
    private String code;

    public Kantor(String name, String location, int capacity) {
        this.setName(name);
        this.setLocation(location);
        this.setCapacity(capacity);
    }

    public void setCode(String code) {
        this.code = "KT" + code;
    }

    public String getCode() {
        return this.code;
    }
}
