package ccee;
public class ArrayProblrm {
    
    public static void main(String []args){
    
        int i;
        int j;
        int[][] arr=new int[3][3];
        for(i=0;i<3;++i){
         for(j=0;j<3;++j)
         {
             arr[i][j]=2*i+2*i;
             System.out.println(arr[i][j]);
         }
        }
    }
    
}
