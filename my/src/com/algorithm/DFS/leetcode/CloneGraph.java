package com.algorithm.DFS.leetcode;

/**
 * Created by danzhu on 10/11/14.
 * Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.


 OJ's undirected graph serialization:
 Nodes are labeled uniquely.

 We use # as a separator for each node, and , as a separator for node label and each neighbor of the node.
 As an example, consider the serialized graph {0,1,2#1,2#2,2}.

 The graph has a total of three nodes, and therefore contains three parts as separated by #.

 First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
 Second node is labeled as 1. Connect node 1 to node 2.
 Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.
 Visually, the graph looks like the following:

 1
 / \
 /   \
 0 --- 2
 / \
 \_/
 */

/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */

public class CloneGraph {
    /* Wrong answer
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null)
            return null;

        HashSet<UndirectedGraphNode> visitedSet = new HashSet<UndirectedGraphNode>();
        return cloneGraphHelper(node, visitedSet);

    }

    private UndirectedGraphNode cloneGraphHelper(UndirectedGraphNode node, HashSet<UndirectedGraphNode> visitedSet) {
        visitedSet.add(node);
        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
        List<UndirectedGraphNode> neighbors = node.neighbors;
        for(UndirectedGraphNode neighbor : neighbors){
            if(!visitedSet.contains(neighbor))
                newNode.neighbors.add(cloneGraphHelper(neighbor, visitedSet));
        }
        visitedSet.remove(node);
        return newNode;
    }*/
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null)
            return null;

        HashMap<Integer, UndirectedGraphNode> visited = new HashMap<Integer, UndirectedGraphNode>();
        return cloneGraphHelper(node, visited);

    }

    private UndirectedGraphNode cloneGraphHelper(UndirectedGraphNode node, HashMap<Integer, UndirectedGraphNode> visited) {
        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
        visited.put(newNode.label, newNode);
        List<UndirectedGraphNode> neighbors = node.neighbors;
        for(UndirectedGraphNode neighbor : neighbors){
            if(!visited.containsKey(neighbor.label))
                newNode.neighbors.add(cloneGraphHelper(neighbor, visited));
            else
                newNode.neighbors.add(visited.get(neighbor.label));
        }
        return newNode;
    }
}
