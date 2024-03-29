<h2><a href="https://leetcode.com/problems/determine-if-two-strings-are-close/">1657. Determine if Two Strings Are Close</a></h2><h3>Medium</h3><hr><div><p>Two strings are considered <strong>close</strong> if you can attain one from the other using the following operations:</p>

<ul>
	<li>Operation 1: Swap any two <strong>existing</strong> characters.

	<ul>
		<li>For example, <code style="background: rgb(0, 9, 15) !important;">a<u>b</u>cd<u>e</u> -&gt; a<u>e</u>cd<u>b</u></code></li>
	</ul>
	</li>
	<li>Operation 2: Transform <strong>every</strong> occurrence of one <strong>existing</strong> character into another <strong>existing</strong> character, and do the same with the other character.
	<ul>
		<li>For example, <code style="background: rgb(0, 9, 15) !important;"><u>aa</u>c<u>abb</u> -&gt; <u>bb</u>c<u>baa</u></code> (all <code style="background: rgb(0, 9, 15) !important;">a</code>'s turn into <code style="background: rgb(0, 9, 15) !important;">b</code>'s, and all <code style="background: rgb(0, 9, 15) !important;">b</code>'s turn into <code style="background: rgb(0, 9, 15) !important;">a</code>'s)</li>
	</ul>
	</li>
</ul>

<p>You can use the operations on either string as many times as necessary.</p>

<p>Given two strings, <code style="background: rgb(0, 9, 15) !important;">word1</code> and <code style="background: rgb(0, 9, 15) !important;">word2</code>, return <code style="background: rgb(0, 9, 15) !important;">true</code><em> if </em><code style="background: rgb(0, 9, 15) !important;">word1</code><em> and </em><code style="background: rgb(0, 9, 15) !important;">word2</code><em> are <strong>close</strong>, and </em><code style="background: rgb(0, 9, 15) !important;">false</code><em> otherwise.</em></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> word1 = "abc", word2 = "bca"
<strong>Output:</strong> true
<strong>Explanation:</strong> You can attain word2 from word1 in 2 operations.
Apply Operation 1: "a<u>bc</u>" -&gt; "a<u>cb</u>"
Apply Operation 1: "<u>a</u>c<u>b</u>" -&gt; "<u>b</u>c<u>a</u>"
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> word1 = "a", word2 = "aa"
<strong>Output:</strong> false
<strong>Explanation: </strong>It is impossible to attain word2 from word1, or vice versa, in any number of operations.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> word1 = "cabbba", word2 = "abbccc"
<strong>Output:</strong> true
<strong>Explanation:</strong> You can attain word2 from word1 in 3 operations.
Apply Operation 1: "ca<u>b</u>bb<u>a</u>" -&gt; "ca<u>a</u>bb<u>b</u>"
<code style="background: rgb(0, 9, 15) !important;">Apply Operation 2: "</code><u>c</u>aa<u>bbb</u>" -&gt; "<u>b</u>aa<u>ccc</u>"
Apply Operation 2: "<u>baa</u>ccc" -&gt; "<u>abb</u>ccc"
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code style="background: rgb(0, 9, 15) !important;">1 &lt;= word1.length, word2.length &lt;= 10<sup>5</sup></code></li>
	<li><code style="background: rgb(0, 9, 15) !important;">word1</code> and <code style="background: rgb(0, 9, 15) !important;">word2</code> contain only lowercase English letters.</li>
</ul>
</div>