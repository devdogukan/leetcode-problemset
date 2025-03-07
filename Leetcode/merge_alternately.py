class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        merged = ""
        for i in range(min(len(word1), len(word2))):
            merged += word1[i] + word2[i]
        merged += word1[i+1:] if len(word1) > len(word2) else word2[i+1:]
        return merged

# Test cases
solution = Solution()
print(solution.mergeAlternately("abc", "pqr")) # apbqcr
print(solution.mergeAlternately("ab", "pqrs")) # apbqrss
print(solution.mergeAlternately("abcd", "pq")) # apbqcd