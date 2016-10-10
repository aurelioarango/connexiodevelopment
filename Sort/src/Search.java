/**
 * Created by lyuz on 9/30/16.
 */
public class Search {
    public int sequential_search(int[]array, int key)
    {
        int index=0;//to track the position of the item

        if(array==null)
        {
            return -1;// return negative -1 if array is empty
        }
        else
        {
            while (index < array.length && array[index]!=key)
            {
                index++;//increment index item is not found
            }
            if(index>array.length-1){
                return -1;//exhausted all elements in the array
            }
            else
            {
                return index;//return the index where the element was found
            }

        }

    }
}
