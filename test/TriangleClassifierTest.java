import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    void testClassifyTriangle2_2_2() {
        int[] inputSides = {2,2,2};
        String expected = "Tam giac deu";
        String actual = TriangleClassifier.classifyTriangle(inputSides);
        assertEquals(expected,actual);
    }

    @Test
    void testClassifyTriangle2_2_3() {
        int[] inputSides = {2,2,3};
        String expected = "Tam giac can";
        String actual = TriangleClassifier.classifyTriangle(inputSides);
        assertEquals(expected,actual);
    }

    @Test
    void testClassifyTriangle3_4_5() {
        int[] inputSides = {3,4,5};
        String expected = "Tam giac thuong";
        String actual = TriangleClassifier.classifyTriangle(inputSides);
        assertEquals(expected,actual);
    }

    @Test
    void testClassifyTriangle8_2_3() {
        int[] inputSides = {8,2,3};
        String expected = "Khong phai tam giac";
        String actual = TriangleClassifier.classifyTriangle(inputSides);
        assertEquals(expected,actual);
    }

    @Test
    void testClassifyTriangleNev1_2_1() {
        int[] inputSides = {-1,2,2};
        String expected = "Khong phai tam giac";
        String actual = TriangleClassifier.classifyTriangle(inputSides);
        assertEquals(expected,actual);
    }

    @Test
    void testClassifyTriangle0_1_1() {
        int[] inputSides = {0,1,1};
        String expected = "Khong phai tam giac";
        String actual = TriangleClassifier.classifyTriangle(inputSides);
        assertEquals(expected,actual);
    }
}