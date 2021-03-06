package org.jetbrains.postfixCompletion.templates;

/**
 * @author ignatov
 */
public class CastPostfixTemplateTest extends PostfixTemplateTestCase {
  @Override
  protected String getTestDataPath() { return "testData/templates/cast"; }

  public void testSingleExpression() { doTest(); } // jdk mock needed
  public void testVoidExpression()   { doTest(); }
}
