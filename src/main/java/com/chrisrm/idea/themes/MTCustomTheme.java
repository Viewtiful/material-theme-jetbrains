/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2017 Chris Magnussen and Elior Boukhobza
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 *
 */

package com.chrisrm.idea.themes;

import com.chrisrm.idea.MTCustomThemeConfig;
import com.chrisrm.idea.MTTheme;
import com.chrisrm.idea.MTThemes;

public final class MTCustomTheme extends MTTheme implements LafTheme {
  public static final String BACKGROUND = "263238"; // 38, 50, 56
  public static final String FOREGROUND = "B0BEC5"; // 176, 190, 197
  public static final String CARET = "FFCC00"; // 255, 204, 0
  public static final String BORDER = "222D33"; // 34, 45, 51
  public static final String TEXT = "607D8B"; // 96, 125, 139
  public static final String SELECTION_BACKGROUND = "546E7A"; // 84, 110, 122
  public static final String SELECTION_FOREGROUND = "FFFFFF";
  public static final String LABEL = "B0BEC5"; // 176, 190, 197
  public static final String SUB_LABEL = "546E7A"; // 84, 110, 122
  public static final String DISABLED = "2E3C43"; // 65, 89, 103
  public static final String SIDEBAR_HEADING = "CFD8DC"; // 207, 216, 220
  public static final String STATUS_LABEL = "78909C"; // 120, 144, 156
  public static final String INPUT_BORDER = "37474F"; //55, 71, 79
  public static final String BUTTON_BACKGROUND = "2C3C41"; // 44, 60, 65
  public static final String BUTTON_FOREGROUND = "607D8B"; // 96, 125, 139
  public static final String BUTTON_SELECTED = "314549"; // 49, 69, 73
  public static final String ACCENT_COLOR = "80CBC4"; // 128, 203, 196

  public MTCustomTheme() {
    super("mt.custom", "Material Theme - Custom", true, MTThemes.CUSTOM);
  }

  @Override
  public String getDisabled() {
    return DISABLED;
  }

  @Override
  protected String getTreeSelectionColorString() {
    return MTCustomThemeConfig.getInstance().getTreeSelectionColorString();
  }

  @Override
  protected String getButtonHighlightColorString() {
    return MTCustomThemeConfig.getInstance().getButtonHighlightColorString();
  }

  @Override
  protected String getHighlightColorString() {
    return MTCustomThemeConfig.getInstance().getHighlightColorString();
  }

  @Override
  protected String getSecondBorderColorString() {
    return MTCustomThemeConfig.getInstance().getSecondBorderColorString();
  }

  @Override
  protected String getTableSelectedColorString() {
    return MTCustomThemeConfig.getInstance().getTableSelectedColorString();
  }

  @Override
  protected String getContrastColorString() {
    return MTCustomThemeConfig.getInstance().getContrastColorString();
  }

  @Override
  protected String getDisabledColorString() {
    return MTCustomThemeConfig.getInstance().getDisabledColorString();
  }

  @Override
  protected String getSecondaryBackgroundColorString() {
    return MTCustomThemeConfig.getInstance().getSecondaryBackgroundColorString();
  }

  @Override
  protected String getCaretColorString() {
    return MTCustomThemeConfig.getInstance().getCaretColorString();
  }

  @Override
  protected String getInactiveColorString() {
    return MTCustomThemeConfig.getInstance().getInactiveColorString();
  }

  @Override
  protected String getSelectionForegroundColorString() {
    return MTCustomThemeConfig.getInstance().getSelectionForegroundColorString();
  }

  @Override
  protected String getSelectionBackgroundColorString() {
    return MTCustomThemeConfig.getInstance().getSelectionBackgroundColorString();
  }

  @Override
  protected String getTextColorString() {
    return MTCustomThemeConfig.getInstance().getTextColorString();
  }

  @Override
  protected String getForegroundColorString() {
    return MTCustomThemeConfig.getInstance().getForegroundColorString();
  }

  @Override
  protected String getBackgroundColorString() {
    return MTCustomThemeConfig.getInstance().getBackgroundColorString();
  }

}
