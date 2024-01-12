<h2><a href="https://leetcode.com/problems/determine-if-string-halves-are-alike/">1704. Determine if String Halves Are Alike</a></h2><h3>Easy</h3><hr><div><p>You are given a string <code style="background: rgb(0, 9, 15) !important;">s</code> of even length. Split this string into two halves of equal lengths, and let <code style="background: rgb(0, 9, 15) !important;">a</code> be the first half and <code style="background: rgb(0, 9, 15) !important;">b</code> be the second half.</p>

<p>Two strings are <strong>alike</strong> if they have the same number of vowels (<code style="background: rgb(0, 9, 15) !important;">'a'</code>, <code style="background: rgb(0, 9, 15) !important;">'e'</code>, <code style="background: rgb(0, 9, 15) !important;">'i'</code>, <code style="background: rgb(0, 9, 15) !important;">'o'</code>, <code style="background: rgb(0, 9, 15) !important;">'u'</code>, <code style="background: rgb(0, 9, 15) !important;">'A'</code>, <code style="background: rgb(0, 9, 15) !important;">'E'</code>, <code style="background: rgb(0, 9, 15) !important;">'I'</code>, <code style="background: rgb(0, 9, 15) !important;">'O'</code>, <code style="background: rgb(0, 9, 15) !important;">'U'</code>). Notice that <code style="background: rgb(0, 9, 15) !important;">s</code> contains uppercase and lowercase letters.</p>

<p>Return <code style="background: rgb(0, 9, 15) !important;">true</code><em> if </em><code style="background: rgb(0, 9, 15) !important;">a</code><em> and </em><code style="background: rgb(0, 9, 15) !important;">b</code><em> are <strong>alike</strong></em>. Otherwise, return <code style="background: rgb(0, 9, 15) !important;">false</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> s = "book"
<strong>Output:</strong> true
<strong>Explanation:</strong> a = "b<u>o</u>" and b = "<u>o</u>k". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> s = "textbook"
<strong>Output:</strong> false
<strong>Explanation:</strong> a = "t<u>e</u>xt" and b = "b<u>oo</u>k". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code style="background: rgb(0, 9, 15) !important;">2 &lt;= s.length &lt;= 1000</code></li>
	<li><code style="background: rgb(0, 9, 15) !important;">s.length</code> is even.</li>
	<li><code style="background: rgb(0, 9, 15) !important;">s</code> consists of <strong>uppercase and lowercase</strong> letters.</li>
</ul>
</div>