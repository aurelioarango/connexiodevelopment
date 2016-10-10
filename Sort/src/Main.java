/**
 * Created by lyuz on 9/17/16.
 */
public class Main {
    public static void main(String[]args)
    {
        Sort sorting_class = new Sort();
        int array_to_sort[]={7,6,5,4,3,2,1};
        int array_to_sort_bubble[] ={7,6,5,4,3,2,1};
        int array_to_sort_insertion[]={7,6,5,4,3,2,1};
        int array_to_sort_quick[]={7,6,5,4,3,2,1};



        System.out.println("Bubble sort");
        sorting_class.print_array(array_to_sort_bubble);
        sorting_class.bubbleSort(array_to_sort_bubble);

        sorting_class.print_array(array_to_sort_bubble);

        System.out.println("insertion sort");

        sorting_class.print_array(array_to_sort_insertion);
        sorting_class.insertion_sort(array_to_sort_insertion);

        sorting_class.print_array(array_to_sort_insertion);

        System.out.println("Quick sort");

        sorting_class.print_array(array_to_sort_quick);
        sorting_class.quickSort(array_to_sort_quick, 0,7);
        sorting_class.print_array(array_to_sort_quick);

        System.out.println("sequential search");

        print_number(array_to_sort,8);
        print_number(array_to_sort,4);

    }
    public static void print_number(int []array,int key)
    {
        Search search_object = new Search();
        System.out.println("Item to search: "+ key);
        int location = search_object.sequential_search(array,key);

        if(location!=-1)
        {
            System.out.println("Item found at "+ location);
        }
        else
        {
            System.out.println("Item not found");
        }

    }
}
