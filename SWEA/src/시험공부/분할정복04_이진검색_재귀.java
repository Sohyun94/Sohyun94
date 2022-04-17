public class 분할정복04_이진검색_재귀 {
	// boolean 반환 : 있는지 없는지 쳌
	// int 반환 : 해당 인덱스를 반환
	static boolean binarySearch(int[] arr, int left, int right, int key) {
		if (left > right)
			return false; // 못찾았어.
		else {
			int mid = (left + right) / 2;
			
			//찾았다.
			if (arr[mid] == key) {
				return true;
			} else if (arr[mid] > key) {
				//왜 right의 값이 바뀌는지
				return binarySearch(arr, left, mid - 1, key);
			} else {
				//왜 left 값이 바뀌는지 
				return binarySearch(arr, mid + 1, right, key);
			}
		}

	}

	public static void main(String[] args) {

		// 정렬이 되어 있다 라고 가정.
		int[] arr = { 1, 7, 9, 13, 19, 28, 31, 39, 41 };

		if (binarySearch(arr, 0, arr.length - 1, 4)) {
			System.out.println("찾았다.");
		} else {
			System.out.println("못찾았다.");
		}
	}
}