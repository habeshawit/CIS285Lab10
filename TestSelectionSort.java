import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        /** add tests to check for this unit test **/
        SelectionSort temp1 = new SelectionSort();
        int[] newArr = temp1.basicSelectionSort(arr);

        for (int i = 0; i < arr.length; i++)
        {
           assertEquals("Same element", newArr[i], Sortedarr[i]);
        }
    }

    public void testNegative(){

        /** Test data contains negative values only **/
        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;

        SelectionSort temp1 = new SelectionSort();
        int[] newArr = temp1.basicSelectionSort(arr);

        for (int i = 0; i < arr.length; i++)
        {
           assertEquals("Same element", newArr[i], Sortedarr[i]);
        }
    }

    public void testMixed(){

        /** Test data contains with both positive, negative and zeros **/
				int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = -8;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -8;
        Sortedarr[2] = 0;
        Sortedarr[3] = 2;
        Sortedarr[4] = 7;

        SelectionSort temp1 = new SelectionSort();
        int[] newArr = temp1.basicSelectionSort(arr);

        for (int i = 0; i < arr.length; i++)
        {
           assertEquals("Same element", newArr[i], Sortedarr[i]);
        }
    }

    public void testDuplicates(){

        /** Test data contains duplicates **/
				int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -8;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = 7;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -8;
        Sortedarr[2] = -8;
        Sortedarr[3] = 7;
        Sortedarr[4] = 7;

        SelectionSort temp1 = new SelectionSort();
        int[] newArr = temp1.basicSelectionSort(arr);

        for (int i = 0; i < arr.length; i++)
        {
           assertEquals("Same element", newArr[i], Sortedarr[i]);
        }
    }
}
