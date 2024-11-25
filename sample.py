import matplotlib.pyplot as plt
import networkx as nx
from networkx.drawing.nx_agraph import graphviz_layout

# Define the steps and connections
steps = [
    ("Data Collection", ["Historical Weather Data", "Blood Pressure Data"]),
    ("Data Preprocessing", ["Cleaning", "Normalization", "Transformation"]),
    ("Transformation", ["Logarithmic Spiral Transformation", "Multipole Decomposition"]),
    ("Analysis", ["Pattern Detection", "Correlation Analysis"]),
    ("Evaluation", ["Comparing CONTRaFast and CONTRaComplete", "Validating Results"]),
    ("Output", ["Visualization of Patterns", "Predictive Insights"])
]

# Create a directed graph
G = nx.DiGraph()

# Add nodes and edges
for step, substeps in steps:
    G.add_node(step)
    for substep in substeps:
        G.add_node(substep)
        G.add_edge(step, substep)

# Position nodes using Graphviz layout
pos = graphviz_layout(G, prog='dot')

# Draw nodes
nx.draw_networkx_nodes(G, pos, node_color='lightblue', node_size=2000, alpha=0.8)

# Draw edges
nx.draw_networkx_edges(G, pos, arrows=True, connectionstyle='arc3,rad=0.1', width=2.0, alpha=0.5)

# Draw labels
nx.draw_networkx_labels(G, pos, font_size=12, font_weight='bold')

# Display the plot
plt.title('Data Science Workflow')
plt.axis('off')
plt.tight_layout()
plt.show()
