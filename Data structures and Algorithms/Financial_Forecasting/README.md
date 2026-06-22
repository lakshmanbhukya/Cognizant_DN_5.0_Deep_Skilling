# Financial Forecasting

A recursive implementation to calculate future financial values based on compound interest.

## Overview

This program calculates the forecasted value of an investment over time using recursive computation. Given an initial amount, interest rate, and time period, it predicts the future value. d

## How It Works

The `getForecast` method recursively applies the compound interest formula:
- Base case: When time reaches 0, return the current amount
- Recursive case: Calculate new amount with interest and call the function with time-1

## Usage

Run the program and provide:
- **Amount**: Initial investment amount
- **Interest**: Annual interest rate (percentage)
- **Time**: Number of periods

Example:
```
Amount: 1000
Interest: 5
Time: 10
```

## Optimization: Avoiding Excessive Computation

The current recursive solution has **O(n)** time complexity and **O(n)** space complexity due to the call stack. For large time periods, this can be inefficient.

### Optimization Techniques:

1. **Iterative Approach**: Replace recursion with a loop to eliminate call stack overhead:


2.. **Mathematical Formula**: Use the direct compound interest formula to compute in **O(1)** time:

The mathematical formula approach is the most efficient, reducing both time and space complexity to constant time.
