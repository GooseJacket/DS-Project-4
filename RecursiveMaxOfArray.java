public class RecursiveMaxOfArray
{

    
    /**
     * Compute the maximum of a range of values in an array recursively.
     *
     * @param data   An array of integers.
     * @param from  The low index for searching for the maximum.
     * @param to    The high index for searching for the maximum.
     * 
     * preconditions: from LTE Zero to, from LTE 0, to LT length, length GT 0
     *                
     * @return     The maximum value in the array.
     */
    
    public  int max(int data[], int from, int to)
    {
        int result = 0;

        if (to - from == -1) {
            throw new BadArgumentsForMaxException("Length is 0");
        } else if (to - from == 0) {
            return data[from];
        }
        else { //recurse
            int middleIndex = (to - from) / 2 + from;
            int left = max(data, from, middleIndex - 1);
            int right = max(data, middleIndex, to);
            if (left >= right) {
                result = left;
            } else{
                result = right;
            }
        }
        return result;
    }
    
    
}
