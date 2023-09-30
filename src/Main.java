//package Application;
import Application.Album;
import Application.Song;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Listenify world");
        Album album1 = new Album("New Hindi Song","Arijit Singh");

        album1.addNewSongToAlbum("Tum hi ho",3.5);
        album1.addNewSongToAlbum("What jumka",4.2);
        album1.addNewSongToAlbum("Kesariya",5.2);
        album1.addNewSongToAlbum("Shayad",6.0);

        Album album2 = new Album("Old Hindi Songs","Kishor Kumar");
        album2.addNewSongToAlbum("neele neele ambar par",5.6);
        album2.addNewSongToAlbum("Mere mehaboob qayamat",6.2);
        album2.addNewSongToAlbum("ek chatur naar",6.2);
        album2.addNewSongToAlbum("Mere Sapanon ki Rani",3.4);

        List<Song> playList = new ArrayList<>();

        album1.addSongToPlayList(1,playList);
        album1.addSongToPlayList(4,playList);
        album2.addSongToPlayList("Mere mehaboob qayamat",playList);
        album2.addSongToPlayList("neele neele ambar par",playList);

        for(Song song:playList){
            System.out.println(song.toString());
        }
    }
    public static void printMenu(){

        System.out.println("There are the option you can choose from");
        System.out.println("1.Goto and play next Song");
        System.out.println("2.Goto the previous Song");
        System.out.println("3.Repeat the same Song");
        System.out.println("4.Show all songs of playList");
        System.out.println("5.Print the Menu");
        System.out.println("6.Delete the current song");
        System.out.println("7.Shuffle the playList");
        System.out.println("Exit the playList");


    }
}