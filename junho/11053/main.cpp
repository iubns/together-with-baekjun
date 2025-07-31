#include <iostream>

using namespace std;

void init() {
	cin.tie(NULL);
	cout.tie(NULL);
	ios_base::sync_with_stdio(false);
}

int main()
{
	init();

	int count, max = 1;
    int dp[1001] = {0};
    int num[1001] = {0};
	cin >> count;
	
	for (int index = 0; index < count; index++) {
		cin >> num[index];
        
        for(int innerIndex = index - 1; innerIndex >= 0; innerIndex--) {
            if (num[index] > num[innerIndex]) {
                dp[index] = dp[index] > dp[innerIndex] ? dp[index] : dp[innerIndex];
                
            }
        }
        dp[index]++;
        if (dp[index] > max) {
            max = dp[index];
        }
	}

	cout << max << endl;
	return 0;
}