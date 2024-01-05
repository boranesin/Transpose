public class Main {
    public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] transpozeMatris = transpozAl(matris);

        // Transpoze matrisi yazdır
        for (int i = 0; i < transpozeMatris.length; i++) {
            for (int j = 0; j < transpozeMatris[0].length; j++) {
                System.out.print(transpozeMatris[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Matrisin transpozunu alacak metod
    public static int[][] transpozAl(int[][] matris) {
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        int[][] transpozeMatris = new int[sutunSayisi][satirSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpozeMatris[j][i] = matris[i][j];
            }
        }

        return transpozeMatris;
    }
}