package crossCountry;


public class RemoveArray{
    public static int removeDuplicateElement(int arr[],int n)
    {
        if (n==0||n==1){
            return n;
        }
        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[n-1];
        return j;
    }
    public static void main (String []args){
        int arr[]={10,20,30,30,10,40,50};
        int length=arr.length;
        length=removeDuplicateElement(arr,length);
        for(int i=0;i<length;i++)
        System.out.print(arr[i]+"");
    }
}