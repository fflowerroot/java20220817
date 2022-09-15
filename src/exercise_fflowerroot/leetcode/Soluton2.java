package exercise_fflowerroot.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Soluton2 {
	public static void main(String[] args) {

//		int rowIndex = 2;
//		List<Integer> l = new ArrayList<Integer>(rowIndex+1);
//		
//	while(l.size()==rowIndex+1) {
//			l.add(0,1);
//			l.add(l.size()-1,1);
//			l.add(1,l.get(0)+l.get(1));
//			l.add(l.size()-2,l.size()-2);
//			
//			
//	}
//	
//	int[] a = new int[rowIndex+1];
//		a[0]=1;
//		a[a.length-1]=1;
//		
//		for(int i=0;;i++) {
//			
//		}

		System.out.println(minimumAbsDifference(new int[] { 4, 3, 2, 1 }));
		

	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ll = new ArrayList<List<Integer>>();
		for (int ii = 0; ii <= numRows; ii++) {

			int rowIndex = ii;
			List<Integer> row = new ArrayList<>();
			row.add(1);

			for (int i = 0; i < rowIndex; i++) {
				List<Integer> next = new ArrayList<>();
				next.add(1);
				for (int j = 1; j < row.size(); j++) {
					next.add(row.get(j) + row.get(j - 1));
				}
				next.add(1);
				row = next;
			}
			ll.add(row);
		}
		return ll;
	}

	public static List<List<Integer>> minimumAbsDifference(int[] arr) {
		List<List<Integer>> list2 = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<>();

		for (int i : arr) {
			list.add(i);
		}
		list.sort(Comparator.naturalOrder());

		int d = Integer.MAX_VALUE;

		for (int i = 0; i < list.size() - 1; i++) {
			if (Math.abs(list.get(i) - list.get(i + 1)) < d) {
				d = Math.abs(list.get(i) - list.get(i + 1));
				List<Integer> tmpList = new ArrayList<>();
				tmpList.add(list.get(i));
				tmpList.add(list.get(i + 1));
				List<List<Integer>> list3 = new ArrayList<List<Integer>>();
				list3.add(tmpList);
				list2 = list3;
	//			System.out.println(list2); ///////
			} else if (Math.abs(list.get(i) - list.get(i + 1)) == d) {
				List<Integer> tmpList = new ArrayList<>();
				tmpList.add(list.get(i));
				tmpList.add(list.get(i + 1));
				list2.add(tmpList);
			}
			// abs differ
			// if diff smaller > list2 모두삭제하고 추가.
			// 같으면 뒤에 추가.
			// 크면 아무일x
		}
		return list2;
	}
}
//2363


