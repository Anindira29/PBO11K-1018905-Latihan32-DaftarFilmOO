/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Prrogram daftar film
 */
public class Film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying(){
        System.out.println("Judul film\t:"+filmName);
        System.out.println("Genre film\t:"+filmGenre);
        System.out.println("Rating film\t:"+filmRating);
        System.out.println("Durasi Film\t:"+filmDuration+"Menit");
        
    }
}
