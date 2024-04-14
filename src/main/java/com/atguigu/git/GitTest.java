package com.atguigu.git;

/**
 * @ClassName GitTest
 * @Description 新创建的一个文件为红色表示未被git追踪到；
 * 添加到暂存区之后文件名变绿色，提交到本地库颜色恢复正常；
 * 修改提交到本地库的一个文件颜色会变蓝色；
 * 因为蓝色的文件已经被git追踪到，可以直接提交到本地库；
 *
 * Tips：合并分支发生冲突时：同一个文件同一个位置都修改了内容，且都提交到了本地库，
 * 此时再把hot-fix分支合并到master分支上必然会发生代码冲突。
 *
 * @Author @仇职
 * @Date 2024-04-14 9:17
 * @Version 1.0
 */
public class GitTest {
    public static void main(String[] args) {
        System.out.println("hello git!");
        System.out.println("hello git2!");
        System.out.println("hello git3!");
        System.out.println("hello git4!");
        System.out.println("hello git5!");
        System.out.println("hello git6!");
        System.out.println("这里是hot-fix分支代码");
        System.out.println("这里是hot-fix分支代码22222222222222");
        System.out.println("这里是hot-fix分支代码3333333333333333");
        System.out.println("这里是master分支代码33333333333333333");
        System.out.println("这里是hot-fix分支代码4444444444444444");
    }
}
