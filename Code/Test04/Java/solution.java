package test01;

public class solution {
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        //ensure m<=n
        if(m>n){
            // return findMedianSortedArrays(nums2,nums1);
            int[] temp = nums1; nums1 = nums2; nums2 = temp;
            int tmp = m; m = n; n = tmp;
        }

        int iMin = 0,iMax = m,halfLen = (m+n+1)/2;
        while(iMin<=iMax){
            int i =(iMin+iMax)/2;
            int j =halfLen - i;
            if(i<iMax&&nums2[j-1]>nums1[i]){
                iMin = i+1;// i is too small
            }
            else if(i>iMin&&nums1[i-1]>nums2[j]){
                iMax = i-1;// i is too big
            }
            else{
                int maxLeft = 0;
                if(i==0){
                    maxLeft = nums2[j-1];
                }
                else if(j==0){
                    maxLeft = nums1[i-1];
                }
                else{
                    maxLeft = Math.max(nums1[i-1],nums2[j-1]);
                }
                if((m+n)%2==1){
                    return maxLeft;//奇数个中位数为maxLeft
                }

                int minRight = 0;
                if(i==m){
                    minRight = nums2[j];
                }
                else if(j==n){
                    minRight = nums1[i];
                }
                else{
                    minRight = Math.min(nums2[j],nums1[i]);
                }
                return (maxLeft+minRight)/2.0;
            }
        }
        return 0.0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A= {1,2,3};
		int[] B= {4,5};
		double result = 0;
		result = findMedianSortedArrays(A,B);
		
		System.out.println("The Result is:");

	}

}
