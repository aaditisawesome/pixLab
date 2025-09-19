/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection 
     Already existing
     */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Method to test edgeDetectionNew 
   * Enhanced edge detection with vertical detection by NEEV
   */
  public static void testEdgeDetectionNew()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetectionNew(10);
    swan.explore();
  }
  
  /** Method to test mirrorDiagonal *
   * BY NEEV
   */
  public static void testMirrorDiagonal()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.mirrorDiagonal();
    beach.explore();
  }

  /**
   * BY AADIT
   * Method to test the feature which fixes underwater images
   */
  public static void testFixUnderwater()
  {
    Picture underwater = new Picture("water.jpg");
    underwater.explore();
    underwater.fixUnderwater();
    underwater.explore();
  }

  public static void testColorSplash()
  {
    Picture koala = new Picture("koala.jpg");
    Picture koala2 = new Picture("koala.jpg");
    koala.explore();
    koala.colorSplashNoBlend(100, 250, 100, 250);
    koala.explore();
    koala2.colorSplash(100, 250, 100, 250, 20);
    koala2.explore();
  }
  
  /**
   * Method to test the vignette effect - Subtle Effect
   * Creates a gentle darkening effect from edges towards center
   * BY NEEV
   */
  public static void testApplyVignetteEffectSubtle()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.applyVignetteEffect(0.4, 0.6);  // 40% darkening, starts at 60% radius
    beach.explore();
  }
  
  /**
   * Method to test the vignette effect - Dramatic Effect
   * Creates a strong, noticeable vignette effect
   * BY NEEV
   */
  public static void testApplyVignetteEffectDramatic()
  {
    Picture butterfly = new Picture("butterfly1.jpg");
    butterfly.explore();
    butterfly.applyVignetteEffect(0.8, 0.3);  // 80% darkening, starts at 30% radius
    butterfly.explore();
  }
  
  /**
   * Method to test the vignette effect - Extreme Effect
   * Creates a very strong vignette with early onset
   * BY NEEV
   */
  public static void testApplyVignetteEffectExtreme()
  {
    Picture flower = new Picture("flower1.jpg");
    flower.explore();
    flower.applyVignetteEffect(0.95, 0.1);  // 95% darkening, starts at 10% radius
    flower.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetectionNew();
    //testEdgeDetection();
    //testEdgeDetectionNew();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    //testFixUnderwater();
    
    // Test vignette effects with different intensities
    testApplyVignetteEffectSubtle();
    testApplyVignetteEffectDramatic();
    testApplyVignetteEffectExtreme();
    testColorSplash();
  }
}