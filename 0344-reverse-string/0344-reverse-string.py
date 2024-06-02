class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        ptr = 0
        n = len(s)
        while ptr < n // 2:
            self.swap(s, ptr, n - ptr - 1)
            ptr += 1
    
    def swap(self, s: List[str], a: int, b: int) -> None:
        temp = s[a]
        s[a] = s[b]
        s[b] = temp