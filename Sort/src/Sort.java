/**
 * Created by lyuz on 9/17/16.
 */
import java.lang.Math.*;

public class Sort {
    public Sort() {

    }

    public void quickSort(int [] array, int iLow, int iHigh) {
        int pivotpoint=0;//pivot point
        if(iHigh>iLow)
        {
            pivotpoint=partition(array,iLow,iHigh);//get pivot point
            quickSort(array,iLow,pivotpoint);//sort lower half of array
            quickSort(array,pivotpoint+1,iHigh);//sort upper half of the array
        }

    }
    private int partition(int [] array,int iLow,int iHigh)
    {//initializing variables
        int i=iLow+1;//initializing i
        int j=iLow;//set the
        int temp=0;//temporary variable for exchanging values
        int pivot_item=  array[iLow];//getting pivot item
        for(; i < iHigh; i++)
        {
            //if the value at i is less than the pivot exchange
            if(array[i] <pivot_item){
                j++;
                temp= array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        int pivot_point =j;//the place where it the pivot point was exchanged
        temp=array[iLow];
        array[iLow]= array[pivot_point];
        array[pivot_point]=temp;
        return pivot_point;//return the last pivot point
    }


    public int [] insertion_sort(int[]array)
    {
        int value_to_insert = 0;
        int j=0;//inner loop index
        for(int i = 1; i<array.length; i++)
        {
            value_to_insert = array[i];//grab the second value to compare it witht he previous
            j = i - 1;// grab the number at ith element
            //while, j is positive and the value at j is greater than the next element
            while(j>=0 && array[j]>value_to_insert)
            {
                //exchange if the is greater
                array[ j + 1 ] = array[j];
                j--;//move one spot towards the beginning of the array
            }
            //insert the when the above does not hold true
            array[ j + 1 ] = value_to_insert;
        }//return array
        return array;
    }
    public int[] bubbleSort(int[]array){
        int j=0;//initialize inner variable
        int num_holder=0;//temporary variable
        //outer loop to exchange value
        for(int i=0; i<array.length; i++)
        {//inner loop to compare value
            for( j=i+1; j<array.length; j++)
            {//exchange value if array at i is lower than at j
                if(array[i] > array[j])
                {//assign value at i to temporary variable
                    num_holder= array[i];
                    //exchange value from j to i
                    array[i]=array[j];
                    //exchange value from i to j
                    array[j]=num_holder;
                }
            }
        }
        return array;
    }
    public void print_array(int[]array)
    {
        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
