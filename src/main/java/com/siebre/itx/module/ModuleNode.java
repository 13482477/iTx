package com.siebre.itx.module;

import java.util.List;

/**
 * Created by jhonelee on 2017/9/5.
 */
public class ModuleNode {

    private String nodeName;

    private NodeType nodeType;

    private ModuleNode parent;

    private List<ModuleNode> children;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public NodeType getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeType nodeType) {
        this.nodeType = nodeType;
    }

    public ModuleNode getParent() {
        return parent;
    }

    public void setParent(ModuleNode parent) {
        this.parent = parent;
    }

    public List<ModuleNode> getChildren() {
        return children;
    }

    public void setChildren(List<ModuleNode> children) {
        this.children = children;
    }
}
