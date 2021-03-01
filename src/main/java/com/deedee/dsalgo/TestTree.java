package com.deedee.dsalgo;

import sun.reflect.generics.tree.Tree;

public class TestTree {
     private TreeNode root;

     public void insert(int value)
     {
          if(root == null)
          {
               root = new TreeNode(value);
          }
          else
          {
               root.insert(value);
          }
     }

     public void traverseInOrder()
     {
          if(root != null)
          {
               root.traverseInOrder();
          }
     }

     public void traversePreOrder()
     {
          if(root != null)
          {
               root.traversePreOrder();
          }
     }

     public void traversePostOrder()
     {
          if(root != null)
          {
               root.traversePostOrder();
          }
     }

     public TreeNode get(int value)
     {
          if(root != null)
          {
               return root.get(value);
          }
          else
          {
               return null;
          }
     }

     public int min()
     {
          if(root == null)
          {
               return Integer.MIN_VALUE;
          }
          else
          {
               return root.min();
          }
     }

     public int max()
     {
          if(root == null)
          {
               return Integer.MAX_VALUE;
          }
          else
          {
               return root.max();
          }
     }

     public void delete(int value)
     {
          //case 1; if node is a leaf node( either left or right to its parent), the parent can set the child
          //to null

          //case 2; if the node has one child, in order to delete it, the child replaces the node

          //case 3; if the node has 2 children (max), look for a replacement node either from left or rigt
          //if left, look for the highest left value
          //if right, look for the smallest left value

          root = delete(root, value);
     }

     private TreeNode delete(TreeNode subTreeNode, int value)
     {
          if(subTreeNode == null) return subTreeNode;

          if(value < subTreeNode.getData())
          {
               subTreeNode.setLeftChild(delete(subTreeNode.getLeftChild(), value));
          }
          else if (value > subTreeNode.getData())
          {
               subTreeNode.setRightChild(delete(subTreeNode.getRightChild(), value));
          }
          else
          {
               //cases 0, 1 with no children or 1 child
               if(subTreeNode.getLeftChild() == null)
               {
                    return subTreeNode.getRightChild();
               }
               else if (subTreeNode.getRightChild() == null)
               {
                    return subTreeNode.getLeftChild();
               }

               //case 3 - with 2 children - using smallest value from right side
               //replace node to delete with the smallest value
               subTreeNode.setData(subTreeNode.getRightChild().min());

               //then delete the node that has the smallest value
               subTreeNode.setRightChild(delete(subTreeNode.getRightChild(), subTreeNode.getData()));
          }

          return subTreeNode;
     }

}
