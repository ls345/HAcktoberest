// C Program to print the rhombus pattern using * star 
#include <stdio.h> 
int main() 
{ 
   int rows = 5; 
    // first outer loop to iterate through each row 

    for (int i = 0; i < rows; i++) { 
     // first inner loop to print white spaces 

        for (int j = 0; j < rows - i - 1; j++) { 
            printf(" "); 
        } 
        // second inner loop to print * star in each row 

        for (int k = 0; k < rows; k++) { 
           printf("* "); 
        } 
        printf("\n"); 
    } 
    return 0; 
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
