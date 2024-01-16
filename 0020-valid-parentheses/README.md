<h2><a href="https://leetcode.com/problems/valid-parentheses/">20. Valid Parentheses</a></h2><h3>Easy</h3><hr><div><p>Given a string <code style="background: rgb(0, 9, 15) !important;">s</code> containing just the characters <code style="background: rgb(0, 9, 15) !important;">'('</code>, <code style="background: rgb(0, 9, 15) !important;">')'</code>, <code style="background: rgb(0, 9, 15) !important;">'{'</code>, <code style="background: rgb(0, 9, 15) !important;">'}'</code>, <code style="background: rgb(0, 9, 15) !important;">'['</code> and <code style="background: rgb(0, 9, 15) !important;">']'</code>, determine if the input string is valid.</p>

<p>An input string is valid if:</p>

<ol>
	<li>Open brackets must be closed by the same type of brackets.</li>
	<li>Open brackets must be closed in the correct order.</li>
	<li>Every close bracket has a corresponding open bracket of the same type.</li>
</ol>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> s = "()"
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> s = "()[]{}"
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> s = "(]"
<strong>Output:</strong> false
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code style="background: rgb(0, 9, 15) !important;">1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
	<li><code style="background: rgb(0, 9, 15) !important;">s</code> consists of parentheses only <code style="background: rgb(0, 9, 15) !important;">'()[]{}'</code>.</li>
</ul>
</div>