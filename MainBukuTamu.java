import java.util.Scanner;
public class MainBukuTamu {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        System.out.println("======================================");
        System.out.println("          DAFTAR BUKU TAMU            ");
        System.out.println("======================================");
//        int q=0;
        BukuTamu1 a= new BukuTamu1();
        for(int i=0;i<10;i++){   
        System.out.print("Masukkan nama : ");
        String nama = in.next();
        a.setnama(nama);
        a.getNama();
        System.out.print("Masukkan alamat : ");
        String alamat= in.next();
        a.setalamat(alamat);
        a.getAlamat();
        System.out.print("Masukkan telepon : ");
        String no= in.next();
        a.setnotelp(no);
        a.getNotelp();
        a.tampil();
        }
        a.Jumlah();
//        BukuTamu.nama(nama,q);
//        BukuTamu.getNama();
//        BukuTamu.alamat(alamat,q);
//        BukuTamu.getAlamat();
//        BukuTamu.notelp(no,q);
//        BukuTamu.getNotelp();
//        BukuTamu.tampil();
//        q++;
        }
        
    
}
