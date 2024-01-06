package variousTask;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Football";
		String k="Cricket";
		String b="Volleyball";
		String c="Rugby";
		//asending order
		String s1[]= {"Football","Cricket","Volleyball","Rugby"};
		String temp;
		
		for(int i=0; i<s1.length; i++)
		{
			String num1=s1[i];
			//System.out.println(s1[i]);
			for (int j = i + 1; j < s1.length; j++) {

				if (s1[j].compareTo(s1[i]) < 0) {

					temp = s1[i];

					s1[i] = s1[j];

					s1[j] = temp;

				}
		}
		System.out.println(s1[i]);
	}

}
}