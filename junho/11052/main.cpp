#include <iostream>
#include <cmath>

int main()
{
	int n;
	int card[1001];

	std::cin >> n;

	for (int i = 1; i <= n; i++) {
		std::cin >> card[i];
	}

	int dp[1001];
	dp[0] = 0;
	dp[1] = card[1];

	for (int target = 2; target <= n; target++) {
		int max = 0;
		for (int inner = ceil(target / 2.0f); inner < target; inner++) {
			int currnet = dp[inner] + card[target - inner];
			if (max < currnet) {
				max = currnet;
			}
		}
		if (max < card[target]) {
			max = card[target];
		}
		dp[target] = max;
	}

	std::cout << dp[n] << std::endl;
}

