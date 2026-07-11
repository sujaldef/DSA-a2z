#include <iostream>
using namespace std;

int main() {
    int n = 3;
    int arr[3][3];

    int top = 0, bottom = n - 1;
    int left = 0, right = n - 1;

    int num = 1;

    while (top <= bottom && left <= right) {

        // Left -> Right
        for (int j = left; j <= right; j++)
            arr[top][j] = num++;
        top++;

        // Top -> Bottom
        for (int i = top; i <= bottom; i++)
            arr[i][right] = num++;
        right--;

        // Right -> Left
        if (top <= bottom) {
            for (int j = right; j >= left; j--)
                arr[bottom][j] = num++;
            bottom--;
        }

        // Bottom -> Top
        if (left <= right) {
            for (int i = bottom; i >= top; i--)
                arr[i][left] = num++;
            left++;
        }
    }

    // Print matrix
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++)
            cout << arr[i][j] << " ";
        cout << endl;
    }

    return 0;
}