import helper.Decoration;
import pkg.university.Universitas;
import pkg.university.academic.*;
import pkg.university.building.*;
import pkg.university.employee.*;

public class Main {
    public static void main(String[] args) {
        Decoration.printHeader("# University Administration System");
        Decoration.printSeparator();
        illuminateUmby();
        Decoration.printSeparator();
        illuminateUgm();
        Decoration.printSeparator();
    }

    private static void illuminateUmby() {
        Universitas umby = new Universitas("051019", "Universitas Mercu Buana Yogyakarta", "Yogyakarta",
                "humas@mercubuana-yogya.ac.id", "https://umby.ac.id");

        Prodi informatika = new Prodi(123, "Informatika", "Teknologi Informasi");
        Prodi sistemInformasi = new Prodi(124, "Sistem Informasi", "Teknologi Informasi");

        umby.addProdi(informatika, sistemInformasi);

        Kantor rektorat = new Kantor("Rektorat", "Gedung Rektorat", 200);
        rektorat.setCode("001");
        Kantor dekanatFTI = new Kantor("Dekanat FTI", "Gedung FTI", 100);
        dekanatFTI.setCode("002");

        umby.addKantor(rektorat, dekanatFTI);

        RuangKelas kelas12D = new RuangKelas("Kelas 12D", "Gedung FTI", 50);
        kelas12D.setCode("12D1");
        kelas12D.setProdi(informatika);
        RuangKelas kelas22D = new RuangKelas("Kelas 22D", "Gedung FTI", 50);
        kelas22D.setCode("22D1");
        kelas22D.setProdi(sistemInformasi);

        umby.addRuangKelas(kelas12D, kelas22D);

        Dosen dosen1 = new Dosen("Dr. Budi", 35, "Yogyakarta");
        dosen1.setNip("021");
        dosen1.setProdi(informatika);

        Dosen dosen2 = new Dosen("Dr. Andi", 40, "Yogyakarta");
        dosen2.setNip("102");
        dosen2.setProdi(sistemInformasi);

        umby.addDosen(dosen1, dosen2);

        TenagaKependidikan rektor = new TenagaKependidikan("Dr. Eko Pranowo", 30, "Yogyakarta");
        rektor.setKantor(rektorat);
        rektor.setPosition("Rektor");

        TenagaKependidikan kaprodi = new TenagaKependidikan("Dr. Hambana Pati", 30, "Yogyakarta");
        kaprodi.setKantor(dekanatFTI);
        kaprodi.setPosition("Kepala Prodi");

        umby.addTenagaKependidikan(rektor, kaprodi);

        umby.displayInformation();
    }

    private static void illuminateUgm() {
        Universitas ugm = new Universitas("001001", "Universitas Gadjah Mada", "Yogyakarta", "setr@ugm.ac.id",
                "https://ugm.ac.id");

        Prodi teknikMesin = new Prodi(111, "Teknik Mesin", "Teknik");
        Prodi teknikElektro = new Prodi(112, "Teknik Elektro", "Teknik");

        ugm.addProdi(teknikMesin, teknikElektro);

        Kantor rektorat = new Kantor("Rektorat", "Gedung Rektorat", 200);
        rektorat.setCode("011");
        Kantor dekanatTeknik = new Kantor("Dekanat Teknik", "Gedung Teknik", 100);
        dekanatTeknik.setCode("002");

        ugm.addKantor(rektorat, dekanatTeknik);

        RuangKelas kelasA = new RuangKelas("Kelas A", "Gedung Teknik", 50);
        kelasA.setCode("089");
        kelasA.setProdi(teknikElektro);
        RuangKelas kelasB = new RuangKelas("Kelas B", "Gedung Teknik", 50);
        kelasB.setCode("090V");
        kelasB.setProdi(teknikMesin);

        ugm.addRuangKelas(kelasA, kelasB);

        Dosen dosen1 = new Dosen("Dr. Anggun", 25, "Yogyakarta");
        dosen1.setNip("010");
        dosen1.setProdi(teknikMesin);

        Dosen dosen2 = new Dosen("Dr. Petri", 47, "Yogyakarta");
        dosen2.setNip("210");
        dosen2.setProdi(teknikElektro);

        ugm.addDosen(dosen1, dosen2);

        TenagaKependidikan rektor = new TenagaKependidikan("Dr. Panjiwa", 30, "Yogyakarta");
        rektor.setKantor(rektorat);
        rektor.setPosition("Rektor");

        TenagaKependidikan kaprodi = new TenagaKependidikan("Dr. Eka Patrina", 30, "Yogyakarta");
        kaprodi.setKantor(dekanatTeknik);
        kaprodi.setPosition("Kepala Prodi");

        ugm.addTenagaKependidikan(rektor, kaprodi);

        ugm.displayInformation();
    }
}
