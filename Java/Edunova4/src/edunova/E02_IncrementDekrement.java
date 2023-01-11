package edunova;

public class E02_IncrementDekrement {
	public static void main(String[] args) {

		int i = 1;
		i = i + 4;
		System.out.println(i);

		i += 1;
		i += 3;
		System.out.println(i);

		i++;
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);

		int t = 2, k = 1, z;
		z = k + t++;
		k += z + 1;
		System.out.println(t+z+k);
	}
}
