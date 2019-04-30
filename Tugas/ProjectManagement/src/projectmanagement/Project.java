package projectmanagement;

public class Project {
    String namaProject, deadline;
    int harga;
    Client client;
    Tahapan tahapan[] = new Tahapan[9];

    public Project(String namaProject, String deadline, int harga, Client client){
        this.namaProject = namaProject;
        this.deadline = deadline;
        this.harga = harga;
        this.client = client;
    }
    
    public String toString(){
        return "Bangunan " + namaProject + " direncanakan selesai pada " + deadline +
               " dengan budget " + harga + " dimiliki oleh client " + client.getNamaClient();
    }
}
