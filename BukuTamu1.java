
public class BukuTamu1 {
private static int ID=1;
private static final int jumlahtamu=10;
private String nama, alamat, notelp;
private static int increment;
    
public BukuTamu1(){
    nama=" ";
    alamat=" ";
    notelp=" ";
    increment++;
}
public void setnama(String nama) {
        this.nama=nama;
    }
public String getNama (){
    return nama;
}
public void setalamat(String alamat){
    this.alamat=alamat;
}
public String getAlamat(){
    return alamat;
}
public void setnotelp(String notelp){
    this.notelp=notelp;
}
public String getNotelp(){
    return notelp;
}
public static int getJumlahtamu(){
    return jumlahtamu;
}
public static int getincrement(){
    return increment;
}
public void tampil(){
    System.out.println("======================================================");
    System.out.println("ID\tNAMA\tALAMAT\t\tNO TELEPON");
    System.out.println("======================================================");
    System.out.println(ID+++"\t"+getNama()+"\t"+getAlamat()+"\t\t"+getNotelp());
}
public void Jumlah(){
    getincrement();
    System.out.println("Jumlah Tamu: "+getJumlahtamu());
}

   
}