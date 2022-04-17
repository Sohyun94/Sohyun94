import java.util.Arrays;

public class 분할정복07_퀵정렬_호어파티션 {

	public static void main(String[] args) {
		int[] arr = {7, 8, 3, 1, 43, 23, 98, 65, 12, 43};
		
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

	static void quickSort(int[] arr, int left, int right) {
		if(left < right) {
			int pivot = partition(arr, left, right);
			quickSort(arr, left, pivot-1);
			quickSort(arr, pivot+1, right);
		}
	}

	private static int partition(int[] arr, int left, int right) {
		int pivot = arr[left];
		int L = left + 1, R = right;
		int tmp;

		while (L <= R) {
			// L: pivot보다 큰 값을 찾을 때까지 이동
			// 여기에 제한 범위 두지 않으면 인덱스 에러 날 수 있으므로 유의하기
			while (L <= R && arr[L] <= pivot)
				L++;
			// R: pivot보다 작거나 같은 값을 만날 때까지 이동
			while (arr[R] > pivot)
				R--;
			// 아직 교차가 안 됐다면 더 해 볼 게 남음, 일단 서로 교환
			if (L < R) {
				tmp = arr[L];
				arr[L] = arr[R];
				arr[R] = tmp;
			}
		}
		// pivot이 가리키는 값과 R이 가리키는 값을 바꾸어 pivot 위치 결정
		tmp = arr[left]; // tmp = pivot
		arr[left] = arr[R];
		arr[R] = tmp;

		return R; // 피봇 가리킴
	}

}
