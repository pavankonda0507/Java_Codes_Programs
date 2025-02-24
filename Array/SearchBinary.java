package Array;
import java.util.Arrays;
class SearchBinary {
    public static void main(String[] args) {
        int a[] = {10,49,48,29,209,-39,-29,209,91};
        Arrays.sort(a);
        int first = 0,last = a.length-1,search = 9;
        while(first<=last) {
            int mid = (first+last)/2;
            if(search == a[mid]) {
                System.out.println("Element found");
                break;
            }
            else if(search>a[mid]) {
                first = mid+1;
            }
            else {
                last = mid-1;
            }

        }
        if(first>last) {
            System.out.println("Element not found");
        }

    }
    
}
