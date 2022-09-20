package exercise_fflowerroot.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class n1748_2 {
	public static void main(String[] args) {

	}

	public int sumOfUnique(int[] nums) {
		return Arrays.stream(nums)   //IntStream interface 타입의 객체. 
				.boxed()  //Returns a Stream consisting of the elements of this stream, each boxed to an Integer. /Stream<Integer> ?
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()))
				//<Map<Integer, Long>, Object> Map<Integer, Long> java.util.stream.Stream.collect(Collector<? super Integer, Object, Map<Integer, Long>> collector)
				
//				 public static <T, K, A, D>
//			    Collector<T, ?, Map<K, D>> groupingBy(Function<? super T, ? extends K> classifier,
//			                                          Collector<? super T, A, D> downstream) {
//			        return groupingBy(classifier, HashMap::new, downstream);
//			    }
				.entrySet()   //Map에는 stream()메서드가 없어서 셋으로 변경해서 스트림으로변경.
				.stream()
				.filter(e -> e.getValue() == 1)
				.mapToInt(e -> e.getKey())
				.sum();
	}
}
















