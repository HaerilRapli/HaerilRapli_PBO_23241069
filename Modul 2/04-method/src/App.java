
class Mahasiswa {
    // Data member atau ciri
    String nama;
    String NIM;

    //construktor
    Mahasiswa (String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;

    }
    

    // method tanpa return dan tanpa parameter
    void cetak(){
        System.out.println("nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);

    }

    // method dengan parameter dan tanpa return
    void setNama(String nama){
        this.nama = nama;
    }

    // method dengan return dan tanpa parameter
    String getNama(){
        return this.nama;

    }

    String getNIM(){
        return this.NIM;
    }

    //methot dengan parameter dan return
    String SayHello(String pesan){
        return "Hello" + this.nama + pesan;
    }
}



public class App {
    public static void main(String[] args) throws Exception {
        //membuat objek
        Mahasiswa mhs_1 = new Mahasiswa("haeril", "12345678");

        //memanggil method tanpa parameter dan return
        mhs_1.cetak();

        //memanggil method dengan parameter tanpa return
        mhs_1.setNama("ucup");
        mhs_1.cetak();

        System.out.println(mhs_1.getNama());
        System.out.println(mhs_1.getNIM());

        // memangil method parameter dan return
        String pesan = mhs_1.SayHello("sukses belajar pbo");
        System.out.println(pesan);

    }
}
