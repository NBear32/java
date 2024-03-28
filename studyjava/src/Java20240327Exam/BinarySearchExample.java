package Java20240327Exam;

public class BinarySearchExample {  // 정렬이 되어있어야 정상 동작 가능
    public static void binarySearch(int arr[], int first, int last, int key){ // first 시작, last 끝, key 찾을 값
        int mid = (first + last)/2;   // mid 에 배열의 중간 값을 넣음
        while( first <= last ){    // first 가 last 보다 같거나 작을때까지
            if ( arr[mid] < key ){   // mid 가 key 보다 작으면 first 는 mid + 1
                first = mid + 1;
            }else if ( arr[mid] == key ){   // mid 가 key 이면 바로 출력하고 break
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;   // 둘다 아니면 last 는 mid - 1
            }
            mid = (first + last)/2;   // mid 에 first 와 last 의 중간값을 넣고 다시 돌림
        }
        if ( first > last ){   // first 가 last 보다 커질때까지 값을 못찾으면 출력
            System.out.println("Element is not found!");
        }
    }
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        int key = 30;
        int last=arr.length-1;
        binarySearch(arr,0,last,key);
    }
}