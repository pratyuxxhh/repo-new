public class StairCaseSearch {
    public static void main(String[] args) {
        int [][]matrix = {{10,20,30,40,50},{15,25,35,42,52},{27,28,36,46,65},{29,30,37,48,70},{32,33,39,50,80}};
        int row = matrix.length-1;
        int col = 0;
        int key = 20;
        for(int i = 0;i<matrix.length*matrix.length;i++){
            if(matrix[row][col]== key){
                System.out.println("("+row+","+col+")");
                break;
            }
            if (matrix[row][col]<key) {
                col++;
                System.out.println("right");
            }
            else{
                row--;
                System.out.println("up");
            }
        }
    }
}
