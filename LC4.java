
public class LC4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length<nums2.length){
            int[] temp = nums2;
            nums2 = nums1;
            nums1 = temp;
        }
        int totalLen = nums1.length+nums2.length;
        int l = -1, r = nums1.length-1;
        int mid1, mid2;
        while (l!=r) {
            mid1 = l+(r-l)/2;
            mid2  = (totalLen)/2 - mid1 -2;
            if (mid2 < 0) {r = mid1;}
            else if (mid2>=nums2.length) { l = mid1+1;}
            else if (nums1[mid1+1] < nums2[mid2]) {l = mid1+1;}
            else {r = mid1;}
        }
        mid1 = l;
        mid2  = totalLen/2 - mid1 -2;
        int left, right,l1,l2,r1,r2;
        
        l1 = mid1<0? Integer.MIN_VALUE:nums1[mid1];
        l2 = mid2<0? Integer.MIN_VALUE:nums2[mid2];
        r1 = mid1+1>=nums1.length? Integer.MAX_VALUE:nums1[mid1+1];
        r2 = mid2+1>=nums2.length? Integer.MAX_VALUE:nums2[mid2+1];
        left = Math.max(l1,l2);
        right = Math.min(r1, r2);
        return totalLen%2 == 1? right:(left+right)/2d;    
        
    }
}
