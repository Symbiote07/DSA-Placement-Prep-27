class Solution {
    public int addDigits(int num) {

        if (num==0)
        return 0;
        return 1+((num-1)%9);
    

    }
}
//         int s=0,num1;
//         while(num!=0)
//         {
//             s=s+num%10;
//             num=num/10;
            
//         }
//         return num;
        
//     }
// }

