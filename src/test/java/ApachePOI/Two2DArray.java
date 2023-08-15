package ApachePOI;

public class Two2DArray {
    public static void main(String[] args) {
        String[][] zoo = {{"Lion", "4", "Africa"}, {"Tiger", "2"}, {"Elephant", "5", "India"}, {"Shark", "3"}};

        System.out.println(zoo[1][0]);
        System.out.println(zoo[2][1]);

        int length = zoo.length;

        for (int i = 0; i < zoo.length; i++) {
            for (int j = 0; j < zoo[i].length; j++) {
                System.out.print(zoo[i][j]+" ");
            }
            System.out.println();

        }
    }
}

