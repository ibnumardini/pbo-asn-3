package pkg.university.building;

import pkg.blueprint.Ruangan;
import pkg.university.academic.Prodi;

public class RuangKelas extends Ruangan {
    private String code;
    private Prodi prodi;

    public RuangKelas(String name, String location, int capacity) {
        this.setName(name);
        this.setLocation(location);
        this.setCapacity(capacity);
    }

    public void setCode(String code) {
        this.code = "RK" + code;
    }

    public String getCode() {
        return this.code;
    }

    public void setProdi(Prodi prodi) {
        this.prodi = prodi;
    }

    public Prodi getProdi() {
        return this.prodi;
    }
}
