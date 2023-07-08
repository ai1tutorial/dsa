
Valid BST


class Solution {
    TreeNode prev = null;
    public boolean isValidBST(TreeNode root) {
        if(null==root){
            return true;
        }
        boolean left = isValidBST(root.left);
        if(null!=prev && prev.val>=root.val){
            return false;
        }
        prev = root;
        boolean right = isValidBST(root.right);   
        return left && right;
    }
}


LeetCode : 1506. Find Root of N-Ary Tree
class Solution {
    public Node findRoot(List<Node> tree) {
        Set<Node> set = new HashSet<>();
        List<Node> fullList = tree;
        for(Node n : tree){ 
            List<Node> childList = n.children;
            for(Node c : childList){
                set.add(c);
            }
        }
        fullList.removeAll(set);
        return fullList.get(0);
    }
}