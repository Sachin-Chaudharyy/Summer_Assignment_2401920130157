class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;
        while(!queue.isEmpty()){
            int size = queue.size();
            Deque<Integer> level = new ArrayDeque<>();
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                if(leftToRight){
                    level.offerLast(node.val);
                }else{
                    level.offerFirst(node.val);
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            list.add(new ArrayList<>(level));
            leftToRight = !leftToRight;
        }
        return list;
    }
}
