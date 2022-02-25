package Merge;

public class Merge_sort {

	private static void merge_sort(int[] arr) {
		int[] tmp = new int[arr.length];
		merge_sort(arr, tmp, 0, arr.length - 1);

	}

	private static void merge_sort(int[] arr, int[] tmp, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			merge_sort(arr, tmp, start, mid);
			merge_sort(arr, tmp, mid + 1, end);
			merge(arr, tmp, start, mid, end);
		}
	}

	private static void merge(int[]arr,int[]tmp,int start,int mid, int end) {
		for(int i=start;i<=end;i++) {
			tmp[i]=arr[i];
		}
		int part1 =start;
		int part2 =mid+1;
		int index = start;
		while(part1<=mid&&part2<=end) {
			if(tmp[part1]<=tmp[part2]) {
				arr[index]=tmp[part1];
				part1++;
			}else {
				arr[index]=tmp[part2];
				part2++;
			}
			index++;
		}
		 for(int i=0;i<=mid-part1;i++) {
			arr[index+i]=tmp[part1+i];
		}
	}
	private static void printArray(int[] arr) {
		for(int data:arr) {
			System.out.print(data+",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 6, 3, 2, 4, 6, 1, 8, 9 };
		printArray(arr);
		merge_sort(arr);
		printArray(arr);
		
		}
	}


