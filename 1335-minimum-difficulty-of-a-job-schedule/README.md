<h2><a href="https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/">1335. Minimum Difficulty of a Job Schedule</a></h2><h3>Hard</h3><hr><div><p>You want to schedule a list of jobs in <code style="background: rgb(0, 9, 15) !important;">d</code> days. Jobs are dependent (i.e To work on the <code style="background: rgb(0, 9, 15) !important;">i<sup>th</sup></code> job, you have to finish all the jobs <code style="background: rgb(0, 9, 15) !important;">j</code> where <code style="background: rgb(0, 9, 15) !important;">0 &lt;= j &lt; i</code>).</p>

<p>You have to finish <strong>at least</strong> one task every day. The difficulty of a job schedule is the sum of difficulties of each day of the <code style="background: rgb(0, 9, 15) !important;">d</code> days. The difficulty of a day is the maximum difficulty of a job done on that day.</p>

<p>You are given an integer array <code style="background: rgb(0, 9, 15) !important;">jobDifficulty</code> and an integer <code style="background: rgb(0, 9, 15) !important;">d</code>. The difficulty of the <code style="background: rgb(0, 9, 15) !important;">i<sup>th</sup></code> job is <code style="background: rgb(0, 9, 15) !important;">jobDifficulty[i]</code>.</p>

<p>Return <em>the minimum difficulty of a job schedule</em>. If you cannot find a schedule for the jobs return <code style="background: rgb(0, 9, 15) !important;">-1</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/01/16/untitled.png" style="width: 365px; height: 370px;">
<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> jobDifficulty = [6,5,4,3,2,1], d = 2
<strong>Output:</strong> 7
<strong>Explanation:</strong> First day you can finish the first 5 jobs, total difficulty = 6.
Second day you can finish the last job, total difficulty = 1.
The difficulty of the schedule = 6 + 1 = 7 
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> jobDifficulty = [9,9,9], d = 4
<strong>Output:</strong> -1
<strong>Explanation:</strong> If you finish a job per day you will still have a free day. you cannot find a schedule for the given jobs.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre style="background: rgb(0, 9, 15) !important;"><strong>Input:</strong> jobDifficulty = [1,1,1], d = 3
<strong>Output:</strong> 3
<strong>Explanation:</strong> The schedule is one job per day. total difficulty will be 3.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code style="background: rgb(0, 9, 15) !important;">1 &lt;= jobDifficulty.length &lt;= 300</code></li>
	<li><code style="background: rgb(0, 9, 15) !important;">0 &lt;= jobDifficulty[i] &lt;= 1000</code></li>
	<li><code style="background: rgb(0, 9, 15) !important;">1 &lt;= d &lt;= 10</code></li>
</ul>
</div>