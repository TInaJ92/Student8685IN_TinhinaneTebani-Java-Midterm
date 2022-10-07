package databases;

import java.sql.ResultSet;
import java.text.Format;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;

public class UnitTestConnectDB {

    /**
     * Use this class to unit test the SharedStepsDatabase class
     */

    public static void main(String[] args) throws Exception {

        SharedStepsDatabase ssdb = new SharedStepsDatabase();

        // region ExecuteQueryReadOne
//        String query = "SELECT 1 FROM DUAL";
//        String result = ssdb.executeQueryReadOne(query);
//
//        System.out.println(result);
//        // endregion

        // region executeQueryReadAllSingleColumn
//        String queryTwo = "SELECT * FROM EMPLOYEES.EMPLOYEES LIMIT 10";
//        List<String> results = ssdb.executeQueryReadAllSingleColumn(queryTwo, 3);
//
//        for (String s : results) {
//            System.out.println(s);
//        }
//
        // endregion

        // region executeQueryReadAll
//        String queryThree = "SELECT * FROM EMPLOYEES.EMPLOYEES E " +
//                       "INNER JOIN EMPLOYEES.DEPT_EMP DE ON E.EMP_NO = DE.EMP_NO " +
//                       "WHERE E.FIRST_NAME LIKE 'Alain'";
//
//        List<List<String>> data = ssdb.executeQueryReadAll(queryThree);
//
//        if (data != null) {
//            for (List<String> row : data) {
//                for (String cell : row) {
//                    System.out.print(cell + "\t\t");
//                }
//                System.out.println();
//            }
//        }
//
        // endregion

        // region InsertString
//        ssdb.insertString("test_insert_string", "test_string", "Sami loves Aamna");
//        System.out.println(ssdb.executeQueryReadAllSingleColumn("SELECT * FROM TEST_INSERT_STRING", 2).get(0));
//
        // endregion

        // region insertList
//        List<Object> names = new ArrayList<>();
//        names.add("Student1");
//        names.add("Student2");
//
//        ssdb.insertList("test_insert_list", "test_list", names);
//
//        String query = "SELECT * FROM TEST_INSERT_LIST";
//        List<String> results = ssdb.executeQueryReadAllSingleColumn(query, "test_list");
//
//        for (String s: results) {
//            System.out.println(s);
//        }

        // endregion

        // region insertMap
//        HashMap<Object, Object> map = new HashMap<>();
//        map.put("Student1", 7934);
//        map.put("Student2", 6319);
//
//        ssdb.insertMap("test_insert_map", map);
//
//        String query = "SELECT * FROM TEST_INSERT_MAP";
//        List<List<String>> results = ssdb.executeQueryReadAll(query);
//
//        for (List<String> row : results) {
//            for (String cell : row) {
//                System.out.print(cell + "\t\t");
//            }
//            System.out.println();
//        }
//
        // endregion

        ssdb.closeResources();

    }
}
