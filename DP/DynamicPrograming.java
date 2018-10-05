package DP;

public class DynamicPrograming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//
	
	//Count longest Increasing Subsequence
	public static int countlis(int[] arr){
        int[] res = new int[arr.length];
        res[0]=1;
        int max;
        for(int i=1;i<arr.length;i++){
            max = 0;
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i] && res[j]>max){
                    max = res[j];
                }
            }
            res[i] = max+1;
        }
        max = res[0];
        for(int j=1;j<arr.length;j++){
            if(res[j]>max){
                max = res[j];
            }
        }
        return max;
    }
}
