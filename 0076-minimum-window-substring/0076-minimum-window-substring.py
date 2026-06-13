from collections import Counter, defaultdict

class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if len(t) > len(s):
            return ""

        need = Counter(t)
        window = defaultdict(int)

        required = len(need)  # distinct chars needed
        formed = 0            # distinct chars currently satisfied

        left = 0
        min_len = float('inf')
        start = 0

        for right in range(len(s)):
            ch = s[right]
            window[ch] += 1

            # Requirement for this character just got satisfied
            if ch in need and window[ch] == need[ch]:
                formed += 1

            # Try shrinking while window remains valid
            while formed == required:
                if right - left + 1 < min_len:
                    min_len = right - left + 1
                    start = left

                left_char = s[left]
                window[left_char] -= 1

                # Requirement is no longer satisfied
                if left_char in need and window[left_char] < need[left_char]:
                    formed -= 1

                left += 1

        return "" if min_len == float('inf') else s[start:start + min_len]