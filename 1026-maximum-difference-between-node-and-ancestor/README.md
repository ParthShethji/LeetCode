<h2><a href="https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/">1026. Maximum Difference Between Node and Ancestor</a></h2><h3>Medium</h3><hr><div><p>Given the <code style="background: rgb(0, 9, 15) !important;">root</code> of a binary tree, find the maximum value <code style="background: rgb(0, 9, 15) !important;">v</code> for which there exist <strong>different</strong> nodes <code style="background: rgb(0, 9, 15) !important;">a</code> and <code style="background: rgb(0, 9, 15) !important;">b</code> where <code style="background: rgb(0, 9, 15) !important;">v = |a.val - b.val|</code> and <code style="background: rgb(0, 9, 15) !important;">a</code> is an ancestor of <code style="background: rgb(0, 9, 15) !important;">b</code>.</p>

<p>A node <code style="background: rgb(0, 9, 15) !important;">a</code> is an ancestor of <code style="background: rgb(0, 9, 15) !important;">b</code> if either: any child of <code style="background: rgb(0, 9, 15) !important;">a</code> is equal to <code style="background: rgb(0, 9, 15) !important;">b</code>&nbsp;or any child of <code style="background: rgb(0, 9, 15) !important;">a</code> is an ancestor of <code style="background: rgb(0, 9, 15) !important;">b</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/09/tmp-tree.jpg" style="width: 400px; height: 390px;">
<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> root = [8,3,10,1,6,null,14,null,null,4,7,13]
<strong>Output:</strong> 7
<strong>Explanation: </strong>We have various ancestor-node differences, some of which are given below :
|8 - 3| = 5
|3 - 7| = 4
|8 - 1| = 7
|10 - 13| = 3
Among all possible differences, the maximum value of 7 is obtained by |8 - 1| = 7.</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/09/tmp-tree-1.jpg" style="width: 250px; height: 349px;">
<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> root = [1,null,2,null,0,3]
<strong>Output:</strong> 3
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code style="background: rgb(0, 9, 15) !important;">[2, 5000]</code>.</li>
	<li><code style="background: rgb(0, 9, 15) !important;">0 &lt;= Node.val &lt;= 10<sup>5</sup></code></li>
</ul>
</div>