package f.a.b.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void sort() {
        Sort sort = new SelectionSort();
        int[] a = {1, 5, 4, 7, 6, 9};
        sort.sort(a, a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}