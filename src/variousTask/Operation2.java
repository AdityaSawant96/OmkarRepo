package variousTask;

public class Operation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[]sample = {"system","ending","ground","singh","glass"};

for(int i=0; i<sample.length; i++)
{
	//System.out.println(sample[i]);
	//sample[i].charAt(i);
	if(sample[i].charAt(0)=='s'|| sample[i].charAt(sample[i].length()-1)=='g')
	{
		System.out.println(sample[i]);
	}
}
	}

}
