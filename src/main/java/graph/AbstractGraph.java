package graph;

/**
 * An abstract class representing a graph. Can be inherited
 * from subclasses with specific graph implementations.
 * @param <T> The value type of our nodes.
 */
public abstract class AbstractGraph<T> {

    /**
     * Add a neighbor to the given vertex.
     * @param leftVertex The vertex to add a neighbor to.
     * @param rightVertex The neighbor to add for the vertex.
     */
    public abstract void addEdge(T leftVertex, T rightVertex);

    /**
     * Add a brand new vertex to this graph.
     * @param vertex The new vertex being added.
     */
    public abstract void addVertex(T vertex);

    /**
     * Remove a vertex as a neighbor from the given vertex.
     * @param leftVertex The vertex to remove a neighbor from.
     * @param rightVertex The neighbor vertex to remove.
     */
    public abstract void removeEdge(T leftVertex, T rightVertex);

    /**
     * Remove a vertex entirely from this graph. Will search through the 
     * graph's vertices to remove any edges based on this vertex.
     * @param vertex The vertex to add.
     */
    public abstract void removeVertex(T vertex);
}
