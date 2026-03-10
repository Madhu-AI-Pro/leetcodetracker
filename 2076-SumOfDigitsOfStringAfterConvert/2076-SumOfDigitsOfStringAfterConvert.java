// Last updated: 3/10/2026, 3:14:12 PM
class Solution {
    public int getLucky(String s, int k) {
       StringBuilder sb=new StringBuilder();
        for(char i:s.toCharArray())
        {
            int a=i-'a';
            sb.append(a+1);
        }
        int a=0;
        int b=0;
        for(char i:sb.toString().toCharArray())
        {
            a+=i-'0';
        }
        for(int i=1;i<k;i++)
        {
            while(a>0)
            {
                b+=a%10;
                a/=10;
            }
            a=b;
            b=0;
        }
        return a;
    }
}