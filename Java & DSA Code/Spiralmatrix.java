public class Spiralmatrix {
    public static void spiralmatrix(int matrix[][]){
        int startrow=0, endrow=matrix.length-1, startcol=0, endcol=matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int i=startcol;i<=endcol;i++){
            System.out.print(matrix[startrow][i]+" ");
            }
            //right
            for(int i=startrow+1;i<=endrow;i++){
            System.out.print(matrix[i][endcol]+" ");
            }
            //bottom
            for(int i=endcol-1;i>=startcol;i--){
            System.out.print(matrix[endrow][i]+" ");
            }
            //left
            for(int i=endrow-1;i>startrow;i--){
            System.out.print(matrix[i][startrow]+" ");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
        
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        spiralmatrix(matrix);
    }
}
