package shellSort;
public class ShellSort
{
    public static void main(String[] args)
    {
        var arr = new int[] {5, 2, 1, 3, 8, 10, 5};
        var arrRen = ShellSort(arr, arr.length);
        WriteOut(arrRen);
    }
    
    public static int[] ShellSort(int[] array, int n)
    {
        int interval = (int)Math.floor(n / 2);
        while (interval > 0)
        {
            for (int i = interval; i < n; i++)
            {
                var temp = array[i];
                var j = i;
                while (j >= interval && array[j - interval] > temp)
                {                    
                    array[j] = array[j - interval];
                    j -= interval;
                }
                array[j] = temp;
            }
            interval = (int)Math.floor(interval / 2.0);
        }
        return array;
    }
    
    public static void WriteOut(int[] array)
    {
        for (int i : array) {
            System.out.println(i);
        }
    }
}
