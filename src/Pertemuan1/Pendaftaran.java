package Pertemuan1;

public class Pendaftaran {
    public static void main(String[] args){
        Mahasiswa mhs = new  Mahasiswa();
        mhs.nama = "Rifki";
        mhs.nobp = "2101092030";
        mhs.kelas = "mi2b";
        mhs.prodi = "MI";
        mhs.jurusan = "TI";
                
        System.out.print("nama : " +mhs.nama+ "\n"
            +"nobp:"+mhs.nobp+"\n"
                +"kelas:"+mhs.kelas+"\n"
                    +"prodi:"+mhs.prodi+"\n"
                        +"jurusan:"+mhs.jurusan+"\n");
    
    }
}
