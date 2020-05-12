public class PascalsTriangle {
    public static void main(String[] args) {
        int[][] triangle = new int[10][];
        triangle[0] = new int[]{1};
        triangle[1] = new int[]{1, 1};
        for (int i = 2; i < triangle.length; i++)
        {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][triangle[i].length - 1] = 1;
            for (int j = 1; j < triangle[i].length - 1; j++)
            {
                triangle[i][j] = triangle[i - 1] [j - 1] + triangle[i - 1][j];
            }
        }
        for (int[] i: triangle)
        {
            for (int j: i)
            {
                System.out.print(j + " ");
            }
        }
        System.out.println();

    }
}
