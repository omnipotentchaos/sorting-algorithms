#include <iostream>
#include <vector>
using namespace std;

vector<int> bubble_Sort(vector<int> x) {
    for (int i = 0; i < x.size(); i++) {
        int swapped = true;
        for (int j = 0; j < x.size() - 1 - i; j++) {
            if (x[j] > x[j + 1]) {
                swap(x[j], x[j + 1]);
                swapped = true;
            }
            if (!swapped)
                break;
        }
    }
    return x;
}
int main() {
    vector <int> x={1,4,2,7,8,21,2};
    vector<int> a=bubble_Sort(x);
    for(int i=0;i<x.size();i++) {
        cout << a[i] <<" ";
    }
}
