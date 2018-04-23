package projects.studentdatabase;

import java.util.TreeMap;
import java.lang.StringBuilder;

/**
 * <h1>CourseCatalog</h1>
 * The CourseCatalog class provides a listing of course codes and their associated
 * course descriptions
 *
 * @author Jeremy Bruce Adams
 * @version 0.1.0
 * @since 2018-04-03
 */

public class CourseCatalog {

    /**
     * get a map of the course catalog
     * @return TreeMap<Integer, String>
     *     K - course code
     *     V - course description
     */
    public static TreeMap<Integer,String> getCourseCatalog() {
        TreeMap<Integer, String> cc = new TreeMap<Integer, String>();
        cc.put(1, "History 101");
        cc.put(2, "Mathematics 101");
        cc.put(3, "English 101");
        cc.put(4, "Chemistry 101");
        cc.put(5, "Computer Science 101");
        return cc;
    }

    /**
     * print the course catalog (course codes and descriptions)
     */
    public static void printCourseCatalog() {
        StringBuilder sb = new StringBuilder();
        TreeMap<Integer, String> cc = getCourseCatalog();
        sb.append("Course Catalog:\n");

        for (int key : cc.keySet()) {
            sb.append(key + " - " + cc.get(key) + "\n");
        }

        System.out.println(sb.toString());
    }
}
