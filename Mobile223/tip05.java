package Mobile223;
//排列前32；18；41；23；2；56；36；67；59；20
//排列后2；18；20；23；32；36；41；56；59；67
public class tip05 {
    public static void main(String[] args) {
        int [] arr;
        arr=new int[]{32,18,41,23,2,56,36,67,59,20};
      //冒泡前
        int i;
        int j;
        int t = 0;
        for (i =0;i< arr.length-1;i++ ){
            for(j = 0;j< arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    //如果前面大于后面，换位置
                    t = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        for (i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
