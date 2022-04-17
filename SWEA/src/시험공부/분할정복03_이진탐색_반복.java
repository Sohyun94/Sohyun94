//헷갈리니까 정리 잘해 놓기
public class 분할정복03_이진탐색_반복 {
	// boolean 반환: 있는지 없는지 확인
	// int 반환 : 해당 인덱스 반환
	static boolean binarySearch(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			
			// int mid2 = left + (right-left)/2; //오버 플로우 막으려고
			if (arr[mid] == key)
				return true;
			else if (arr[mid] > key)
				//키 값보다 mid가 크니까 right가 당겨져야 됨
				right = mid - 1;
			else
				left = mid + 1;
		}

		return false;

	}

	public static void main(String[] args) {
		// 정렬이 되어 있다 가정
		int[] arr = { 1, 7, 9, 13, 19, 28, 31, 39, 41 };
		
		if(binarySearch(arr, 1)) {
		System.out.println("찾음");
		} else {
			System.out.println("못 찾음");
		}

	}

}
