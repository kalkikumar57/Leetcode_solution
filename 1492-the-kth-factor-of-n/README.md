<h2><a href="https://leetcode.com/problems/the-kth-factor-of-n/">1492. The kth Factor of n</a></h2><h3>Medium</h3><hr><div element-id="1041"><p element-id="1040">You are given two positive integers <code element-id="1039">n</code> and <code element-id="1038">k</code>. A factor of an integer <code element-id="1037">n</code> is defined as an integer <code element-id="1036">i</code> where <code element-id="1035">n % i == 0</code>.</p>

<p element-id="1034">Consider a list of all factors of <code element-id="1033">n</code> sorted in <strong element-id="1032">ascending order</strong>, return <em element-id="1031">the </em><code element-id="1030">k<sup element-id="1029">th</sup></code><em element-id="1028"> factor</em> in this list or return <code element-id="1027">-1</code> if <code element-id="1026">n</code> has less than <code element-id="1025">k</code> factors.</p>

<p element-id="1024">&nbsp;</p>
<p element-id="1023"><strong class="example" element-id="1022">Example 1:</strong></p>

<pre element-id="1021"><strong element-id="1020">Input:</strong> n = 12, k = 3
<strong element-id="1019">Output:</strong> 3
<strong element-id="1018">Explanation:</strong> Factors list is [1, 2, 3, 4, 6, 12], the 3<sup element-id="1017">rd</sup> factor is 3.
</pre>

<p element-id="1016"><strong class="example" element-id="1015">Example 2:</strong></p>

<pre element-id="1014"><strong element-id="1013">Input:</strong> n = 7, k = 2
<strong element-id="1012">Output:</strong> 7
<strong element-id="1011">Explanation:</strong> Factors list is [1, 7], the 2<sup element-id="1010">nd</sup> factor is 7.
</pre>

<p element-id="1009"><strong class="example" element-id="1008">Example 3:</strong></p>

<pre element-id="1007"><strong element-id="1006">Input:</strong> n = 4, k = 4
<strong element-id="1005">Output:</strong> -1
<strong element-id="1004">Explanation:</strong> Factors list is [1, 2, 4], there is only 3 factors. We should return -1.
</pre>

<p element-id="1003">&nbsp;</p>
<p element-id="1002"><strong element-id="1001">Constraints:</strong></p>

<ul element-id="1000">
	<li element-id="999"><code element-id="998">1 &lt;= k &lt;= n &lt;= 1000</code></li>
</ul>

<p element-id="997">&nbsp;</p>
<p element-id="996"><strong element-id="995">Follow up:</strong></p>

<p element-id="994">Could you solve this problem in less than O(n) complexity?</p>
</div>