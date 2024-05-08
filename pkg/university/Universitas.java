package pkg.university;

import java.util.ArrayList;

import pkg.university.academic.*;
import pkg.university.building.*;
import pkg.university.employee.*;

public class Universitas {
    private String npsn;
    private String name;
    private String address;
    private String email;
    private String website;
    private ArrayList<Prodi> prodiList = new ArrayList<Prodi>();
    private ArrayList<Kantor> kantorList = new ArrayList<Kantor>();
    private ArrayList<RuangKelas> ruangKelasList = new ArrayList<RuangKelas>();
    private ArrayList<Dosen> dosenList = new ArrayList<Dosen>();
    private ArrayList<TenagaKependidikan> tenagaKependidikanList = new ArrayList<TenagaKependidikan>();

    public Universitas(String npsn, String name, String address, String email, String website) {
        this.npsn = npsn;
        this.name = name;
        this.address = address;
        this.email = email;
        this.website = website;
    }

    public void addProdi(Prodi... prodi) {
        for (Prodi p : prodi) {
            this.prodiList.add(p);
        }
    }

    public void addKantor(Kantor... kantor) {
        for (Kantor k : kantor) {
            this.kantorList.add(k);
        }
    }

    public void addRuangKelas(RuangKelas... ruangKelas) {
        for (RuangKelas r : ruangKelas) {
            this.ruangKelasList.add(r);
        }
    }

    public void addDosen(Dosen... dosen) {
        for (Dosen d : dosen) {
            this.dosenList.add(d);
        }
    }

    public void addTenagaKependidikan(TenagaKependidikan... tenagaKependidikan) {
        for (TenagaKependidikan t : tenagaKependidikan) {
            this.tenagaKependidikanList.add(t);
        }
    }

    public void displayInformation() {
        System.out.println("Universitas: " + this.name);
        System.out.println("NPSN: " + this.npsn);
        System.out.println("Alamat: " + this.address);
        System.out.println("Email: " + this.email);
        System.out.println("Website: " + this.website);

        System.out.println("Prodi:");
        for (Prodi prodi : this.prodiList) {
            System.out.println("  - " + prodi.getName() + " (" + prodi.getCode() + ") fakultas "
                    + prodi.getFakultas());
        }

        System.out.println("Kantor:");
        for (Kantor kantor : this.kantorList) {
            System.out.println("  - " + kantor.getName() + " (" + kantor.getCode() + ") berlokasi di "
                    + kantor.getLocation() + " dengan kapasitas " + kantor.getCapacity() + " orang");
        }

        System.out.println("Ruang Kelas:");
        for (RuangKelas ruangKelas : this.ruangKelasList) {
            System.out.println("  - " + ruangKelas.getName() + " (" + ruangKelas.getCode() + ") pada prodi "
                    + ruangKelas.getProdi().getName() + " (" + ruangKelas.getProdi().getCode() + ")");
        }

        System.out.println("Dosen:");
        for (Dosen dosen : this.dosenList) {
            System.out.println("  - " + dosen.getName() + " dengan NIP" + dosen.getNip() + " pada prodi "
                    + dosen.getProdi().getName() + " (" + dosen.getProdi().getCode() + ")");
        }

        System.out.println("Tenaga Kependidikan:");
        for (TenagaKependidikan tenagaKependidikan : this.tenagaKependidikanList) {
            System.out.println("  - " + tenagaKependidikan.getName() + " sebagai " + tenagaKependidikan.getPosition()
                    + " di kantor " + tenagaKependidikan.getKantor().getName() + " ("
                    + tenagaKependidikan.getKantor().getCode() + ")");
        }
    }
}
