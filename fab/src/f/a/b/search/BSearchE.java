package f.a.b.search;

/**
 * 二分查找非递归实现，针对有序且无重复元素的数组
 */
public class BSearchE {

    /**
     * 二分查找的非递归实现
     * @param a
     * @param n
     * @param value
     * @return
     */
    public int search(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;

        // 注意是 low<=high，而不是 low<high
        while(low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] == value) {
                return mid;
            }
            else if (a[mid] < value) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
