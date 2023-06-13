
package penilaian;


public class NilaiAkhir extends mahasiswa{
    int uts;
    int uas;
    int tugas;
    
    @Override
    public void uts (int Uts){
        uts=Uts;
        System.out.println("nilai uts = " +Uts);
    }
    
    @Override
    public void uas (int Uas){
        uas=Uas;
        System.out.println("nilai uas = " +Uas);
    }
    
     @Override
    public void tugas (int Tugas){
        tugas=Tugas;
        System.out.println("nilai tugas = " +Tugas);
    }
}