/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */

// DFS
public class Solution {
	HashMap<Integer, UndirectedGraphNode> map = new HashMap<Integer, UndirectedGraphNode>();
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        return clone(node);
    }
    private UndirectedGraphNode clone(UndirectedGraphNode node){
    	if(node == null) return node;
    	if(map.containsKey(node.label)){
    		return map.get(node.label);
    	}
    	UndirectedGraphNode cloneNode = new UndirectedGraphNode(node.label);
    	map.put(cloneNode.label, cloneNode);
    	for(UndirectedGraphNode neighbor : node.neighbors){
    		cloneNode.neighbors.add(clone(neighbor));
    	}
    	return cloneNode;
    }
}