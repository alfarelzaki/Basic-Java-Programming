package ojekonline;

/**
 *
 * @author Alfarel Zaki
 */
public class Driver extends User {
    public Driver (String username, String password, int saldo){
        super(username, password, saldo);
    }
    
    void tambahSaldo(int tambah){
        saldo += tambah;
    }
    
    public String toString(){
        return "Driver" + "\n" +
               "--------------------" + "\n" + super.toString() + "\n";
    }
}
