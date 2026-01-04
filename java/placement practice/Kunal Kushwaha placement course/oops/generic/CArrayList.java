

public class CArrayList<E> {

    static int  DEFAULT_SIZE=10;
    private Object arr[];
    private int count=0;
    private int size;


    CArrayList(){
    size=DEFAULT_SIZE;
    arr=new Object[DEFAULT_SIZE];
    }

    CArrayList(int size){
        this.size=size;
        arr=new Object[size];
    }

    void add(E n)
    {
        
        if(count==size-1)
        {
            size*=2;
            Object [] temp=new Object[size];
            for (int i = 0; i < count; i++) {
                temp[i]=arr[i];
            }
            temp[count]=n;
            arr=temp;
        }

        arr[count++]=n;
        
    }

    public void print()
    {
        System.out.print("[ ");
        
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i]+", "); 
        }
        System.out.println("\b"+" ]");
    }

    public E remove()
    {
         
        return (E)arr[--count];

    }

}

