package backjoon_summer;

import java.util.Scanner;

public class Bj_200731_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Tree.child = new int[5][2];
		for (int i = 0; i < Tree.child.length; i++)
			for (int j = 0; j < Tree.child[i].length; j++)
				Tree.child[i][j] = Tree.EMPTY;

		Tree.N = sc.nextInt();
		for (int i = 0; i < Tree.N; i++) {
			Tree.P = sc.nextInt();
			if (Tree.P == -1)
				Tree.root = i;
			else
				Tree.insert(Tree.P, i);
		}

		Tree.pre_order(Tree.root);
		System.out.println();
		Tree.in_order(Tree.root);
		System.out.println();
		Tree.post_order(Tree.root);
		System.out.println();
	}

}

class Tree {
	static final int EMPTY = -1;
	static final int TREE_MAX_SIZE = 10000;
	static int child[][];

	static int root = 0, N, P; // ??

	static void insert(int parent_idx, int child_idx) {
		if (parent_idx == -1)
			root = child_idx;
		else if (child[parent_idx][0] == EMPTY)
			child[parent_idx][0] = child_idx;
		else if (child[parent_idx][1] == EMPTY)
			child[parent_idx][1] = child_idx;
		else {
		}
		// tree_node has left, right
	}

	static void pre_order(int cur) {
		int left = child[cur][0];
		int right = child[cur][1];
		System.out.println(String.valueOf(cur) + " ");
		if (left != EMPTY)
			pre_order(left);
		if (right != EMPTY)
			pre_order(right);
	}

	static void in_order(int cur) {
		int left = child[cur][0];
		int right = child[cur][1];

		if (left != EMPTY)
			pre_order(left);

		System.out.println(String.valueOf(cur) + " ");

		if (right != EMPTY)
			pre_order(right);
	}

	static void post_order(int cur) {
		int left = child[cur][0];
		int right = child[cur][1];

		if (left != EMPTY)
			pre_order(left);
		if (right != EMPTY)
			pre_order(right);

		System.out.println(String.valueOf(cur) + " ");

	}
}