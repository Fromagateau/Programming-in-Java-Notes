public class zMult {

    public static void main(String[] args) {

        System.out.print("\t");

        generate(10, 10);


        for (int i = 0; i <= 45; i++) {
            System.out.print("--");
        }


        System.out.print("\n\t");

        int maxRow = (int)(Math.random() * 10 + 1);
        int maxCol = (int)(Math.random() * 10 + 1);

        generate(maxRow, maxCol);


    }

    static void generate(int maxRow, int maxCol) {


        int increment = 1;

        while (increment <= maxCol) {
            System.out.printf("<%d>\t", increment);
            increment++;
        }

        System.out.println();

        for (int i = 1; i <= maxRow; i++) {

            System.out.printf("<%d>\t", i);

            int j = 1;

            while (j <= maxCol) {
                System.out.printf(" %d", j * i);
                System.out.print("\t");
                j++;
            }


            System.out.println();
        }
    }

}