public class anagrams {
    public static void main(String[] args) {
        String s1=new java.util.Scanner(System.in).nextLine();

    
        method1(s1);
    }
    static void method1(String s1)
    {
        char arr[]=s1.toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            for(int j=1+i;j<arr.length-1;j++)
                {
                    if(arr[j]<arr[i]){
                        char temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                }
            }
        }
        System.out.println(arr);
    }
}
