<h2><a href="https://leetcode.com/problems/permutation-sequence/">60. Permutation Sequence</a></h2><h3>Hard</h3><hr><div><p>The set <code style="background: rgb(0, 9, 15) !important;">[1, 2, 3, ...,&nbsp;n]</code> contains a total of <code style="background: rgb(0, 9, 15) !important;">n!</code> unique permutations.</p>

<p>By listing and labeling all of the permutations in order, we get the following sequence for <code style="background: rgb(0, 9, 15) !important;">n = 3</code>:</p>

<ol>
	<li><code style="background: rgb(0, 9, 15) !important;">"123"</code></li>
	<li><code style="background: rgb(0, 9, 15) !important;">"132"</code></li>
	<li><code style="background: rgb(0, 9, 15) !important;">"213"</code></li>
	<li><code style="background: rgb(0, 9, 15) !important;">"231"</code></li>
	<li><code style="background: rgb(0, 9, 15) !important;">"312"</code></li>
	<li><code style="background: rgb(0, 9, 15) !important;">"321"</code></li>
</ol>

<p>Given <code style="background: rgb(0, 9, 15) !important;">n</code> and <code style="background: rgb(0, 9, 15) !important;">k</code>, return the <code style="background: rgb(0, 9, 15) !important;">k<sup>th</sup></code> permutation sequence.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> n = 3, k = 3
<strong>Output:</strong> "213"
</pre><p><strong class="example">Example 2:</strong></p>
<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> n = 4, k = 9
<strong>Output:</strong> "2314"
</pre><p><strong class="example">Example 3:</strong></p>
<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> n = 3, k = 1
<strong>Output:</strong> "123"
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code style="background: rgb(0, 9, 15) !important;">1 &lt;= n &lt;= 9</code></li>
	<li><code style="background: rgb(0, 9, 15) !important;">1 &lt;= k &lt;= n!</code></li>
</ul>
</div>