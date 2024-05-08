package pkg.university.academic;

public class Prodi {
    private int code;
    private String name;
    private String fakultas;

    public Prodi(int code, String name, String fakultas) {
        this.code = code;
        this.name = name;
        this.fakultas = fakultas;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getFakultas() {
        return this.fakultas;
    }
}