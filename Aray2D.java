package arrayPgms;

public class Aray2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr[][] = {{10,20,30},{40,50},{70,80,20}};
	int sizeouter = arr.length;
	for(int i = 0;i<sizeouter;i++) {
		int size = arr[i].length;
		for(int j = 0;j<size;j++) {
			System.out.println(arr[i][j]);
		}
	
	}
		

	}

}
