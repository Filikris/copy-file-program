package ua.pp.kris.exemple;

import java.io.*;

public class CopyFile {

        public static void main(String[] args) throws IOException {
            String i;

            if(args.length != 2) {
                System.out.println("copying . . .");
                return;
            }

            try (BufferedReader br = new BufferedReader(new FileReader(args[0]));
            FileWriter fw = new FileWriter(args[1]))
            {
                do {
                    i = br.readLine();
                    if(i != null) {
                        fw.write(i.replace(' ', '-'));
                    }
                } while (i != null);
            } catch (IOException exc) {
                System.out.println(exc);
            }
        }
    }