import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tree {
    // TODO complete this Tree class to replicate the implementation from the Tree class in adts.py
    private Integer root;
    private List<Tree> subtrees;
    //
    public Tree(Integer root, List<Tree> subtrees) {
        this.subtrees = Objects.requireNonNullElseGet(subtrees, ArrayList::new);
        this.root = root;
    }
    public boolean isEmpty() {
        return this.root == null;
    }
    public int length() {
        if (this.subtrees == null) {
            return 0;
        }
        else {
            int l = 1;
            for (Tree subtree : this.subtrees) {
                l += subtree.length();
            }
            return this.subtrees.size();
        }
    }
    public int count(int item) {
        if (isEmpty()) {
            return 0;
        } else {
            int n = 0;
            if (this.root == item) {
                n += 1;
            }
            for (Tree subtree : this.subtrees) {
                n += subtree.count(item);
            }
            return n;
        }
    }
}
