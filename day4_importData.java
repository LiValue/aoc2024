package day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Data {
    public char[][] puzzel;

    public Data() {
        puzzel = new char[140][204];
        vulPuzzel();
    }

    private void vulPuzzel() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/day4/advent4.txt"))) {
            String line;
            int x = 0;
            while ((line = br.readLine()) != null) 
            {
                for (int y = 0; y < line.length(); y++) 
                {
                    puzzel[x][y] = line.charAt(y);
                }
                x++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public char[][] getPuzzel() {
        return puzzel;
    }
}
