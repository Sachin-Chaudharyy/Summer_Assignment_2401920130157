class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        TreeNode root = buildTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, map);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int preSt, int preEnd, int[] inorder, int inSt, int inEnd, Map<Integer, Integer> map){
        if(preSt > preEnd || inSt > inEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preSt]);
        int rootIdx = map.get(root.val);
        int numsLeft = rootIdx - inSt;
        root.left = buildTree(preorder, preSt+1, preSt + numsLeft, inorder, inSt, rootIdx-1, map);
        root.right = buildTree(preorder, preSt + numsLeft + 1, preEnd, inorder, rootIdx + 1, inEnd, map);
        return root;
    }
}
