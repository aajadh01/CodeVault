class Solution:
    def minMoves(self, nums: list[int]) -> int:
        a=min(nums)
        ans=0
        for i in nums:
            if i==a: continue
            else: ans+=(i-a)
        return ans
        