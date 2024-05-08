package pkg.university.employee;

import pkg.blueprint.Orang;
import pkg.university.building.Kantor;

public class TenagaKependidikan extends Orang {
    private String position;
    private Kantor kantor;

    public TenagaKependidikan(String name, int age, String address) {
        this.setName(name);
        this.setAge(age);
        this.setAddress(address);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

    public void setKantor(Kantor kantor) {
        this.kantor = kantor;
    }

    public Kantor getKantor() {
        return this.kantor;
    }
}
