package com.company;

public class lemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
    int five=0;
    int ten=0;
    for(int item:bills)
    {
        if(item==5)
        {
            five++;
        }
        else if(item==10)
        {
            ten++;
            if(five>=1)
            {
                five--;
            }
            else
            {
                return false;
            }
        }
        else if(item==20)
        {
            if(ten>=1&&five>=1)
            {
                ten--;
                five--;
            }
            else if(five>=3)
            {
                five-=3;
            }
            else
            {
                return false;
            }
        }

    }
        return true;
    }
    public static void main(String args[])
    {
      boolean res=  lemonadeChange(new int[]{5,5,5,10,20});
       System.out.println(res);
    }
}
