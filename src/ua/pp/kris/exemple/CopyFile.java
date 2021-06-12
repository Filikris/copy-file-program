package ua.pp.kris.exemple;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

        public static void main(String[] args) throws IOException {
            int i;

            if(args.length != 2) {
                System.out.println("copying . . .");
                return;
            }

            try ( FileInputStream fin = new FileInputStream(args[0]);
                  FileOutputStream fout = new FileOutputStream(args[1])) {
                do{
                    i = fin.read();
                    if(i != -1) {
                        if (i == 32) {
                            fout.write(45);
                        } else fout.write(i);
                    }
                } while (i != -1);
            } catch (IOException exc) {
                System.out.println(exc);
            }
        }
    }