class Player{
    //data member atau variabel instant
    String nama; //default, bisa diakses dari luar class
    public int exp; //public,bisa diakses dari luar class
    private int health; //private, tidak di akses dari luar class



    //konstruktor, tanpa modifier akses
    Player(String nama, int exp, int health){
        this.nama = nama;
        this.exp = exp;
        this.health = health;

    }


    // method, default modifier access
    void cetak(){
        kurangEXP();
        System.out.println("Player : " + this.nama);
        System.out.println("Exp : " + this.exp);
        System.out.println("Health : " + this.health);
    }


    //method,public modifier access
    public void ubahHealth(int healthBaru){
        this.health = healthBaru;
    }

    // method, private modifier access
    private void kurangEXP(){
        this.exp -= 1; // exp = exp - 1
    }
}











public class App {
    public static void main(String[] args) throws Exception {
        //instalasi objek
        Player player1 = new Player("naruto",50, 100);

        //default
        //membaca data
        System.out.println(player1.nama);
        //menulis data
        player1.nama = "sasuke";
        System.out.println(player1.nama);

        //public
        //membaca data
        System.out.println(player1.exp);
        //menulis data
        player1.exp = 90;
        System.out.println(player1.exp);

        // //private
        // //membaca data
        // System.out.println(player1.health);
        // //menulis data
        // player1.health = 120;
        //System.out.println(player1.health);

        //method default
        player1.cetak();//method baca

        //method public
        player1.ubahHealth(125);//method menulis
        player1.cetak();

        //method private
        //player1.kurangExp();
        player1.cetak();


    
    }
}
