import java.util.ArrayList;
import java.util.List;

public class subs {
	public static void main(String[] args) {
		int[] array = {1,3,1,6,7,2,1,5,7,8,4,11};
		System.out.println(findLIS(array));
	}
	public static List<Integer> findLIS(int[] array)
	{
		    List<Integer> longest = new ArrayList<>();
		    List<Integer> current = new ArrayList<>();

		    int previous = Integer.MAX_VALUE;
		    for (int value : array) {
		        if (value <= previous) {
		            if (longest.size() < current.size()) {
		                longest = current;
		            }
		            current = new ArrayList<>();
		        }
		        current.add(value);
		        previous = value;
		    }

		    return longest.size() < current.size() ? current : longest;
		}
}