
package projectmanagement;

public class Staff {
    private String idStaff, nama, alamat;
    
    public Staff(String idStaff, String nama, String alamat){
        this.idStaff = idStaff;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public String toString(){
        return "Staff " + nama + " dengan nomor " + idStaff +
               " beralamatkan di " + alamat;
    }
    
    public void setAlamatStaff(String alamat){
        this.alamat = alamat;
    }
    
    /**
     * 
     * @return bakal nge-outputkan nama staff 
     */
    public String getNamaStaff(){
        return nama;
    }
}
