package projectmanagement;

public class Tahapan {
    String namaTahapan, waktuMulai, waktuSelesai;
    Staff staff;
    
    public Tahapan(String namaTahapan, String waktuMulai, String waktuSelesai, Staff staff){
        this.namaTahapan = namaTahapan;
        this.waktuMulai = waktuMulai;
        this.waktuSelesai = waktuSelesai;
        this.staff = staff;
    }
    
    public String toString(){
        return "Tahapan " + namaTahapan + " diawali pada tanggal " + waktuMulai +
               " dan diakhiri pada " + waktuSelesai + " dengan penanggungjawab " +
               staff.getNamaStaff();
    }
}
