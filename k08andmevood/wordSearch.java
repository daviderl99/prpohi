import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class wordSearch{
    public static void main(String[] arg) throws Exception {
        String file = "sample.txt";
        Scanner reader = new Scanner(System.in);
        System.out.print("Otsitav sõna: ");
        String searchable = reader.nextLine();
        searchable = searchable.toLowerCase().replaceAll(" ", "");
        BufferedReader br = new BufferedReader(new FileReader(file));

        int count = 0;
        String line = br.readLine();
        while (line != null){
            String[] wordList = line.toLowerCase().split(" ");
            for (String wl: wordList){
                if (wl.equals(searchable)){
                    count++;
                }
            }
            line = br.readLine();
        }
        if (count != 0){
            System.out.print("Sõna '" + searchable + "' leiti " + count);
            switch(count){
                case 1: 
                    System.out.print(" korra");
                    break;
                default:
                    System.out.print(" korda");
                    break;
            }
            // if (count == 1){
            //     System.out.print(" korra");
            // }
            // else{
            //     System.out.print(" korda");
            // }
        }
        else{
            System.out.print("Sõna '" + searchable + "' ei leitud");
        }
        System.out.println();
    }
}