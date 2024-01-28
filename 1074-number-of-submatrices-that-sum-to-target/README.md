<h2><a href="https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/">1074. Number of Submatrices That Sum to Target</a></h2><h3>Hard</h3><hr><div><p>Given a <code style="background: rgb(0, 9, 15) !important;">matrix</code>&nbsp;and a <code style="background: rgb(0, 9, 15) !important;">target</code>, return the number of non-empty submatrices that sum to <font face="monospace">target</font>.</p>

<p>A submatrix <code style="background: rgb(0, 9, 15) !important;">x1, y1, x2, y2</code> is the set of all cells <code style="background: rgb(0, 9, 15) !important;">matrix[x][y]</code> with <code style="background: rgb(0, 9, 15) !important;">x1 &lt;= x &lt;= x2</code> and <code style="background: rgb(0, 9, 15) !important;">y1 &lt;= y &lt;= y2</code>.</p>

<p>Two submatrices <code style="background: rgb(0, 9, 15) !important;">(x1, y1, x2, y2)</code> and <code style="background: rgb(0, 9, 15) !important;">(x1', y1', x2', y2')</code> are different if they have some coordinate&nbsp;that is different: for example, if <code style="background: rgb(0, 9, 15) !important;">x1 != x1'</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/09/02/mate1.jpg" style="width: 242px; height: 242px;">
<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> matrix = [[0,1,0],[1,1,1],[0,1,0]], target = 0
<strong>Output:</strong> 4
<strong>Explanation:</strong> The four 1x1 submatrices that only contain 0.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> matrix = [[1,-1],[-1,1]], target = 0
<strong>Output:</strong> 5
<strong>Explanation:</strong> The two 1x2 submatrices, plus the two 2x1 submatrices, plus the 2x2 submatrix.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> matrix = [[904]], target = 0
<strong>Output:</strong> 0
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code style="background: rgb(0, 9, 15) !important;">1 &lt;= matrix.length &lt;= 100</code></li>
	<li><code style="background: rgb(0, 9, 15) !important;">1 &lt;= matrix[0].length &lt;= 100</code></li>
	<li><code style="background: rgb(0, 9, 15) !important;">-1000 &lt;= matrix[i] &lt;= 1000</code></li>
	<li><code style="background: rgb(0, 9, 15) !important;">-10^8 &lt;= target &lt;= 10^8</code></li>
</ul>
</div>