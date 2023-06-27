**Problem: Maximize Profit with Fee**

You are given an array of integers `prices` where `prices[i]` is the price of a given stock on the `i`th day, and an integer `fee` representing a transaction fee.

You may complete as many transactions as you like, but you need to pay the transaction fee for each transaction you make. You must buy before you can sell.

Write a function `maxProfitWithFee(prices, fee)` that returns the maximum profit you can achieve. If you cannot achieve any profit, return 0.

### Example

**Example 1:**

```
Input: prices = [1, 3, 2, 8, 4, 9], fee = 2
Output: 8
```

{Try it}(sh .guides/runner.sh javac Problem01.java java -cp . Problem01 "1,3,2,8,4,9" 2)

**Explanation:** You can buy the stock on day 1 for $1, and sell it on day 4 for $8. After paying the $2 fee, your profit is $8 - $1 - $2 = $5. Then, you can buy the stock on day 5 for $4, and sell it on day 6 for $9. After paying the $2 fee, your profit is $9 - $4 - $2 = $3. So the total profit is $5 + $3 = $8.

Sure, here are a few more examples:

**Example 2:**

```
Input: prices = [5, 6, 3, 2, 4], fee = 2
Output: 0
```

{Try it}(sh .guides/runner.sh javac Problem01.java java -cp . Problem01 "5,6,3,2,4" 2)

**Explanation:** In this case, no matter which day we buy and sell, we are unable to make a profit after paying the fee.

**Example 3:**

```
Input: prices = [5, 2, 7, 1, 8], fee = 2
Output: 6
```

{Try it}(sh .guides/runner.sh javac Problem01.java java -cp . Problem01 "5,2,7,1,8" 2)


**Explanation:** You can buy the stock on day 2 for $2 and sell it on day 3 for $7. After paying the fee, your profit is $7 - $2 - $2 = $3. Then, you can buy the stock on day 4 for $1 and sell it on day 5 for $8. After paying the fee, your profit is $8 - $1 - $2 = $5. So the total profit is $3 + $5 = $8.


"1,3,2,8,4,9" 2 Expected output: 8
"5,6,3,2,4" 2 Expected output: 0
"5,2,7,1,8" 2 Expected output: 8
"1,7,5,8,6,9" 3 Expected output: 3

