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
public class Nilai {
    private int uts, uas;
    private Mahasiswa mahasiswa;

    public Nilai(Mahasiswa mahasiswa, int uts, int uas) {
        this.uts = uts;
        this.uas = uas;
        this.mahasiswa = mahasiswa;
    }

    public Nilai() {
    }

    public int getUts() {
        return uts;
    }

    public void setUts(int uts) {
        this.uts = uts;
    }

    public int getUas() {
        return uas;
    }

    public void setUas(int uas) {
        this.uas = uas;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
    
    
}
