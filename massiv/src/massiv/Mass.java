package massiv;

public class Mass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] mas = new int[]{7, 0, 6, 5, 0, 6, 8, 3, 0};
	        int kol = 0;
	        for (int i = mas.length; i > 0; i--) {
	            if (mas[i] == 0) {
	                kol++;
	            }
	        }

	}

}
