package shellSort;
public class ShellAssert
{
    public static void main(String[] args)
    {
        ShellAsserts();
    }
    
    private static void ShellAsserts()
    {
        NormalShellAssert();
        NegativeShellAssert();
        SortedShellAssert();
        EmptyShellAssert();
    }
    
    private static void NormalShellAssert()
    {
        var arr = new int[] {5, 2, 1, 3, 8, 10, 5};
        var expectedArr = new int[] {1, 2, 3, 5, 5, 8, 10};
        var sortedArr = ShellSort.ShellSort(arr, arr.length);
        assert IsArrayEqual(sortedArr, expectedArr) : "Nem jól van lerendezve!";
    }
    
    private static void NegativeShellAssert()
    {
        var arr = new int[] {-5, 2, 1, 3, 8, 0, 10, 5};
        var expectedArr = new int[] {-5, 0, 1, 2, 3, 5, 8, 10};
        var sortedArr = ShellSort.ShellSort(arr, arr.length);
        assert IsArrayEqual(sortedArr, expectedArr) : "Nem jól van lerendezve!";
    }
    
    private static void SortedShellAssert()
    {
        var arr = new int[] {-9, 1, 2, 5, 7, 15, 25};
        var expectedArr = new int[] {-9, 1, 2, 5, 7, 15, 25};
        var sortedArr = ShellSort.ShellSort(arr, arr.length);
        assert IsArrayEqual(sortedArr, expectedArr) : "Nem jól van lerendezve!";
    }
    
    private static void EmptyShellAssert()
    {
        var arr = new int[] {};
        var expectedArr = new int[] {};
        var sortedArr = ShellSort.ShellSort(arr, arr.length);
        assert IsArrayEqual(sortedArr, expectedArr) : "Nem jól van lerendezve!";
    }
    
    private static boolean IsArrayEqual(int[] arr1, int[] arr2)
    {
        if (arr1.length != arr2.length)
        {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i])
            {
                return false;
            }
        }
        return true;
    }
}
