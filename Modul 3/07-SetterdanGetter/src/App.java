class Data{
    //data member atau variabel instant
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    // construktor, modifier public
    public Data(){
        this.intPublic = 0;
        this.intPrivate = 100;
    }

    // Getter
    public int getIntPrivate(){
        return this.intPrivate;
    }

    //setter
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }

    //method cetak
    void cetak(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }


}






public class App {
    public static void main(String[] args) throws Exception {
        //
        Data objek = new Data();

        //
        //tulis
        objek.intPublic = 5;
        System.out.println("Pubic : " + objek.intPublic);

        // membaca mengunakan getter
        int angka = objek.getIntPrivate();
        System.out.println("getter : " + angka);

        // menulis mengunakan setter
        objek.setDoublePrivate(0.05);
        objek.cetak();
    }
}
