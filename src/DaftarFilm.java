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
 * Deskripsi: program daftar film
 */
public class DaftarFilm {
    public static Film f = new Film();
   public static void tampil(String n, String g, double r, int d){
       f.filmName = n;
       f.filmGenre = g;
       f.filmRating = r;
       f.filmDuration = d;
       f.nowPlaying();
       
   }
    public static void main(String[] args) {
        // TODO code application logic here
        tampil("Venom ","Action, Horor, Scifi",8.5,120);
        tampil("Small foot ","Animation", 9.0,96);
        tampil("Crazy rich asian ","comedy", 7.8,119);
        tampil("Asih ","Horor", 6.0,100);
    }
    
}
