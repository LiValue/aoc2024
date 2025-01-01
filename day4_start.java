package day4;

public class Start {

    static int total = 0;
    static char[][] puzzel;

    public static void main(String[] args) {
        Data data = new Data();
        puzzel = data.getPuzzel();

        for (int x = 0; x < 140; x++) {
            for (int y = 0; y < 204; y++) {
                if (puzzel[x][y] == 'A' && x!=0 && x!= 139 && y!= 0 && y!= 203) {
//			--- PART 1 ---
//                    xnym(x, y);
//                    xnyp(x, y);
//                    xmyn(x, y);
//                    xpyn(x, y);
//                    xpyp(x, y);
//                    xmym(x, y);
//                    xpym(x, y);
//                    xmyp(x, y);
                	
//			--- PART 2 ---
                	
                	if(((puzzel[x-1][y-1]=='M'&&puzzel[x+1][y+1]=='S')||(puzzel[x-1][y-1]=='S'&&puzzel[x+1][y+1]=='M'))&&((puzzel[x-1][y+1]=='M'&&puzzel[x+1][y-1]=='S')||(puzzel[x-1][y+1]=='S'&&puzzel[x+1][y-1]=='M')))
                		total++;
                	
                	
                }
            }
        }

        System.out.println("Total: " + total);
    }

    public static void xnym(int x, int y) {
        if (y - 3 >= 0 && puzzel[x][y - 1] == 'M' && puzzel[x][y - 2] == 'A' && puzzel[x][y - 3] == 'S') {
            total++;
        }
    }

    public static void xnyp(int x, int y) {
        if (y + 3 < 204 && puzzel[x][y + 1] == 'M' && puzzel[x][y + 2] == 'A' && puzzel[x][y + 3] == 'S') {
            total++;
        }
    }

    public static void xmyn(int x, int y) {
        if (x - 3 >= 0 && puzzel[x - 1][y] == 'M' && puzzel[x - 2][y] == 'A' && puzzel[x - 3][y] == 'S') {
            total++;
        }
    }

    public static void xpyn(int x, int y) {
        if (x + 3 < 140 && puzzel[x + 1][y] == 'M' && puzzel[x + 2][y] == 'A' && puzzel[x + 3][y] == 'S') {
            total++;
        }
    }

    public static void xpyp(int x, int y) {
        if (x + 3 < 140 && y + 3 < 204 && puzzel[x + 1][y + 1] == 'M' && puzzel[x + 2][y + 2] == 'A' && puzzel[x + 3][y + 3] == 'S') {
            total++;
        }
    }

    public static void xmym(int x, int y) {
        if (x - 3 >= 0 && y - 3 >= 0 && puzzel[x - 1][y - 1] == 'M' && puzzel[x - 2][y - 2] == 'A' && puzzel[x - 3][y - 3] == 'S') {
            total++;
        }
    }

    public static void xpym(int x, int y) {
        if (x + 3 < 140 && y - 3 >= 0 && puzzel[x + 1][y - 1] == 'M' && puzzel[x + 2][y - 2] == 'A' && puzzel[x + 3][y - 3] == 'S') {
            total++;
        }
    }

    public static void xmyp(int x, int y) {
        if (x - 3 >= 0 && y + 3 < 204 && puzzel[x - 1][y + 1] == 'M' && puzzel[x - 2][y + 2] == 'A' && puzzel[x - 3][y + 3] == 'S') {
            total++;
        }
    }
}
