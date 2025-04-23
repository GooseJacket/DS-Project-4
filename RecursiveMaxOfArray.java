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

        //Data is null
        if(data == null || data.length == 0 || to-from < 0 || from < 0 || to >= data.length){
            throw new BadArgumentsForMaxException("No data to calculate!" );
        }
        else if (to - from == 0) {
            result = data[from];
        }

        else { //recurse
            //printInts(data, from, to); debugging
            int middleIndex = (to - from) / 2 + from;
            int left = max(data, from, middleIndex); //realized I put the middle in the wrong side!
            int right = max(data, middleIndex + 1, to);
            if (left >= right) {
                result = left;
            } else{
                result = right;
            }
        }

        return result;
    }


    public void printInts(int[] ints, int from, int to){
        for(int i = from; i < to + 1; i++){
            System.out.print(ints[i] + " ");
        }
        System.out.println();
    }
    
}
