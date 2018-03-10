package list;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {

		int data[] = {89,33,67};
		String msg[] = {"あいだ","すきま","ますく"};


		ArrayList<String> a = new ArrayList<String>(100);

		for(int i = 0;i<102;i++){


			a.add(new Integer(i).toString());
			System.out.println(a.get(i));
		}



		for(String space:msg){
			System.out.println(space);
			for(int seiseki:data){
				System.out.println(seiseki);
			}
		}

	}

}
