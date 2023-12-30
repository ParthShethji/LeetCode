<h2><a href="https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/">1897. Redistribute Characters to Make All Strings Equal</a></h2><h3>Easy</h3><hr><div><p>You are given an array of strings <code style="">words</code> (<strong>0-indexed</strong>).</p>

<p>In one operation, pick two <strong>distinct</strong> indices <code style="">i</code> and <code style="">j</code>, where <code style="">words[i]</code> is a non-empty string, and move <strong>any</strong> character from <code style="">words[i]</code> to <strong>any</strong> position in <code style="">words[j]</code>.</p>

<p>Return <code style="">true</code> <em>if you can make<strong> every</strong> string in </em><code style="">words</code><em> <strong>equal </strong>using <strong>any</strong> number of operations</em>,<em> and </em><code style="">false</code> <em>otherwise</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre style=""><strong>Input:</strong> words = ["abc","aabc","bc"]
<strong>Output:</strong> true
<strong>Explanation:</strong> Move the first 'a' in <code>words[1] to the front of words[2],
to make </code><code>words[1]</code> = "abc" and words[2] = "abc".
All the strings are now equal to "abc", so return <code>true</code>.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre style=""><strong>Input:</strong> words = ["ab","a"]
<strong>Output:</strong> false
<strong>Explanation:</strong> It is impossible to make all the strings equal using the operation.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code style="">1 &lt;= words.length &lt;= 100</code></li>
	<li><code style="">1 &lt;= words[i].length &lt;= 100</code></li>
	<li><code style="">words[i]</code> consists of lowercase English letters.</li>
</ul>
</div>