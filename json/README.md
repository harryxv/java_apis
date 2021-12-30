<h1>JSON</h1>

<p>JSON stands for JavaScript Object Notation.&nbsp;</p>

<p>JSON is a language-independent data format standard, using text to store and transmit data in Object.</p>

<p>JSON can be either an array or an object. Specifically off of json.org:

<p>JSON is built on two structures:
<ul>
<li>object: A collection of name/value pairs. In various languages, this is realized as an object, record, struct, dictionary, hash table, keyed list, or associative array.</li>
<li>An ordered list of values. In most languages, this is realized as an
array, vector, list, or sequence.
</li>
</ul>
<p>JSON object</p>
<ul>
    <li>A JSON object is delimited by curly bracket: {}</li>
    <li>A JSON object is a collection of&nbsp;of key-value pairs, separated by commas(,). each key value is separated by colon character(:);</li>
    <li>the key must be String data type, double quoted.&nbsp;</li>
    <li>the value can be one of below
        <ul>
            <li>a String, Number, boolean, or null data type</li>
            <li>an array, delimited by [].&nbsp;</li>
            <li>an object</li>
        </ul>
    </li>
</ul>

<p>one JSON object example:</p>

<pre style="line-height: 1.3; font-family: monospace, monospace; background-color: rgb(248, 249, 250); color: rgb(0, 0, 0); border: 1px solid rgb(234, 236, 240); padding: 1em; overflow-x: hidden; position: relative; font-size: 14px;">
<span class="p">{</span>
  <span>&quot;firstName&quot;</span><span class="p">:</span> <span class="s2" style="color: rgb(186, 33, 33);">&quot;John&quot;</span><span class="p">,</span>
  <span>&quot;lastName&quot;</span><span class="p">:</span> <span class="s2" style="color: rgb(186, 33, 33);">&quot;Smith&quot;</span><span class="p">,</span>
  <span>&quot;isAlive&quot;</span><span class="p">:</span> <span class="kc" style="color: rgb(0, 128, 0); font-weight: bold;">true</span><span class="p">,</span>
  <span>&quot;age&quot;</span><span class="p">:</span> <span class="mi" style="color: rgb(102, 102, 102);">27</span><span class="p">,</span>
  <span>&quot;address&quot;</span><span class="p">:</span> <span class="p">{</span>
    <span>&quot;streetAddress&quot;</span><span class="p">:</span> <span class="s2" style="color: rgb(186, 33, 33);">&quot;21 2nd Street&quot;</span><span class="p">,</span>
    <span>&quot;city&quot;</span><span class="p">:</span> <span class="s2" style="color: rgb(186, 33, 33);">&quot;New York&quot;</span><span class="p">,</span>
    <span>&quot;state&quot;</span><span class="p">:</span> <span class="s2" style="color: rgb(186, 33, 33);">&quot;NY&quot;</span><span class="p">,</span>
    <span>&quot;postalCode&quot;</span><span class="p">:</span> <span class="s2" style="color: rgb(186, 33, 33);">&quot;10021-3100&quot;</span>
  <span class="p">},</span>
  <span>&quot;phoneNumbers&quot;</span><span class="p">:</span> <span class="p">[</span>
    <span class="p">{</span>
      <span>&quot;type&quot;</span><span class="p">:</span> <span class="s2" style="color: rgb(186, 33, 33);">&quot;home&quot;</span><span class="p">,</span>
      <span>&quot;number&quot;</span><span class="p">:</span> <span class="s2" style="color: rgb(186, 33, 33);">&quot;212 555-1234&quot;</span>
    <span class="p">},</span>
    <span class="p">{</span>
      <span>&quot;type&quot;</span><span class="p">:</span> <span class="s2" style="color: rgb(186, 33, 33);">&quot;office&quot;</span><span class="p">,</span>
      <span>&quot;number&quot;</span><span class="p">:</span> <span class="s2" style="color: rgb(186, 33, 33);">&quot;646 555-4567&quot;</span>
    <span class="p">}</span>
  <span class="p">],</span>
  <span>&quot;children&quot;</span><span class="p">:</span> <span class="p">[],</span>
  <span>&quot;spouse&quot;</span><span class="p">:</span> <span class="kc" style="color: rgb(0, 128, 0); font-weight: bold;">null</span>
<span class="p">}</span></pre>

<p>&nbsp;</p>
