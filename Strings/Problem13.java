/* Write a program to print duplicate and unique words in the string
input   : s = "hello pavan good pavan all hello to all how all good"
output  :duplicate words
                hello 2
                pavan 2
                good 2
                all 3
         unique words
                to 1
                how 1

  */
package Strings;

class Problem13 {
    public static void main(String[] args) {
        String s = "hello pavan good pavan all hello to all how all good";
        String str[] = s.split(" ");
        int a[] = new int[str.length];
        for(int i=0;i<str.length-1;i++) {
            int count = 1;
            if(a[i]==1) {
                continue;
            }
            for(int j=i+1;j<str.length;j++) {
                if(str[i].equals(str[j])) {
                    count++;
                    a[j] = 1;
                }
            }
            if(count>1) {
                System.out.println(str[i]+" "+count);
            }
        }


    }
    
}
