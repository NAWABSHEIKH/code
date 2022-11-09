import java.util.*;
class Solution{
    public static void main(String[] args)throws Exception
    {
        int st=9,sp=0,count=5;
        for(int i=0;i<9;i++)
        {
            for(int j=1;j<=sp;j++)
            System.out.print(" ");
            
            for(int j=1;j<=st;j++)
            System.out.print(count+" ");
            
             for(int j=1;j<=sp;j++)
            System.out.print(" ");
            
            if(i<st/2 +3)
            {
                sp=sp+2;
                st=st-2;
                count--;
            }else{
                sp=sp-2;
                st=st+2;
                count++;
                
            }
            
            System.out.println();
            
        }
    }
} 