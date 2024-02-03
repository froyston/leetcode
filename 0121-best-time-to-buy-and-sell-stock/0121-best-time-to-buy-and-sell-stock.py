class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n = len(prices)

        if n < 2:
            return 0

        # Initialize variables
        minPrice = prices[0]
        maxProfit = 0

        # Iterate through the array
        for i in range(1, n):
            # Update minimum price
            minPrice = min(minPrice, prices[i])

            # Update max profit
            maxProfit = max(maxProfit, prices[i] - minPrice)

        return maxProfit