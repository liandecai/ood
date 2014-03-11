package com.ldc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest {
      public static void main(String[] args) {
          Pattern pp = Pattern.compile("^[ (（]*([A-Za-z0-9])[ ]*[、。.）\\)]{1}(.*?)$");
          String s = "A)SP系统会自动发送邮件，但需要在建项时选择“发邮件”选项";
          Matcher m = pp.matcher(s);
          System.out.println(m.group(1));
          System.out.println(m.group(2));
    }
}
