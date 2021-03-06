package com.fishercoder;

import com.fishercoder.common.classes.Point;
import com.fishercoder.solutions._149;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _149Test {
  private static _149.Solution1 solution1;
  private static Point[] points;

  @BeforeClass
  public static void setup() {
    solution1 = new _149.Solution1();
  }

  @Test
  public void test1() {
    points = new Point[] {new Point(0, 0), new Point(1, 65536), new Point(65536, 0)};
    assertEquals(2, solution1.maxPoints(points));
  }
}
