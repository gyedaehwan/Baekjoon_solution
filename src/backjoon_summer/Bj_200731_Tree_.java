package backjoon_summer;

public class Bj_200731_Tree_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Tree {
	Tree left;
	Tree right;
	String self;

	Tree insert(String something) {
		if (self == null)
			self = something;

		else if (left == null) {
			left.self = something;
			return left;
		} else if (right == null) {
			right.self = something;
			return right;
		}

		return this;

	}
}