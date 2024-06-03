class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
        it = iter(s)
        match = sum(1 for char in t if char in it)
        return len(t)-match