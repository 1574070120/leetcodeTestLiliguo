package com.liliguo.string.test.code;

import com.liliguo.string.test.code.publicObject.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @Author:liliguo
 * @Description:
 * @Date:Created in 1:56 下午 2020/5/13
 * <p>
 * 1019. 链表中的下一个更大节点
 * <p>
 * 给出一个以头节点 head 作为第一个节点的链表。链表中的节点分别编号为：node_1, node_2, node_3, ... 。
 * <p>
 * 每个节点都可能有下一个更大值（next larger value）：对于 node_i，如果其 next_larger(node_i) 是 node_j.val，那么就有 j > i 且  node_j.val > node_i.val，而 j 是可能的选项中最小的那个。如果不存在这样的 j，那么下一个更大值为 0 。
 * <p>
 * 返回整数答案数组 answer，其中 answer[i] = next_larger(node_{i+1}) 。
 * <p>
 * 注意：在下面的示例中，诸如 [2,1,5] 这样的输入（不是输出）是链表的序列化表示，其头节点的值为 2，第二个节点值为 1，第三个节点值为 5 。
 */
public class P1019LinkedNextBigger {

    public static void main(String[] args) {
        //2 1 5
        Node a = new Node(2);
        Node b = new Node(1);
        a.next = b;
        Node c = new Node(5);
        b.next = c;
        System.out.println(Arrays.toString(new P1019LinkedNextBigger().nextLargerNodes(a)));
    }

    public int[] nextLargerNodes(Node head) {
        if (head == null) return null;

        //首先把链表元素放到集合中去
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        //定义一个栈来存放最大的元素
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[list.size()];
        //从后往前遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            while(!stack.isEmpty() && list.get(i) >= stack.peek()){
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? 0 : stack.peek();
            stack.push(list.get(i));
        }

        return ans;
    }
}
