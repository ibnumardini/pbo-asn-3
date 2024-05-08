package pkg.university.employee;

import pkg.blueprint.Orang;
import pkg.university.academic.Prodi;

public class Dosen extends Orang {
    private String nip;
    private Prodi prodi;

    public Dosen(String name, int age, String address) {
        this.setName(name);
        this.setAge(age);
        this.setAddress(address);
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNip() {
        return this.nip;
    }

    public void setProdi(Prodi prodi) {
        this.prodi = prodi;
    }

    public Prodi getProdi() {
        return this.prodi;
    }
}
