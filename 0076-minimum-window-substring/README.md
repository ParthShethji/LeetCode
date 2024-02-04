<h2><a href="https://leetcode.com/problems/minimum-window-substring/">76. Minimum Window Substring</a></h2><h3>Hard</h3><hr><div><p>Given two strings <code style="background: rgb(0, 9, 15) !important;">s</code> and <code style="background: rgb(0, 9, 15) !important;">t</code> of lengths <code style="background: rgb(0, 9, 15) !important;">m</code> and <code style="background: rgb(0, 9, 15) !important;">n</code> respectively, return <em>the <strong>minimum window</strong></em> <span data-keyword="substring-nonempty"><strong><em>substring</em></strong></span><em> of </em><code style="background: rgb(0, 9, 15) !important;">s</code><em> such that every character in </em><code style="background: rgb(0, 9, 15) !important;">t</code><em> (<strong>including duplicates</strong>) is included in the window</em>. If there is no such substring, return <em>the empty string </em><code style="background: rgb(0, 9, 15) !important;">""</code>.</p>

<p>The testcases will be generated such that the answer is <strong>unique</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> s = "ADOBECODEBANC", t = "ABC"
<strong>Output:</strong> "BANC"
<strong>Explanation:</strong> The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> s = "a", t = "a"
<strong>Output:</strong> "a"
<strong>Explanation:</strong> The entire string s is the minimum window.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> s = "a", t = "aa"
<strong>Output:</strong> ""
<strong>Explanation:</strong> Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code style="background: rgb(0, 9, 15) !important;">m == s.length</code></li>
	<li><code style="background: rgb(0, 9, 15) !important;">n == t.length</code></li>
	<li><code style="background: rgb(0, 9, 15) !important;">1 &lt;= m, n &lt;= 10<sup>5</sup></code></li>
	<li><code style="background: rgb(0, 9, 15) !important;">s</code> and <code style="background: rgb(0, 9, 15) !important;">t</code> consist of uppercase and lowercase English letters.</li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> Could you find an algorithm that runs in <code style="background: rgb(0, 9, 15) !important;">O(m + n)</code> time?</p>
</div>