public class BinerySearch {
    public static void main(String[] args)
    {
        int []arr={10,20,30,40,50,60,70,80,90};
        int key=20;
        int start=0,end = arr.length-1,mid=0;
        while (start<=end)
        {
                mid =(start+end)/2;

                if (arr[mid] > key)
                {

                    end = mid - 1;
                }
                else if (arr[mid] < key)
                {
                    start = mid + 1;
                }

                else
                {
                    System.out.println("index of"+mid);
                    System.exit(0);

                }
          }
                System.out.println("Index Not Found : ");

        }

    }

