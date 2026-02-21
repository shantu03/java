import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {

    private ArrayList<T> heap;
    
    public Heap()
    {   
        heap=new ArrayList<>();
    }

    public void add(T x)
    {
        this.heap.add(x);
        this.upheap(heap.size()-1);
        

    }

    private void swap(int first, int second)
    {
        T temp=heap.get(first);
        heap.set(first,heap.get(second));
        heap.set(second,temp);
    }

    private int parent(int idx)
    {
        return (idx-1)/2;
    }

    private int left(int idx)
    {
        return idx*2+1;
    }

    private int right(int idx)
    {
        return idx*2+2;
    }

    public T remove() throws Exception
    {
        if(heap.isEmpty()) throw new Exception("Trying to remove from empty heap");

        T temp=heap.get(0);

        T last=heap.remove(heap.size()-1);

        if(!heap.isEmpty())
        {
            heap.set(0,last);
            downheap(0);
        }

        return temp;
    }


    private void downheap(int idx){
        int left=left(idx);

        int right=right(idx);

        int minimum=idx;

        if(left < heap.size() && heap.get(minimum).compareTo(heap.get(left))>0)
        {
            minimum=left;
        }
        if(right < heap.size() && heap.get(minimum).compareTo(heap.get(right))>0)
        {
            minimum=right;
        }

        if(minimum!=idx){
            swap(idx, minimum);

            downheap(minimum);
        }

    }

    private void upheap(int idx)
    {
     
        if(idx==0) return;
        if(heap.get(idx).compareTo(heap.get(parent(idx)))<0)   
            {
                swap(idx, parent(idx));
                upheap(parent(idx));    
            }
    }

    public int size(){
        return this.heap.size();
    }




    
}
