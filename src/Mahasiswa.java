
public class Mahasiswa {
    String nama,nobp,kelas,prodi,jurusan;
    
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
        
        Mahasiswa mhs2 = new  Mahasiswa();
        mhs2.nama = "Rifki";
        mhs2.nobp = "2101092030";
        mhs2.kelas = "mi2b";
        mhs2.prodi = "MI";
        mhs2.jurusan = "TI";
                
        System.out.print("nama : " +mhs2.nama+ "\n"
            +"nobp:"+mhs2.nobp+"\n"
                +"kelas:"+mhs2.kelas+"\n"
                    +"prodi:"+mhs2.prodi+"\n"
                        +"jurusan:"+mhs2.jurusan+"\n");
        
    }
}
