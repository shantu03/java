public class sorting{
public static void main(String[] args)
{

int[] arr= {6,1,5,2,3,64,23,7};
int[] sortedarr =new int[arr.length-1];
sortedarr[0]=arr[0];
int i=0;
while(i<=arr.length){
for(int j=0;j<=arr.length-1;j++){


if(sortedarr[i]>arr[j])
{
sortedarr[i]=arr[j];
i++;
arr[j]=1000;
}
}

}

for(int ai:sortedarr)
{System.out.println(ai);}



}
}