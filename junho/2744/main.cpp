#include <iostream>
#include <string>
using namespace std;

int main() {
	cin.tie(NULL);
	ios_base::sync_with_stdio(false);

	string str;
    cin >> str;
    
    for(int i = 0; i < str.length(); i++) {
        char ch = str[i];
        if(ch >= 'a' && ch <= 'z') {
            cout << (char)(ch - 32);
        } else if(ch >= 'A' && ch <= 'Z') {
            cout << (char)(ch + 32);
        }
    }
    cout << endl;

	return 0;
}