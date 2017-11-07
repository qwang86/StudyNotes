#简介
Git是一种分布式版本控制系统，区别于SVN的集中式版本控制系统。Git并无中央版本库的概念,每个client都可以作为中央服务器进行版本的互相推送。
#安装
msysgit是 windows版的Git,可通过网络下载安装。其中Git Bash支持bash语法。本文操作均是在Git Bash中完成。
#基本操作
##一、初始化    
设定个人身份标识：  

    $git config --global user.name "yourname"
    $git config --global user.email "youremail" 
查看身份标识可使用：  

    $git config --global --list
##二、创建本地库
**1.init创建本地库** 
    
    $git init
**2.操作流程**  
git分为：工作区、暂存区、版本库   
**工作区**，即为系统中当前可见的文档及目录信息，用户的编辑修改即在此区域。
**暂存区/版本库**，是被工作区一个隐藏目录.git所标识的。    
**暂存区**，可简单理解为工作区与版本库之间的缓存地带，此处文件处于待提交状态。   
**版本库**，暂存区文件提交后即入版本库，每次commit系统会生产一个版本编号。  
使用Git提交文件到版本库有两步：    
&emsp;第一步：是使用 git add 把文件添加进去，实际上就是把文件添加到暂存区。   
&emsp;第二步：使用git commit提交更改，实际上就是把暂存区的所有内容提交到当前分支上

    未暂存区 (add) >>>> 暂存区 (commit) >>>> 本地库
**3.远程仓库**
远程仓库的操作分为两种，一种是
**3.多人协作**

**5.基本命令**

    $git status         //查看版本库状态，显示Untracked files、to be ommitted:信息
    $git add filename   //工作区filename文件加入暂存区
    $git commit filename -m "commit的备注信息"   
                        //暂存区文件提交版本库
    $git commit -m "commit的备注信息"  
                        //暂存区所有文件提交版本库
    $git diff  filename //查看XX文件修改了那些内容
    $git log            //查看版本日志
    $git reset  –hard HEAD^ 或者 git reset  –hard HEAD~ 
                        //回退到上一个版本(如果想回退到100个版本，使用git reset –hard HEAD~100 )
    $git reflog         //查看历史记录的版本号id
    $git checkout --filename    
                        //从暂存区checkout文件并覆盖工作区（撤销操作）
    $git remote add origin https://github.com/XXXXXX/XXXXXX         
                        //关联一个远程库
    $git push –u(第一次要用-u 以后不需要) origin master 
                        //把当前master分支推送到远程库
    $git clone https://github.com/XXXXX/XXXXXX 
                        //从远程库中克隆
    $git checkout –b dev//创建dev分支 并切换到dev分支上
    $git branch         //查看当前所有的分支
    $git merge dev      //在当前的分支上合并dev分支
    $git branch dev     //创建分支dev
    $git branch –d dev  //删除dev分支
参考文章：[推荐！手把手教你使用Git](http://blog.jobbole.com/78960/)