<h2><a href="https://leetcode.com/problems/copy-list-with-random-pointer/">138. Copy List with Random Pointer</a></h2><h3>Medium</h3><hr><div><p>A linked list of length <code style="">n</code> is given such that each node contains an additional random pointer, which could point to any node in the list, or <code style="">null</code>.</p>

<p>Construct a <a href="https://en.wikipedia.org/wiki/Object_copying#Deep_copy" target="_blank"><strong>deep copy</strong></a> of the list. The deep copy should consist of exactly <code style="">n</code> <strong>brand new</strong> nodes, where each new node has its value set to the value of its corresponding original node. Both the <code style="">next</code> and <code style="">random</code> pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. <strong>None of the pointers in the new list should point to nodes in the original list</strong>.</p>

<p>For example, if there are two nodes <code style="">X</code> and <code style="">Y</code> in the original list, where <code style="">X.random --&gt; Y</code>, then for the corresponding two nodes <code style="">x</code> and <code style="">y</code> in the copied list, <code style="">x.random --&gt; y</code>.</p>

<p>Return <em>the head of the copied linked list</em>.</p>

<p>The linked list is represented in the input/output as a list of <code style="">n</code> nodes. Each node is represented as a pair of <code style="">[val, random_index]</code> where:</p>

<ul>
	<li><code style="">val</code>: an integer representing <code style="">Node.val</code></li>
	<li><code style="">random_index</code>: the index of the node (range from <code style="">0</code> to <code style="">n-1</code>) that the <code style="">random</code> pointer points to, or <code style="">null</code> if it does not point to any node.</li>
</ul>

<p>Your code will <strong>only</strong> be given the <code style="">head</code> of the original linked list.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/12/18/e1.png" style="width: 700px; height: 142px;">
<pre style=""><strong>Input:</strong> head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
<strong>Output:</strong> [[7,null],[13,0],[11,4],[10,2],[1,0]]
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/12/18/e2.png" style="width: 700px; height: 114px;">
<pre style=""><strong>Input:</strong> head = [[1,1],[2,1]]
<strong>Output:</strong> [[1,1],[2,1]]
</pre>

<p><strong class="example">Example 3:</strong></p>

<p><strong><img alt="" src="https://assets.leetcode.com/uploads/2019/12/18/e3.png" style="width: 700px; height: 122px;"></strong></p>

<pre style=""><strong>Input:</strong> head = [[3,null],[3,0],[3,null]]
<strong>Output:</strong> [[3,null],[3,0],[3,null]]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code style="">0 &lt;= n &lt;= 1000</code></li>
	<li><code style="">-10<sup>4</sup> &lt;= Node.val &lt;= 10<sup>4</sup></code></li>
	<li><code style="">Node.random</code> is <code style="">null</code> or is pointing to some node in the linked list.</li>
</ul>
</div>