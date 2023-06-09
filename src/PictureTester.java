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
    Picture beach = new Picture("C:\\Users\\User\\IdeaProjects\\SenayPixLabNew\\src\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testKeepOnlyBlue() {
    Picture beach = new Picture("C:\\Users\\User\\IdeaProjects\\SenayPixLabNew\\src\\snowman.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  public static void testNegate() {
    Picture beach = new Picture("C:\\Users\\User\\IdeaProjects\\SenayPixLabNew\\src\\barbaraS.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  public static void testGrayScale() {
    Picture beach = new Picture("C:\\Users\\User\\IdeaProjects\\SenayPixLabNew\\src\\koala.jpg");
    beach.explore();
    beach.grayScale();
    beach.explore();
  }
  public static void testFixUnderwater() {
    Picture water = new Picture("C:\\Users\\User\\IdeaProjects\\SenayPixLabNew\\src\\water.jpg");
    water.explore();
    water.fixUnderwater();
    water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\Users\\BT_LIBRARY_04\\IdeaProjects\\SenayPixLabNew\\src\\swan.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("/Users/alpsenay/IdeaProjects/SenayPixLabNew/src/swan.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }

  public static void testMirrorHorizontal() {
    Picture swan = new Picture("/Users/alpsenay/IdeaProjects/SenayPixLabNew/src/swan.jpg");
    swan.explore();
    swan.mirrorHorizontal();
    swan.explore();
  }

  public static void testMirrorHorizontalBotToTop() {
    Picture swan = new Picture("/Users/alpsenay/IdeaProjects/SenayPixLabNew/src/swan.jpg");
    swan.explore();
    swan.mirrorHorizontalBotToTop();
    swan.explore();
  }

  public static void testMirrorDiagonal() {
    Picture swan = new Picture("/Users/alpsenay/IdeaProjects/SenayPixLabNew/src/swan.jpg");
    swan.explore();
    swan.mirrorDiagonal();
    swan.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("/Users/alpsenay/IdeaProjects/SenayPixLabNew/src/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  public static void testMirrorArms() {
    Picture snow = new Picture("/Users/alpsenay/IdeaProjects/SenayPixLabNew/src/snowman.jpg");
    snow.explore();
    snow.mirrorArms();
    snow.explore();
  }

  public static void testMirrorGull() {
    Picture gull = new Picture("/Users/alpsenay/IdeaProjects/SenayPixLabNew/src/seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\Users\\User\\IdeaProjects\\SenayPixLabNew\\src\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
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
    //testGrayScale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testMirrorDiagonal();
    //testMirrorTemple();
    //testMirrorArms();
    testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}