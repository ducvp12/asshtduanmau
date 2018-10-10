package vn.edu.poly.myapplication.model;

public class TheLoai {
    private String maTheLoai;
    private String tenTheLoai;
    private String moTa;
    private String viTri;
    public TheLoai() {
    }
    public TheLoai(String maTheLoai, String tenTheLoai, String moTa, String viTri) {
        this.maTheLoai = maTheLoai;
        this.tenTheLoai = tenTheLoai;
        this.moTa = moTa;
        this.viTri = viTri;
    }
    public String getMaTheLoai() {
        return maTheLoai;
    }
    public void setMaTheLoai(String maTheLoai) {
        this.maTheLoai = maTheLoai;
    }
    public String getTenTheLoai() {
        return tenTheLoai;
    }
    public void setTenTheLoai(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }
    public String getMoTa() {
        return moTa;
    }
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    public String getViTri() {
        return viTri;
    }
    public void setViTri(String viTri) {
        this.viTri = viTri;
    }
    @Override
    public String toString() {
        return getMaTheLoai()+" | "+getTenTheLoai();
    }
}
