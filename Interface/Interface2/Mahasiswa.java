/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface2;

/**
 *
 * @author Irenius Kristanto
 */
public class Mahasiswa extends Penduduk {
    private String nim;

    public Mahasiswa(String nama, String nim, String tempatLahir, String tanggalLahir) {
        super(nama, tempatLahir, tanggalLahir);
        this.nim = nim;
    }   

    public Mahasiswa() {
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
