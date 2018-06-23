"""
749. 约翰的后花园
约翰想在他家后面的空地上建一个后花园，现在有两种砖，一种3 dm的高度，7 dm的高度。约翰想围成x dm的墙。如果约翰能做到，输出YES，否则输出NO。

样例
给出 x = 10，返回YES。

解释：
x = 3 + 7 : 即需要1匹3 dm高度的砖和1匹7 dm 高度的砖。
给出 x = 5，返回 NO。

"""


class Solution:
    """
    @param x: the wall's height
    @return: YES or NO
    """
    def isBuild(self, x):
        # write you code here
        temp=0
        if x>1000 or x<3:
            return "NO"
        while x%7!=0:
            x=x-3
            if x<3:
                temp=temp+1
                break
        while x%3!=0:
            x=x-7
            if x<3:
                temp=temp+1
                break
        if temp==2:
            return "NO"
        return "YES"
"""        
Accepted
100%
100% 数据通过测试总耗时 906 ms
您的提交打败了 63.10% 的提交!
"""

"""
java排行榜

lee835480135
1356ms

iridescent330
1356ms
DarkraiL
1357ms

roy72
1357ms

mseliuyang
1357ms
讨论
暂无话题

"""