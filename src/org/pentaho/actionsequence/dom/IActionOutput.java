/*
 * Copyright 2006 Pentaho Corporation.  All rights reserved. 
 * This software was developed by Pentaho Corporation and is provided under the terms 
 * of the Mozilla Public License, Version 1.1, or any later version. You may not use 
 * this file except in compliance with the license. If you need a copy of the license, 
 * please go to http://www.mozilla.org/MPL/MPL-1.1.txt. The Original Code is the Pentaho 
 * BI Platform.  The Initial Developer is Pentaho Corporation.
 *
 * Software distributed under the Mozilla Public License is distributed on an "AS IS" 
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to 
 * the license for the specific language governing your rights and limitations.
*/
package org.pentaho.actionsequence.dom;


/**
 * Convenience class used to distinguish action inputs from action outputs.
 * @author Angelo Rodriguez
 *
 */
public interface IActionOutput extends IActionInputVariable, IAbstractIOElement {

  /**
   * @return the mapped name if it exists, otherwise the input/output name is returned.
   */
  public String getPublicName();

  public String getVariableName();
  
  public void setValue(Object value);

  public Object getValue();
  
  public Boolean getBooleanValue();

  public Integer getIntValue();

  public String getStringValue();

  public String getStringValue(boolean replaceParamReferences);

  public boolean getBooleanValue(boolean defaultValue);

  public int getIntValue(int defaultValue);

  public String getStringValue(boolean replaceParamReferences, String defaultValue);

  public String getStringValue(String defaultValue);
  
  public void setMapping(String publicParamName);
  
  public IActionDefinition getActionDefinition();
}
