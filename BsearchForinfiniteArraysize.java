import java.util.*;
public class BsearchForinfiniteArraysize {


    public static int binsearch(int[] arr,int low,int end ,int target){
        while(low<=end){
            int mid=low+(end-low)/2;
            if(target==arr[mid])return mid;
            else if(target<arr[mid]){
                end=mid-1;
            }
            else low=mid+1;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int start=0;
        int end=1;
        int target=10;
        while(target>arr[end]){
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart; 
        }
        if(end>=arr.length)end=arr.length-1;
        int position=binsearch(arr, start, end, target);
        if(position<0)System.out.println("Element not Found");
        else System.out.println("Element found at = "+position);

    }
}


// Optimized implementation of Bubble sort
#include <bits/stdc++.h>
using namespace std;
 
// An optimized version of Bubble Sort
void bubbleSort(int arr[], int n)
{
    int i, j;
    bool swapped;
    for (i = 0; i < n - 1; i++) {
        swapped = false;
        for (j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr[j], arr[j + 1]);
                swapped = true;
            }
        }
 
        // If no two elements were swapped
        // by inner loop, then break
        if (swapped == false)
            break;
    }
}
 
// Function to print an array
void printArray(int arr[], int size)
{
    int i;
    for (i = 0; i < size; i++)
        cout << " " << arr[i];
}
 
// Driver program to test above functions
int main()
{
    int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
    int N = sizeof(arr) / sizeof(arr[0]);
    bubbleSort(arr, N);
    cout << "Sorted array: \n";
    printArray(arr, N);
    return 0;
}
