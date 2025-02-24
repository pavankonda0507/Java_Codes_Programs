/* Write a program to print the max repeated word in the string
input   : s = "hello pavan good pavan all hello to all how all good"
output  : all(it is repeated 3 times)
 */
package Strings;

class Problem14 {
    public static void main(String[] args) {
        String s = "hello pavan good pavan all hello to to to all how all good",maxword="";
        String str[] = s.split(" ");
        int a[] = new int[str.length],max=0;
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
                if(count>=max) {
                    if(count>max) {
                        max=count;
                        maxword = str[i]+""+" ";
                    }
                    else {
                        maxword+=str[i];
                    }
                }
            }
        }
        System.out.println(maxword);
    }
    
}
