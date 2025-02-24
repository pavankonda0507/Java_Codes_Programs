package Recursion;

class Search {
    String binarySearch(int a[],int search,int f,int l) {
        if(f<=l) {
            int mid = (f+l)/2;
            if(search==a[mid]) { 
                return "Element found";
            }
            else if(search>a[mid]) {
                return binarySearch(a,  search, mid+1, l);
            }
            else {
                return binarySearch(a, search, f, mid-1);
            }
            
        }
        return "Element not found";
        
    }
        
}
class BinarySearch {
    public static void main(String[] args) {
        Search s = new Search();
        int a[] = {1,3,4,9,2,8,6,3},search = 10,f = 0,l = a.length-1;
        String res = s.binarySearch(a,search,f,l);
        System.out.println(res);

    }
}
