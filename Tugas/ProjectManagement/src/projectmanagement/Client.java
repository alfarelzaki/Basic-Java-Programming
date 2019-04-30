package projectmanagement;
/**
 * 
 * @author Alfarel
 */
public class Client {
    private String idClient, alamat, noTelp;
    /**
     * nama perusahaan milik client
     * 
     */
    String nama;
    
    /**
     * 
     * @param idClient ini adalah idClient, id client harus berbeda2
     * @param nama nama client
     * @param alamat tempat tinggal client
     * @param noTelp nomor telepon yang bisa dihubungi
     */
    public Client(String idClient, String nama, String alamat, String noTelp){
        this.idClient = idClient;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }
    
    public String toString(){
        return "Client " + nama + " dengan nomor " +
               idClient + ", beralamatkan di " + alamat +
               ", no HP " + noTelp;
    }
    
    public void setAlamatClient(String alamat){
        this.alamat = alamat;
    }
    
    /**
     * 
     * @return ini bakal ngembaliin nama Client
     */
    public String getNamaClient(){
        return nama;
    }
}

    
