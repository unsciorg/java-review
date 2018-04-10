International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: `"a"`maps to `".-"`, `"b"` maps to `"-..."`, `"c"` maps to `"-.-."`, and so on.

For convenience, the full table for the 26 letters of the English alphabet is given below:

```
[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
```

Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

Return the number of different transformations among all words we have.

```
Example:
Input: words = ["gin", "zen", "gig", "msg"]
Output: 2
Explanation: 
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".
```

 

**Note:**

- The length of `words` will be at most `100`.
- Each `words[i]` will have length in range `[1, 12]`.
- `words[i]` will only consist of lowercase letters.



**翻译**

国际摩尔斯电码定义了一个标准编码，每个字母映射到一系列点和破折号，如下所示：`"a"`映射到`".-"`，`"b"`映射到`"-..."`，`"c"`映射到`"-.-."`等等。

为方便起见，英文字母的26个字母的全表如下：

```
[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
```

现在，给出一个单词列表，每个单词可以写成每个字母的莫尔斯码连接。例如，“cab”可以写成“-.-....-....-”（这是串联的“-.-。”+“-...”+“.-”）。我们将这种连接称为单词转换。

返回我们所有单词之间不同转换的数量。

不同的字母有可能拼接成相同的莫尔斯电码

请注意：

- 单词的数量至少在100个
- 每个单词的字符在2～13之间
- 每个单词只包含小写字母

