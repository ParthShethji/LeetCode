<h2><a href="https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/">1008. Construct Binary Search Tree from Preorder Traversal</a></h2><h3>Medium</h3><hr><div><p>Given an array of integers preorder, which represents the <strong>preorder traversal</strong> of a BST (i.e., <strong>binary search tree</strong>), construct the tree and return <em>its root</em>.</p>

<p>It is <strong>guaranteed</strong> that there is always possible to find a binary search tree with the given requirements for the given test cases.</p>

<p>A <strong>binary search tree</strong> is a binary tree where for every node, any descendant of <code style="background: rgb(0, 9, 15) !important;">Node.left</code> has a value <strong>strictly less than</strong> <code style="background: rgb(0, 9, 15) !important;">Node.val</code>, and any descendant of <code style="background: rgb(0, 9, 15) !important;">Node.right</code> has a value <strong>strictly greater than</strong> <code style="background: rgb(0, 9, 15) !important;">Node.val</code>.</p>

<p>A <strong>preorder traversal</strong> of a binary tree displays the value of the node first, then traverses <code style="background: rgb(0, 9, 15) !important;">Node.left</code>, then traverses <code style="background: rgb(0, 9, 15) !important;">Node.right</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/03/06/1266.png" style="height: 386px; width: 590px;">
<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> preorder = [8,5,1,7,10,12]
<strong>Output:</strong> [8,5,10,1,7,null,12]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> preorder = [1,3]
<strong>Output:</strong> [1,null,3]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code style="background: rgb(0, 9, 15) !important;">1 &lt;= preorder.length &lt;= 100</code></li>
	<li><code style="background: rgb(0, 9, 15) !important;">1 &lt;= preorder[i] &lt;= 1000</code></li>
	<li>All the values of <code style="background: rgb(0, 9, 15) !important;">preorder</code> are <strong>unique</strong>.</li>
</ul>
</div>