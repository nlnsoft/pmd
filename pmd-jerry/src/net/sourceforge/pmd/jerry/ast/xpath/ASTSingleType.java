/* Generated By:JJTree: Do not edit this line. ASTSingleType.java */

package net.sourceforge.pmd.jerry.ast.xpath;

import net.sourceforge.pmd.jerry.ast.xpath.custom.ImageNode;

public class ASTSingleType extends ImageNode {
  public ASTSingleType(int id) {
    super(id);
  }

  public ASTSingleType(XPath2Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(XPath2ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
