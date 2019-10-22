package graph.pointer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import graph.AbstractGraph;

/**
 * A graph representing by a list of nodes representing vertices and 
 * edges.
 */
public class PointerGraph extends AbstractGraph<Integer> {

    private Map<Integer, ArrayList<Integer>> graph;

    /**
     * Ye olde constructor.
     */
    public PointerGraph() {
        this.graph = new HashMap<Integer, ArrayList<Integer>>();
    }

    /**
     * Add a neighbor to the given vertex.
     * @param leftVertex The vertex to add a neighbor to.
     * @param rightVertex The neighbor to add for the vertex.
     */
    public void addEdge(Integer leftVertex, Integer rightVertex) {
        if (this.graph.containsKey(leftVertex)) {
            var neighbors = this.graph.get(leftVertex);
            if (!neighbors.contains(rightVertex)) {
                neighbors.add(leftVertex);
            }
        } else {
            this.addVertex(leftVertex);
            this.graph.get(leftVertex).add(rightVertex);
        }
    }

    /**
     * Add a brand new vertex to this graph.
     * @param vertex The new vertex being added.
     */
    public void addVertex(Integer vertex) {
        if (!this.graph.containsKey(vertex)) {
            this.graph.put(vertex, new ArrayList<>());
        }
    }

    /**
     * Remove a vertex as a neighbor from the given vertex.
     * @param leftVertex The vertex to remove a neighbor from.
     * @param rightVertex The neighbor vertex to remove.
     */
    public void removeEdge(Integer leftVertex, Integer rightVertex) {
        if (this.graph.containsKey(leftVertex)) {
            this.graph.get(leftVertex).remove(rightVertex);
        }
    }
    
    /**
     * Remove a vertex entirely from this graph. Will search through the 
     * graph's vertices to remove any edges based on this vertex.
     * @param vertex The vertex to add.
     */
    public void removeVertex(Integer vertex) {
        var iterator = this.graph.entrySet().iterator();
        while (iterator.hasNext()) {
            var pair = iterator.next();
            pair.getValue().remove(vertex);
        }
        if (this.graph.containsKey(vertex)) {
            this.graph.remove(vertex);
        }
    }    
}
