package Exercise;

public class TestIncrement {

	public static void main(String[] args) {
		int i; // declaration of variable i
		int iInc; // declaration of variable iInc
		// postfix increment
		{
			i = 3; // assign value to variable i
			iInc = i++;
			System.out.println("Postfix: the value in iInc = " + iInc); // print out the result
			System.out.println("Postfix: the value in i = " + i); // print out the result
		}
		// prefix increment
		{
			i = 3; // re-assign value to variable i to compare postfix and prefix result
			iInc = ++i;
			System.out.println("Prefix: the value in iInc = " + iInc); // print out the result
			System.out.println("Prefix: the value in i = " + i); // print out the result
		}

	}

}
