public class CommElementBetTwoArray {

    public static void main(String args[]){
        int arr1[] = {8,15,16,17,23,25,20};
        int arr2[] = {8,20,33,23,29,45,25};
        int i,j;
        for(i=0;i<arr1.length;i++){
            for(j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }
    
}
