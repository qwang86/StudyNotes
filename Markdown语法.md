#Markdown 简明语法
Markdown是一种极简的『标记语言』，文件后缀一般为.md，可方便的转换为html进行发布于共享  

本文介绍Markdown的基本语法，作为入门之用。 
##0. 目录
[TOC]
##1. 标题
Markdown标语有2中表示方式，分别使用“=”“#”表示。  
写法： 

```
* 这是一级标题
====
这是二级标题
---
or
###三级标题
```
这是一级标题
====
这是二级标题
---
or
###三级标题  
##2. 段落与换行
Markdown的段落与换行，可以在文末2次回车（即两个空行）或使用2个空格键并回车，实现换行
 
##3. 引用
区块引用在段前（或行前）加上 >  
写法： 
```
>这是引用的内容
>>嵌套引用
```
效果：  
>这是引用的内容
>>嵌套引用  
##4. 列表  
无序列表，使用星号、加号或是减号作为列表标记
写法： 

```
* Red
+ Blue
- Yellow
```
* Red
+ Blue
- Yellow  
 
有序列表，使用数字作为列表标记  
```
1. line 1
2. line 2
3. line 3 
```
2. line 1
2. line 2
3. line 3  

##5. 代码块
Markdown中使用4个空格或1个制表符标示代码块。  
写法：
```
    这是代码块
    public static void main (string argp[]){
        System.out.println("demo show");
    }
```
显示效果：  

    这是代码块
    public static void main (string argp[]){
        System.out.println("demo show");
    }
##6. 分割线
使用连续的三个“-”、“_”  可标示分割线
写法：  
```
---
___
```
效果：  
---
___  
##7. 区段元素
###链接
Markdown 支持两种形式的链接语法： 行内式和参考式。
行内式链接，写法：  
```
this is [an example](http://www.example.com "Title Tips") inline link    
[c:]
链接地址支持相对路径：如，/logs/my.log
Title，为链接地址鼠标悬停tips        
this is [an example](http://www.example.com "Title Tips") inline link   
```
参考式链接与行内式类似，链接文字的括号后面再接上另一个方括号，而在第二个方括号里面要填入用以辨识链接的标记；接着，在文件的任意处，你可以把这个标记的链接内容定义出来。  
写法：  
```
I get 10 times more traffic from [Google] [1] than from
[Yahoo] [2] or [MSN] [3].

  [1]: http://google.com/        "Google"
  [2]: http://search.yahoo.com/  "Yahoo Search"
  [3]: http://search.msn.com/    "MSN Search"
链接内容定义的形式为：
- 方括号（前面可以选择性地加上至多三个空格来缩进），里面输入链接文字
- 接着一个冒号
- 接着一个以上的空格或制表符
- 接着链接的网址
- 选择性地接着 title 内容，可以用单引号、双引号或是括弧包着
```
效果：  
I get 10 times more traffic from [Google] [1] than from
[Yahoo] [2] or [MSN] [3].

  [1]: http://google.com/        "Google"
  [2]: http://search.yahoo.com/  "Yahoo Search"
  [3]: http://search.msn.com/    "MSN Search"    
### 斜体&粗体
写法：  
```
*这是斜体* 也可以这么_也可以这么写_
**这是粗体** 
```
效果：  
*这是斜体* 也可以这么_也可以这么写_   
**这是粗体**  
###段内代码
写法：
```
this is `code`  
代码部分使用(`)包括
```
this is `code`   
A single backtick in a code span: ` `` `
### 转义符
\作为Markdown语法中的转义符，起后接的任何字符都以本样显示，不再具备标记语法功能。  
如：  
\### 转义后 
###图片
与链接类似，分为行内式与参考式。
写法：  
```
行内式：  
![Alt text](/path/to/img.jpg) "Title"
链接内容定义的形式为：
- 一个惊叹号 !
- 接着一个方括号，里面放上图片的替代文字
- 接着一个普通括号，里面放上图片的网址，最后还可以用引号包住并加上选择性的'title' 文字。  
参考式：  
![Alt text][id]
[id]: url/to/image  "Optional title attribute"
```
效果：  
行内式：  
![Alt text](/path/to/img.jpg)  
参考式：  
![Alt text][id]
[id]: url/to/image  "Optional title attribute"  
###自动链接
部分文字Markdown会自动加链接
```
如：
<http://example.com/>
<address@example.com>
```
效果：  
<http://example.com/>  
<address@example.com>