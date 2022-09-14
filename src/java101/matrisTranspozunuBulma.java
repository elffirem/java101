package java1011;

public class matrisTranspozunuBulma {

	public static void main(String[] args) {
		int[][] matrix= {{1,2,3},{4,5,6}};
		int r=matrix[0].length;
		int c=matrix.length;
		int[][] newMatrix= new int[r][c];
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				newMatrix[j][i]=matrix[i][j];
			}
		}
		for(int[] i:newMatrix) {
			for(int j:i) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		

	}

}
