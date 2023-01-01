package Mobile223;

public class tip02 {
    public static void main(String[] args) {
       int arr[]=new int[10];
        arr[0]=1;
        arr[1]=1;
        System.out.println("前十项");
        for(int i = 0;i<= arr.length;i++){
            if(i>1){//从第三个元素开始
                arr[i]=arr[i-2]+arr[i-1];
            }
            System.out.print(arr[i]+" ");
        }

    }
}
