#Checks if a route exists between two vertex in a graph
def  RouteExists(Vertex src, Vertex dest, Graph g):
    if src is None or dest is None:
        return False
    
    if g is None:
        return False

    parent = {src : None}
    start = [src]
    
    while start:
        next = []
        for u in start:
            neighbors = g.GetNeighbors(u)
            for v in neighbors:
                if v in parent:
                    continue
                if v == dest:
                    return True
                parent[v] = u
                next.Add(v)
        start = next
        
    return False
