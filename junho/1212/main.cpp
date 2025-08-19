#include <iostream>
#include <string>
using namespace std;

int main() {
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);
    
    string octal;
    cin >> octal;
    
    string binary = "";
    
    for (int i = 0; i < octal.length(); i++) {
        int digit = octal[i] - '0';
        
        // 각 8진수 숫자를 3자리 2진수로 변환
        string temp = "";
        for (int j = 2; j >= 0; j--) {
            if (digit & (1 << j)) {
                temp += "1";
            } else {
                temp += "0";
            }
        }
        
        // 첫 번째 자리수가 아니거나 temp가 "000"이 아닌 경우에만 추가
        if (i == 0) {
            // 첫 번째 자리는 앞의 0을 제거
            int start = 0;
            while (start < 3 && temp[start] == '0') {
                start++;
            }
            if (start == 3) {
                binary += "0";
            } else {
                binary += temp.substr(start);
            }
        } else {
            binary += temp;
        }
    }
    
    cout << binary << endl;
    
    return 0;
}
