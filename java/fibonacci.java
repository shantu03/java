class fibonacci
{
public static void main(String[] args)
{

int a=0,b=1,c=1;
System.out.printf("%d  %d  %d ",0,1,1);
for(int i=0;i<23;i++)
{
a=b;
b=c;
c=a+b;
System.out.printf(" %d ",c );
}

}
}