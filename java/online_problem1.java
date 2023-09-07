import java.util.Scanner;
class solution
{

int start;
int end;

void set(int arr[])
{
this.start=arr.length-arr.length;
this.end=arr.length-1;
}


void show(int arr[])
{
System.out.printf("{");
for(int i=start;i<end;i++)
{
System.out.printf(" %d,",arr[i]);
}
System.out.printf("} \n");
}

void sum(int arr[],int S)
{
this.end=S-1;
int total=0;
int count=1;
while(true)
{
if(total==S)
{
break;
}
total=0;
for(int i=this.start;i<=this.end;i++)
{
total+=arr[i];
}
if(count==1)
{
if(this.start==this.end)
{
count=2;
}
this.start++;
this.end=S-1;

}
if(count==2)
{
if(this.start==this.end)
{
count=3;
}
this.start=0;
this.end--;
}
if(count==3)
{
if(this.start==this.end)
{
return;
}
this.start++;
this.end--;
}

}


}

public static void main(String[] args)
{
solution obj=new solution();
System.out.printf(" N = ");
int N=new Scanner(System.in).nextInt();
System.out.printf(" S = ");
int S=new Scanner(System.in).nextInt();

int arr[]=new int[N];
for(int i=0;i<N;i++)
{
arr[i]=i+1;
}
obj.set(arr);
obj.sum(arr,S);
obj.show(arr);

}
}