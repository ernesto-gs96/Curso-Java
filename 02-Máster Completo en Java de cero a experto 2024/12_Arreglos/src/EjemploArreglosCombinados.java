public class EjemploArreglosCombinados {
    public static void main(String[] args) {
        int[] a,b,c;
        a = new int[12];
        int totalA = a.length;
        b = new int[totalA];
        c = new int[totalA*2];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = (i+1)*5;
        }

        int aux = 0;
        for (int i = 0; i < b.length; i++) {
            c[aux++] = a[i];
            c[aux++] = b[i];
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i++] + ": " + c[i]);
        }

        int nVeces = 3;
        aux = 0;
        for (int i = 0; i < totalA; i+=nVeces) {
            for (int j = 0; j < nVeces; j++) {
                c[aux++] = a[i+j];
            }
            for (int j = 0; j < nVeces; j++) {
                c[aux++] = b[i+j];
            }
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < nVeces; j++) {
                if ((i+1+nVeces) > c.length) break;
                System.out.println(c[i] + " " + c[(i++)+nVeces]);
            }
        }
    }
}
