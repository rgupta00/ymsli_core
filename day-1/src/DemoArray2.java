
public class DemoArray2 {

	public static void main(String[] args) {

		int arr[][][]=new int[5][4][2];
		
		for(int temp[][]: arr) {
			for(int temp2[]: temp) {
				for(int val: temp2) {
					System.out.println(val);
				}
				System.out.println();
			}
		}
		
	//	int arr[][][]=new int[5][4][2];
		
		
		
		//int arr[][] = new int[5][3];

	/*	for(int i=0;i< arr.length;i++) {
			int temp[]=arr[i];
			for()
		}*/
		
		/*for (int temp[] : arr) {
			for (int val : temp) {

				System.out.print(val + " ");
			}
			System.out.println();
		}*/

	}
}