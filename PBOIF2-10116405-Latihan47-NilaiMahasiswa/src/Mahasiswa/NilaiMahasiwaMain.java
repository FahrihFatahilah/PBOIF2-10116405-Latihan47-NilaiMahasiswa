package Mahasiswa;
/**
 * @author Fahrih Fatahilah
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116405
 * Deskripsi Program : Nilai Mahasiswa 
*/
public class NilaiMahasiwaMain {
    public static void main(String[] args) {
        NilaiMahasiswa mahasiswa = new NilaiMahasiswa(75, 45, 34);
        
        System.out.printf("QUIZ       : %.1f\n",mahasiswa.getNilaiQuiz());
        System.out.printf("UTS        : %.1f\n",mahasiswa.getNilaiUTS());
        System.out.printf("UAS        : %.1f\n\n",mahasiswa.getNilaiUAS());
        
        mahasiswa.setNilaiAkhir(mahasiswa.getNilaiQuiz(),mahasiswa.getNilaiUTS(),mahasiswa.getNilaiUAS());
        System.out.printf("Nilai Akhir   : %.1f\n\n",mahasiswa.getNilaiAkhir());
        
        mahasiswa.setIndex(mahasiswa.getNilaiAkhir());
        System.out.printf("Index   : %s\n",mahasiswa.getIndex());
        
        mahasiswa.setKeterangan(mahasiswa.getIndex());
        System.out.printf("Keterangan   : %s\n",mahasiswa.getKeterangan());
        
    }
    
}
