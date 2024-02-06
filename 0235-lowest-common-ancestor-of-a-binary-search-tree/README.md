<h2><a href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/">235. Lowest Common Ancestor of a Binary Search Tree</a></h2><h3>Medium</h3><hr><div><p>Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.</p>

<p>According to the <a href="https://en.wikipedia.org/wiki/Lowest_common_ancestor" target="_blank">definition of LCA on Wikipedia</a>: “The lowest common ancestor is defined between two nodes <code style="background: rgb(0, 9, 15) !important;">p</code> and <code style="background: rgb(0, 9, 15) !important;">q</code> as the lowest node in <code style="background: rgb(0, 9, 15) !important;">T</code> that has both <code style="background: rgb(0, 9, 15) !important;">p</code> and <code style="background: rgb(0, 9, 15) !important;">q</code> as descendants (where we allow <strong>a node to be a descendant of itself</strong>).”</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/14/binarysearchtree_improved.png" style="width: 200px; height: 190px;">
<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
<strong>Output:</strong> 6
<strong>Explanation:</strong> The LCA of nodes 2 and 8 is 6.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/14/binarysearchtree_improved.png" style="width: 200px; height: 190px;">
<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
<strong>Output:</strong> 2
<strong>Explanation:</strong> The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> root = [2,1], p = 2, q = 1
<strong>Output:</strong> 2
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code style="background: rgb(0, 9, 15) !important;">[2, 10<sup>5</sup>]</code>.</li>
	<li><code style="background: rgb(0, 9, 15) !important;">-10<sup>9</sup> &lt;= Node.val &lt;= 10<sup>9</sup></code></li>
	<li>All <code style="background: rgb(0, 9, 15) !important;">Node.val</code> are <strong>unique</strong>.</li>
	<li><code style="background: rgb(0, 9, 15) !important;">p != q</code></li>
	<li><code style="background: rgb(0, 9, 15) !important;">p</code> and <code style="background: rgb(0, 9, 15) !important;">q</code> will exist in the BST.</li>
</ul>
</div>